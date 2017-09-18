package com.hfxt.cmp.controller.clazz;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.SimpleFormatter;

import com.hfxt.cmp.model.Clazz;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;


public class ExportExcelUtil {
	  private final static String excel2003L =".xls";    //2003- 版本的excel  
	  private final static String excel2007U =".xls";   //2007+ 版本的excel 
	
	 public  File getExcelDemoFile(String fileDir) throws Exception{  
	        String classDir = null;  
	        String fileBaseDir = null;  
	        File file = null;  
	        classDir = Thread.currentThread().getContextClassLoader().getResource("/").getPath();  
	        fileBaseDir = classDir.substring(0, classDir.lastIndexOf("classes"));  
	        file = new File(fileBaseDir+fileDir);
	        if(!file.exists()){  
	            throw new Exception("模板文件不存在！");  
	        }  
	        return file;  
	    }  
	 public  Workbook getWorkbook(InputStream inStr,String fileName) throws Exception{  
	        Workbook wb = null;  
	        String fileType = fileName.substring(fileName.lastIndexOf("."));  
	        if(excel2003L.equals(fileType)){  
	            wb = new HSSFWorkbook(inStr);  //2003-  
	        }else if(excel2007U.equals(fileType)){  
	            wb = new HSSFWorkbook(inStr);  //2007+  
	        }else{  
	            throw new Exception("解析的文件格式有误！");  
	        }  
	        return wb;  
	    } 
	    public  Workbook writeNewExcel(File file,String sheetName,List<Clazz> lis) throws Exception{
	        Workbook wb = null;  
	        Row row = null;   
	        Cell cell = null;  
	          
	        FileInputStream fis = new FileInputStream(file);  
	        wb = new ExportExcelUtil().getWorkbook(fis, file.getName());//获取工作薄  
	        Sheet sheet = wb.getSheet(sheetName);  
	        
	        //循环插入数据  
	        
	        CellStyle cs = setSimpleCellStyle(wb);
	        int lastRow = sheet.getLastRowNum();    //插入数据的数据ROW
	        row = sheet.createRow(lastRow);//Excel单元格样式
	        cell = row.createCell(0); 
	        cell.setCellValue("          班级信息一览表   ");
	        cell.setCellStyle(cs);
	        row = sheet.createRow(lastRow+1);//Excel单元格样式
	        cell = row.createCell(0);
            cell.setCellValue("班级id");
            cell.setCellStyle(cs);  
              
            cell = row.createCell(1);
            cell.setCellValue("班级名称");
            cell.setCellStyle(cs);  
              
            cell = row.createCell(2);
            cell.setCellValue("学生人数");
            cell.setCellStyle(cs);
              
            cell = row.createCell(3);
            cell.setCellValue("班级编号");
            cell.setCellStyle(cs);  

            cell = row.createCell(4);
            cell.setCellValue("开班时间");
            cell.setCellStyle(cs);
	        //合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列  
	        sheet.addMergedRegion(new CellRangeAddress(0,0,0,4));
	        for (int i = 0; i < lis.size(); i++) {  
	            row = sheet.createRow(lastRow+i+2); //创建新的ROW，用于数据插入
	            //按项目实际需求，在该处将对象数据插入到Excel中  
	            Clazz vo  = lis.get(i);
	            if(null==vo){
	                break;
	            }
	            //Cell赋值开始  
	            cell = row.createCell(0);
	            cell.setCellValue(vo.getClazzid());
	            cell.setCellStyle(cs);  
	              
	            cell = row.createCell(1);
	            cell.setCellValue(vo.getClassname());
	            cell.setCellStyle(cs);  
	              
	            cell = row.createCell(2);
	            cell.setCellValue(vo.getStunum());
	            cell.setCellStyle(cs);
	              
	            cell = row.createCell(3);
	            cell.setCellValue(vo.getClasscode());
	            cell.setCellStyle(cs);
	            
	            cell = row.createCell(4);
	            cell.setCellValue( new SimpleDateFormat("yyyy-MM-dd").format(vo.getClassbegintime()));
	            cell.setCellStyle(cs);
	            
	          
	        }  
	        return wb;  
	    }  
	    
	    /** 
	     * 描述：设置简单的Cell样式 
	     * @return 
	     */  
	    public  CellStyle setSimpleCellStyle(Workbook wb){  
	        CellStyle cs = wb.createCellStyle();  
	          
	        cs.setBorderBottom(CellStyle.BORDER_THIN); //下边框  
	        cs.setBorderLeft(CellStyle.BORDER_THIN);//左边框  
	        cs.setBorderTop(CellStyle.BORDER_THIN);//上边框  
	        cs.setBorderRight(CellStyle.BORDER_THIN);//右边框  
	        cs.setAlignment(CellStyle.ALIGN_CENTER); // 居中  
	        
	        return cs;  
	    }  
	  
	}  


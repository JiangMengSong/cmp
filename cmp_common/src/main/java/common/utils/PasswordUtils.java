package common.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

public class PasswordUtils {

	/**
	 * 加密密码<br/>
	 * 先Md5Hex加密,再ShaHex加密
	 */
	public static String encryptPassword(String pwd) {
		if (StringUtils.isBlank(pwd)) {
			return null;
		}
		return DigestUtils.sha1Hex(DigestUtils.md5Hex(pwd));
	}

	/**
	 * 加密密码<br/>
	 * 先Md5Hex加密,再ShaHex加密,带盐值的
	 */
	public static String encryptPassword(String pwd, String salt) {
		if (StringUtils.isBlank(pwd)) {
			return null;
		}
		return encryptPassword(pwd + "{" + salt + "}");
	}

	public static void main(String[] args) {
//		int i = 6;
//		i += i++;
//		System.out.println(i);
		System.out.println(encryptPassword("123", "12345654321123456"));
	}
}

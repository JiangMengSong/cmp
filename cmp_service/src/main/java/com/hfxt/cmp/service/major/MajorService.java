package com.hfxt.cmp.service.major;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hfxt.cmp.model.Major;

@Transactional
public interface MajorService {

	List<Major> majorList();
}

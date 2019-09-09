package com.hwd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwd.dao.Test;
import com.hwd.domain.TestMapper;
import com.hwd.service.TestService;
/**
 * 
    * @ClassName: TestServiceImpl
    * @Description: 我的service层 里面概括
    * @author De.nnn
    * @date 2019年9月4日
    *
 */
@Service
public class TestServiceImpl implements TestService{
	@Autowired
	private TestMapper mapper;

	@Override
	public List<Test> select() {
		// TODO Auto-generated method stub
		return mapper.select();
	}
	
	
}

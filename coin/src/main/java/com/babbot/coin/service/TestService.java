package com.babbot.coin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babbot.coin.mapper.TestMapper;
import com.babbot.coin.vo.TestVO;

@Service
public class TestService {
	
    @Autowired
    private TestMapper testDao;

    public List<TestVO> getTestList() {
        // TODO Auto-generated method stub
        return testDao.selectTests();
    }
}
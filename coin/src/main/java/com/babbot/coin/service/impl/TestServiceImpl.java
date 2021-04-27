package com.babbot.coin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babbot.coin.mapper.TestMapper;
import com.babbot.coin.service.TestService;
import com.babbot.coin.vo.TestVO;


@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testDao;

    @Override
    public List<TestVO> getTestList() {
        // TODO Auto-generated method stub
        return testDao.selectTests();
    }
}
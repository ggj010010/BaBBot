package com.babbot.coin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.babbot.coin.vo.TestVO;

@Mapper
public interface TestMapper {
    public List<TestVO> selectTests();
}

package com.babbot.coin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.babbot.coin.vo.CoinMst;

//@Mapper
@Repository
public class CoinMstDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
    public List<CoinMst> selectListCoinMst(){
    	return sqlSessionTemplate.selectList("CoinMstMapper.selectListCoinMst");
    }

	public List<CoinMst> selectOneCoinMst(String coinSymbol){
		return sqlSessionTemplate.selectOne("CoinMstMapper.selectOneCoinMst",coinSymbol);
	}

	public int insertCoinMst(CoinMst coinMst) {
		return sqlSessionTemplate.insert("CoinMstMapper.insertCoinMst",coinMst);
	}

	public int updateCoinMst(CoinMst coinMst) {
		return sqlSessionTemplate.update("CoinMstMapper.updateCoinMst",coinMst);
	}

	public int deleteCoinMst(String coinSymbol) {
		return sqlSessionTemplate.delete("CoinMstMapper.deleteCoinMst",coinSymbol);
	}
}

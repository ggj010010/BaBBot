package com.babbot.coin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.babbot.coin.vo.CoinMst;

@Mapper
public interface CoinMstMapper {
    public List<CoinMst> selectListCoinMst();

	public List<CoinMst> selectOneCoinMst(String coinSymbol);

	public int insertCoinMst(CoinMst coinMst);

	public int updateCoinMst(CoinMst coinMst);

	public int deleteCoinMst(String coinSymbol);
}

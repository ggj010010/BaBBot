package com.babbot.coin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babbot.coin.mapper.CoinMstMapper;
import com.babbot.coin.vo.CoinMst;

@Service
public class CoinMstService {
	
    @Autowired
    private CoinMstMapper coinDao;
//Sival
    public List<CoinMst> searchCoinMst() {
        // TODO Auto-generated method stub
        return coinDao.selectListCoinMst();
    }

	public List<CoinMst> detailCoinMst(String coinSymbol) {
		// TODO Auto-generated method stub
		return coinDao.selectOneCoinMst(coinSymbol);
	}

	public int createCoinMst(CoinMst coinMst) {
		// TODO Auto-generated method stub
		return coinDao.insertCoinMst(coinMst);
	}

	public int modifyCoinMst(String coinSymbol, CoinMst coinMst) {
		// TODO Auto-generated method stub
		coinMst.coinSymbol = coinSymbol;
		return coinDao.updateCoinMst(coinMst);
	}

	public int removeCoinMst(String coinSymbol) {
		// TODO Auto-generated method stub
		return coinDao.deleteCoinMst(coinSymbol);
	}
}
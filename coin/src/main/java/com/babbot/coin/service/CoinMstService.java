package com.babbot.coin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babbot.coin.dao.CoinMstDao;
import com.babbot.coin.vo.CoinMst;

@Service
public class CoinMstService {
	
    @Autowired
    private CoinMstDao coinMstDao;
//	private CoinMstMapper coinMstDao;

    public List<CoinMst> searchCoinMst() {
        // TODO Auto-generated method stub
        return coinMstDao.selectListCoinMst();
    }

	public List<CoinMst> detailCoinMst(String coinSymbol) {
		// TODO Auto-generated method stub
		return coinMstDao.selectOneCoinMst(coinSymbol);
	}

	public int createCoinMst(CoinMst coinMst) {
		// TODO Auto-generated method stub
		return coinMstDao.insertCoinMst(coinMst);
	}

	public int modifyCoinMst(String coinSymbol, CoinMst coinMst) {
		// TODO Auto-generated method stub
		coinMst.coinSymbol = coinSymbol;
		return coinMstDao.updateCoinMst(coinMst);
	}

	public int removeCoinMst(String coinSymbol) {
		// TODO Auto-generated method stub
		return coinMstDao.deleteCoinMst(coinSymbol);
	}
}
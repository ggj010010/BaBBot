package com.babbot.coin.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.babbot.coin.service.CoinMstService;
import com.babbot.coin.vo.CoinMst;

@RestController
public class CoinMstController {
	
	@Autowired
	CoinMstService coinMstService;
	
	@GetMapping("/coin/coin-masters")
	public @ResponseBody List<CoinMst> searchCoinMst(){
		return coinMstService.searchCoinMst();
	}

	@GetMapping("/coin/coin-masters/{coinSymbol}")
	public @ResponseBody List<CoinMst> detailCoinMst(@PathVariable String coinSymbol){
		return coinMstService.detailCoinMst(coinSymbol);
	}
	
	@PostMapping("/coin/coin-masters")
	public int createCoinMst(@Valid @RequestBody CoinMst coinMst){
		return coinMstService.createCoinMst(coinMst);
	}
	
	@PutMapping("/coin/coin-masters/{coinSymbol}")
	public int modifyCoinMst(@PathVariable String coinSymbol, @RequestBody CoinMst coinMst){
		return coinMstService.modifyCoinMst(coinSymbol, coinMst);
	}

	@DeleteMapping("/coin/coin-masters/{coinSymbol}")
	public int removeCoinMst(@PathVariable String coinSymbol){
		return coinMstService.removeCoinMst(coinSymbol);
	}
	
}

package com.babbot.coin.vo;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CoinMst {
	public String coinSymbol;
	public String coinNameKor;
	public String coinNameEng;
	public Date createDt;
	public int createUserNo;
	public Date modifyDt;
	public int modifyUserNo;
}

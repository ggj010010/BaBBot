package com.babbot.coin.vo;

import java.sql.Date;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CoinMst {
	
	@NotBlank(message = "coinSymbol 값이 없습니다.")
	public String coinSymbol;
	public String coinNameKor;	
	@NotBlank(message = "coinNameEng 값이 없습니다.")
	public String coinNameEng;
	public Date createDt;
	public int createUserNo;
	public Date modifyDt;
	public int modifyUserNo;
}

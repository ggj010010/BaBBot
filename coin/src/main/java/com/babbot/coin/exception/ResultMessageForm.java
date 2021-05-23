package com.babbot.coin.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultMessageForm {
	private String code;

	private String description;

	private String detail;

	public ResultMessageForm(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public ResultMessageForm(String code, String description, String detail) {
		this.code = code;
		this.description = description;
		this.detail = detail;
	}
}

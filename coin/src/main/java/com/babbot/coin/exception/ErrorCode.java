package com.babbot.coin.exception;

import lombok.Getter;

public enum ErrorCode {
	NOT_NULL("ERR400_01","필수값이 누락되었습니다");
	
	@Getter
	private String code;

    @Getter
    private String description;

    ErrorCode(String code, String description) {
        this.code = code;
        this.description = description;
    }
}

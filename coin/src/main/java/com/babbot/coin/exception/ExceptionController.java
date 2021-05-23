package com.babbot.coin.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(basePackages = "com.babbot.coin.controller")
@RestController
public class ExceptionController {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResultMessageForm> methodArgumentNotValidException(MethodArgumentNotValidException e,
			HttpServletRequest request) {

		ResultMessageForm errorResponse = makeErrorResponse(e.getBindingResult());
		return new ResponseEntity<ResultMessageForm>(errorResponse, HttpStatus.BAD_REQUEST);
	}

	private ResultMessageForm makeErrorResponse(BindingResult bindingResult) {
		String code = "";
		String description = "";
		String detail = "";

		if (bindingResult.hasErrors()) {
			// VO에 설정한 meaasge값을 가져온다
			detail = bindingResult.getFieldError().getDefaultMessage();

			// VO에 유효성체크를 걸어놓은 어노테이션명을 가져온다.
			String bindResultCode = bindingResult.getFieldError().getCode();

			switch (bindResultCode) {
			case "NotBlank":
				code = ErrorCode.NOT_NULL.getCode();
				description = ErrorCode.NOT_NULL.getDescription();
				break;
			}

		}
		return new ResultMessageForm(code, description, detail);
	}
}

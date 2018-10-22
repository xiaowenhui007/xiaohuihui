package com.huihui.miaosha.exception;



import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
@ResponseBody
public class GlobaExceptionHandele {

//	@ExceptionHandler(value=Exception.class)
//	public Result<String> exceptionHandle(HttpServletRequest request,Exception e){
//
//		if(e instanceof BindException) {
//			BindException bindException=(BindException)e;
//			List<ObjectError> objerror=bindException.getAllErrors();
//			ObjectError  error=objerror.get(0);
//			String massage=error.getDefaultMessage();
////			return Result.error(cm)
//		}
////		aa(1, "", "", "");
////		return
//	}



	public static void aa(String[] args, Object...string) {
		List list = Arrays.asList(new Object[]{"a", "b", "c"});
		list.get(0);

		for (String arg: args) {

		}
	}
}

package controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyCentralExcpetionHandler {


	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandler(Model model) {
		System.out.println("Exception handled inside exceptionHandler() : NullPointerExceptionOccur");
		model.addAttribute("error","Exception handled inside exceptionHandler() : NullPointerExceptionOccur");
		return "error_page";
	}
	
	@ExceptionHandler(value= NumberFormatException.class)
	public String secondhandler(Model m) {
		System.out.println("NumberFormatExceptionHandler method has been executed ");
		m.addAttribute("error","NumberFormatException has Occured/ executed ");
		return "error_page";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value= Exception.class)
	public String GenericExcpetionHadling(Model model) {
		System.out.println("Excpetion Has Been Occured");
		model.addAttribute("error","Excpetion has been Occured");
		return "error_page";
	}
}

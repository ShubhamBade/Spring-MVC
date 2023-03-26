package controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
/* @RequestMapping("/chand") */
public class MvcController {

	@RequestMapping(path="/con", method= RequestMethod.GET)
	public String getPage(Model model) {
		model.addAttribute("name","Shubham Bade");
		//we can redirect using redirect:/ path here we are re-directing towards the dispaly
		return "redirect:/dis";
	}
	
	@RequestMapping("/dis")
	public String show(Model model) {
		model.addAttribute("name","Shuham Bade");
		model.addAttribute("version","Spring-mvc 5.2.3");
		List<String> list= new ArrayList<String>();
		list.add("Model");
		list.add("Controller");
		list.add("View");
		
		model.addAttribute("f",list);
		
		return "displayData";
	}
	
	@RequestMapping("/mmv")
	public ModelAndView setdata() {
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.addObject("name","Shubham");
		List<String> list= new ArrayList<String>();
		list.add("First Name: Shubham");
		list.add("Last Name: Bade");
		modelAndView.addObject("data",list);
		modelAndView.setViewName("modelandview");
		return modelAndView;
	}
	
	@RequestMapping("/form")
	public String form() {
		return "HtmlForm";
	}
	
	@RequestMapping(path="/processData",method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String mail,@RequestParam("pass1") String password, Model model) {
		System.out.println("Email : "+mail);
		System.out.println("Password : "+password);
		
		model.addAttribute("email",mail);
		model.addAttribute("password",password);
		return "sucess";
	}
	
	@RequestMapping("/reg")
	public String reg() {
		return "reg";
	}
	
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	public String processForm(@ModelAttribute User user,BindingResult bindingResult) {
		/*
		 * System.out.println(name); model.addAttribute("name", name);
		 * 
		 * User user= new User(); user.setName(name); System.out.println(user); return
		 * 
		 * "output";
		 */
		if(bindingResult.hasErrors())
			return "redirect:/reg";
		
		if(user.getName().isEmpty())
			return "redirect:/reg";
		System.out.println(user);
		return "output";
	}
	
	@ModelAttribute
	public String reusue(Model model) {
		model.addAttribute("desc","Designed By @Spring MVC Framework : SB");
		return null;
	}
	
	@RequestMapping("/viewRedirect")
	public RedirectView fire() {
		RedirectView redirectView= new RedirectView();
		redirectView.setUrl("displayview");
		return redirectView;
	}
	
	@RequestMapping("/displayview")
	public String displayView() {
		System.out.println("inside DisplayView");
		return "HtmlForm";
	}
	
	@RequestMapping("/book/{id}/{name}")
	public String pathVarHandler(@PathVariable("id") int id,@PathVariable("name") String name) {
		System.out.println("Path variable value bind with url variable : id : "+id+"\t Name :"+name);
		return null;
	}
	
	//Exception handling in spring MVC
	
	@RequestMapping("/exception")
	public String pageHandler() {
		
		String str= null;
		System.out.println(str.length());
		return "exception";
	}
	
	@RequestMapping("/exception2")
	public String pagehandleer2() {
		
		String name="Shubham";
		Integer i=Integer.parseInt(name);
		return "exception";
	}
//	
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = NullPointerException.class)
//	public String exceptionHandler(Model model) {
//		System.out.println("Exception handled inside exceptionHandler() : NullPointerExceptionOccur");
//		model.addAttribute("error","Exception handled inside exceptionHandler() : NullPointerExceptionOccur");
//		return "error_page";
//	}
//	
//	@ExceptionHandler(value= NumberFormatException.class)
//	public String secondhandler(Model m) {
//		System.out.println("NumberFormatExceptionHandler method has been executed ");
//		m.addAttribute("error","NumberFormatException has Occured/ executed ");
//		return "error_page";
//	}
//	
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value= Exception.class)
//	public String GenericExcpetionHadling(Model model) {
//		System.out.println("Excpetion Has Been Occured");
//		model.addAttribute("error","Excpetion has been Occured");
//		return "error_page";
//	}
	
	
	//SpringInterseptor
	
	@RequestMapping("/intersept")
	public String homePage() {
		return "interseptForm";
	}
	
	@RequestMapping("/inter")
	public String interHandler(@RequestParam("name") String name,Model model) {
		model.addAttribute("name", name);
		return  "interspetorDisplay";
	}
}

















package com.test.controllers;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.test.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("Add Controler");
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
		AddService service = new AddService();
		int sum = service.add(n1, n2);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("add");
		mv.addObject("sum", sum);
		return mv;
	}
	
	@RequestMapping("/add2")
	public ModelAndView add2(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
		System.out.println("add2 Controler");
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
		AddService service = new AddService();
		int sum = service.add(n1, n2);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("add");
		mv.addObject("sum", sum);
		return mv;
	}
}

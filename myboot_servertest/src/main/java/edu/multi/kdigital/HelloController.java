package edu.multi.kdigital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

	@RequestMapping("/helloboot")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", "hello boot project!ㅎ");
		mv.setViewName("hello");
		return mv;
	}
}


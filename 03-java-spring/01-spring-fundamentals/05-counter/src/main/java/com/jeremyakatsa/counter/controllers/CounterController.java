package com.jeremyakatsa.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CounterController {
	private int getSessionCount(HttpSession sesh) {
		Object seshVal = sesh.getAttribute("count");
		if(seshVal == null) {
			setSessionCount(sesh, 0);
			seshVal = sesh.getAttribute("count");
		}
		return (Integer)seshVal;
	}
	private void setSessionCount(HttpSession sesh, int val) {
		sesh.setAttribute("count", val);
	}
	@RequestMapping("/")
	public String Index(HttpSession s) {
		int currCount = getSessionCount(s);
		setSessionCount(s, ++currCount);
		return "index.jsp";
	}

	@RequestMapping("/counter")
	public String Counter(HttpSession s, Model model) {
		model.addAttribute("count", getSessionCount(s));
		return "counter.jsp";
	}
}

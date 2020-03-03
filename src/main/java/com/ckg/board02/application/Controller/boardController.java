package com.ckg.board02.application.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ckg.board02.application.DTO.Board;
import com.ckg.board02.application.Service.entityWrapper;

//@RestController
@Controller
public class boardController {

	@Autowired
	private entityWrapper enWrapper;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView ListBoard() {
		ModelAndView mv = new ModelAndView();
		System.out.println("Start userlist");
		
		List<Board> list = enWrapper.listBoard();;
		mv.addObject("listBoard", list);
		mv.setViewName("board");
		return mv;
	}
	
	/*
	 * @RequestMapping(value= "/board", method = RequestMethod.GET) public String
	 * board() { return "board"; }
	 */
	
	@RequestMapping(value="/write", method = RequestMethod.GET)
	public String write() {
		return "write";
	}
	
	@RequestMapping(value="/writeDB", method = RequestMethod.GET)
	public String writeDB(HttpServletRequest req, RedirectAttributes red) {
		Board board = null;
		System.out.println("View : " + req.getParameter("views"));
		if (req.getParameter("views").isEmpty())
			board=enWrapper.writeBoard(req.getParameter("title"),req.getParameter("context"), req.getParameter("nicname"));
		else
			board=enWrapper.writeBoard(req.getParameter("title"),req.getParameter("context"), req.getParameter("nicname"),Integer.parseInt(req.getParameter("views")));
		//ModelAndView mv = new ModelAndView();

		//redirectAttributes.addAttribute("board",board);
		//red.addFlashAttribute("board",board);
		//mv.setViewName("redirect:/view");
		return "redirect:/";
	}
	
	@RequestMapping(value="/view", method = RequestMethod.GET)
	public ModelAndView view(HttpServletRequest request) {
		System.out.println("title : " + request.getParameter("board_un")  + ", context : " + request.getParameter("context"));
		ModelAndView mv = new ModelAndView("view");
		mv.addObject("board", enWrapper.readBoard(request.getParameter("board_un")));
		
		return mv;
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public String delete(HttpServletRequest request) {
		System.out.println("delete nicname : " + request.getParameter("nicname")  + ", context : " + request.getParameter("context"));
		enWrapper.deleteBoard(request.getParameter("nicname"));
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/login", method= RequestMethod.GET) 
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value="/singin", method= RequestMethod.GET) 
	public String singin() {
		return "singin";
	}
	
	@RequestMapping(value="/submitUser", method = RequestMethod.POST) 
	public String submitUser( HttpServletRequest req) {
		String email = req.getParameter("email");
		String nicname = req.getParameter("nicname");
		String PW = req.getParameter("password");
		System.out.println("request email : " + email + " nicname : "+ nicname + " password : " + PW);
		enWrapper.insertUsers(email, nicname, PW);
		return "redirect:login";
	}
}


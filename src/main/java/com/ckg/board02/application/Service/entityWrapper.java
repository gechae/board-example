package com.ckg.board02.application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.ckg.board02.application.DTO.Board;
import com.ckg.board02.application.DTO.Users;

@Service
public class entityWrapper {

	@Autowired
	private Query query;
	
	public Board  writeBoard (String title, String context, String name) {
		Board board = new Board();
		//board.setBoard_id((long)1);
		board.setBoard_contexts(context);
		board.setBoard_title(title);
		board.setBoard_views((long) 0);
		board.setBoard_un(name);
		return board = query.WriteBoard(board);
	}
	public Board  writeBoard (String title, String context, String name, int views) {
		Board board = new Board();
		//board.setBoard_id((long)1);
		board.setBoard_contexts(context);
		board.setBoard_title(title);
		board.setBoard_views((long) views);
		board.setBoard_un(name);
		return board = query.WriteBoard(board);
	}
	
	public Board readBoard (String name) {
		System.out.println("readBoard : " + name);
		Board board = query.LeadBoard(name);
		board.setBoard_views(board.getBoard_views() + 1);
		return query.WriteBoard(board);
	}
	public void deleteBoard (String name) {
		System.out.println("DeleteBoard : " + name);
		Board board = new Board();
		board.setBoard_un(name);
		query.DeleteBoard(board);
	}
	public List<Board> listBoard() {

		return query.ListBoard();
	}
	
	public void insertUsers(String email, String nicname, String PW) {
		Users user = new Users();
		user.setUser_emil(email);
		user.setUser_un(nicname);
		user.setUser_pw(PW);
		query.InsertUser(user);
	}
}

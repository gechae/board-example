	package com.ckg.board02.application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ckg.board02.application.DTO.Board;
import com.ckg.board02.application.DTO.Users;
import com.ckg.board02.application.VO.UsersVO;
import com.ckg.board02.application.domain.Entity.UsersEntity;
import com.ckg.board02.application.domain.Repository.BoardRepository;
import com.ckg.board02.application.domain.Repository.UserRepository;

@Service
public class Query {
	
	@Autowired
	private UserRepository userReop;
	
	@Autowired 
	private BoardRepository boardReop;
	

	public List userlist() {
		System.out.println("Start userlist");
		List<Users> list = userReop.findAll();
		System.out.println("End userlist");
		return list;
	}
	
	public void InsertUser(Users v) {
		System.out.println("Start Create User : "  + v.toString());
		userReop.save(v);
	}
	
	public void DeleteUser(Users v) {
		System.out.println("Stert Delete User : " + v.toString());
		userReop.delete(v);
	}
	
	public Board WriteBoard(Board v) {
		System.out.println("Stert Write User : " + v.toString());
		return boardReop.saveAndFlush(v);
	}
	
	public List<Board> ListBoard() {
		System.out.println("Start userlist");
		List<Board> listBoard = boardReop.findAll();
		return listBoard;
	}
	
	public Board LeadBoard(String name) {
		System.out.println("Start userlist");
		Board board = boardReop.findByNameLessThanSQL(name);
		return board;
	}
	
	public void DeleteBoard(Board v) {
		System.out.println("Stert Delete Board : " + v.toString());
		boardReop.delete(v);
		
	}
}

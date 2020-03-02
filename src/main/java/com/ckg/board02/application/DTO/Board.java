package com.ckg.board02.application.DTO;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

/**
 * @author MSI
 * DB의 데이터를 Controller 및 Service 로 보낼때 사용 
 */
@Data
@Entity
public class Board {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="board_id", nullable=false)
//	private Long board_id;
	
	@Id
	@Column(name="board_un", nullable=false)
	private String board_un;
	
	@Column(name="board_title", nullable=false)
	private String board_title;
	
	@Column(name="board_views", nullable=false)
	private Long board_views;
	
	@CreationTimestamp
	@Column(name="board_create_time", nullable=false , updatable=false)
	private LocalDateTime board_create_time;
	
	@Column(name="board_contexts", nullable=false)
	private String board_contexts;

	public Board() {
		this.board_un = null;
		this.board_title = null;
		this.board_views = null;
		this.board_contexts = null;
	}
}

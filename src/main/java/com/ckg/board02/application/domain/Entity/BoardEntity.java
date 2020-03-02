package com.ckg.board02.application.domain.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


/**
 * @author MSI
 * 실제 데이터베이스와 매핑되는 클래스
 */
@Data
@Entity
public class BoardEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long board_id;
	
	@Column(name="board_title", nullable=true)
	private String board_title;
	
	@Column(name="board_views", nullable=true)
	private Long board_views;
	
	@Column(name="board_create_time", nullable=true)
	private String board_create_time;
	
	@Column(name="board_contexts", nullable=true)
	private String board_contexts;
	
}

package com.ckg.board02.application.VO;

import lombok.Getter;

/**
 * @author MSI
 * VO는 DTO와 비슷하지만, 수정할 수 없다.
 */
@Getter
public class BoardVO {
	
	private Long board_id;
	
	private String board_title;
	
	private Long board_views;
	
	private String board_create_time;
	
	private String board_contexts;
	
}

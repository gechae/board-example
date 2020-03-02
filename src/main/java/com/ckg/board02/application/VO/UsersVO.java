package com.ckg.board02.application.VO;

import lombok.Getter;


/**
 * @author MSI
 * VO는 DTO와 비슷하지만, 수정할 수 없다.
 */

@Getter
public class UsersVO {
	
	private String user_un;
	
	private String user_pw;
	
	private String user_emil;
	
	private String create_time;
	
	
}

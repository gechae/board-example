package com.ckg.board02.application.domain.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;



/**
 * @author MSI
 * 실제 데이터베이스와 매핑되는 클래스
 */
@Entity
@Data
public class UsersEntity {
	
	@Id
	@Column(name="user_un", nullable=true)
	private String user_un;
	
	@Column(name="user_pw", nullable=true)
	private String user_pw;
	
	@Column(name="user_email", nullable=true)
	private String user_emil;
	
	@Column(name="create_time", nullable=true)
	private String create_time;
	
	
}

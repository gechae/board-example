package com.ckg.board02.application.DTO;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;



/**
 * @author MSI
 * DB의 데이터를 Controller 및 Service 로 보낼때 사용 
 */

@Data
@Entity
public class Users{
	
	@Id
	/* @GeneratedValue(strategy = GenerationType.IDENTITY) */
	@Column(name="user_un", nullable=false)
	private String user_un;
	
	@Column(name="user_pw", nullable=false)
	private String user_pw;
	
	@Column(name="user_email", nullable=false)
	private String user_emil;
	
	@CreationTimestamp
	@Column(name="create_time", nullable=false, updatable=false)
	private LocalDateTime create_time;
	
	public String toString() {
		return "user_un : " + this.user_un +
				"user_pw : " + this.user_pw +
				"user_email : " + this.user_emil +
				"user_create : " + this.create_time;
	}
	
}

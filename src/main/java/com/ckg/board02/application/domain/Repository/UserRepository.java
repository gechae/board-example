package com.ckg.board02.application.domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ckg.board02.application.DTO.Users;
//import com.ckg.board02.application.domain.Entity.UsersEntity;

/**
 * @author MSI
 * JpaRepository<T, ID> :: T= Table이름과 동일해야함
 */
public interface UserRepository extends JpaRepository<Users, String> {
	
}

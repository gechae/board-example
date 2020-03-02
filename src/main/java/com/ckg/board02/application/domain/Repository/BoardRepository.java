package com.ckg.board02.application.domain.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ckg.board02.application.DTO.Board;

//DAO 기능
// JpaRepository<T, ID> :: T= Table이름과 동일해야함
public interface BoardRepository extends JpaRepository<Board, Long> {
	
	@Query("select t from Board t where t.board_un= :name")
	Board findByNameLessThanSQL(@Param("name") String name);
	
}

package com.example.cineflix_api.entity.repository;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.cineflix_api.entity.Phim;

@Repository

public interface PhimRepository extends JpaRepository<Phim, Long> {
	List<Phim> findAll();
	// JQL, Native Query
	@Query(value = "call  GetPhimByQuocGia(:id)", nativeQuery = true)
	List<Map<String, ?>> getPhimByQuocGia(@Param(value = "id") Integer id);
	
//	@Procedure("GetPhimAndTheLoai")
	@Query(value = "call  GetPhimAndTheLoai()", nativeQuery = true)
	List<Map<String, ?>> getPhimAndTheLoai();
}

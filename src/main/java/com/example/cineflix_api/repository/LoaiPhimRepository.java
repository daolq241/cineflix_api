package com.example.cineflix_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cineflix_api.entity.LoaiPhim;

@Repository
public interface LoaiPhimRepository extends JpaRepository<LoaiPhim, Long> {
	List<LoaiPhim> findAll();
}

package com.example.cineflix_api.service;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cineflix_api.entity.Phim;
import com.example.cineflix_api.repository.PhimRepository;

@Service
@Transactional
public class PhimService implements PhimServiceImp {
	
	@Autowired PhimRepository phimRepository;

	@Override
	public List<Map<String, ?>> getListPhim() {
		return phimRepository.getPhimAndTheLoai();
	}

	@Override
	public List<Map<String, ?>> getPhimByQuocGia(Integer id) {
		// TODO Auto-generated method stub
		return phimRepository.getPhimByQuocGia(id);
	}


}

package com.example.cineflix_api.service;

import java.util.List;
import java.util.Map;

public interface PhimServiceImp<Phim> {
	public List<Map<String, ?>> getListPhim();
	public List<Map<String, ?>> getPhimByQuocGia(Integer id);
}

package com.example.cineflix_api.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "loaiphim")
public class LoaiPhim {
	
	@Id
	@GeneratedValue
	private long id;
	
	@OneToMany(mappedBy = "loaiPhim")
	Set<LoaiPhimPhim> loaiPhimPhims;
	
	@Column(name = "ten_loai")
	private String tenLoai;
	
	@Column(name = "hinh_anh")
	private String hinh_anh;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public String getHinh_anh() {
		return hinh_anh;
	}

	public void setHinh_anh(String hinh_anh) {
		this.hinh_anh = hinh_anh;
	}
	
	
}

package com.example.cineflix_api.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

@Entity(name="phim")
public class Phim {

	@Id
	@GeneratedValue
	private long id;
	
//	private int id_quocgia; //FK
	@ManyToOne
	@JoinColumn(name = "id_quocgia")
	QuocGia quocGia;
	
	@OneToMany(mappedBy = "phim")
	private Set<ChiTietPhim> chiTietPhims;
	
	@OneToMany(mappedBy = "phim")
	private Set<LoaiPhimPhim> loaiPhimPhims;
	
	
	@Column(name ="ten_phim")
	private String ten_phim;
	
	@Column(name = "hinh_anh")
	private String hinh_anh;
	
	@Column(name = "ngay_tao")
	private Date ngay_tao;
	
	@Column(name = "mo_ta")
	private String mo_ta;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public QuocGia getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}

	public String getTen_phim() {
		return ten_phim;
	}

	public void setTen_phim(String ten_phim) {
		this.ten_phim = ten_phim;
	}

	public String getHinh_anh() {
		return hinh_anh;
	}

	public void setHinh_anh(String hinh_anh) {
		this.hinh_anh = hinh_anh;
	}

	public Date getNgay_tao() {
		return ngay_tao;
	}

	public void setNgay_tao(Date ngay_tao) {
		this.ngay_tao = ngay_tao;
	}

	public String getMo_ta() {
		return mo_ta;
	}

	public void setMo_ta(String mo_ta) {
		this.mo_ta = mo_ta;
	}
	
	
	
	
}

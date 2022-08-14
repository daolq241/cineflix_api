package com.example.cineflix_api.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="quocgia")
public class QuocGia {
	
	@Id
	@GeneratedValue
	private int id;
	
	@OneToMany(mappedBy = "quocGia")
	private Set<Phim> phim;
	
	@Column(name="ten_quocgia")
	private String tenQuocGia;
	
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenQuocGia() {
		return tenQuocGia;
	}

	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}
	
	
}

package com.tinz.ntyw.entity;

import java.io.Serializable;

public class Canton implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String code;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Canton [id=" + id + ", code=" + code + ", name=" + name + "]";
	}
	
}

package com.tinz.ntyw.entity;

import java.io.Serializable;

public class Factor implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer typeId;//污染物类别ID
	private String type;
	private String name;
	private String avgName;
	private String couName;
	private String code;
	private String oldCode;
	private Integer avgUnitId;
	private Integer couUnitId;
	private String avgUnit;
	private String couUnit;
	private String title;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvgName() {
		return avgName;
	}
	public void setAvgName(String avgName) {
		this.avgName = avgName;
	}
	public String getCouName() {
		return couName;
	}
	public void setCouName(String couName) {
		this.couName = couName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getOldCode() {
		return oldCode;
	}
	public void setOldCode(String oldCode) {
		this.oldCode = oldCode;
	}
	public Integer getAvgUnitId() {
		return avgUnitId;
	}
	public void setAvgUnitId(Integer avgUnitId) {
		this.avgUnitId = avgUnitId;
	}
	public Integer getCouUnitId() {
		return couUnitId;
	}
	public void setCouUnitId(Integer couUnitId) {
		this.couUnitId = couUnitId;
	}
	public String getAvgUnit() {
		return avgUnit;
	}
	public void setAvgUnit(String avgUnit) {
		this.avgUnit = avgUnit;
	}
	public String getCouUnit() {
		return couUnit;
	}
	public void setCouUnit(String couUnit) {
		this.couUnit = couUnit;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Factor [id=" + id + ", typeId=" + typeId + ", type=" + type + ", name=" + name + ", avgName=" + avgName
				+ ", couName=" + couName + ", code=" + code + ", oldCode=" + oldCode + ", avgUnitId=" + avgUnitId
				+ ", couUnitId=" + couUnitId + ", avgUnit=" + avgUnit + ", couUnit=" + couUnit + ", title=" + title
				+ "]";
	}
	
}

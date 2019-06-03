package com.tinz.ntyw.entity;

import java.io.Serializable;
public class CriteriaLicence implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer entpId,portId,typeId;
	public Integer getEntpId() {
		return entpId;
	}
	public void setEntpId(Integer entpId) {
		this.entpId = entpId;
	}
	public Integer getPortId() {
		return portId;
	}
	public void setPortId(Integer portId) {
		this.portId = portId;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	
}

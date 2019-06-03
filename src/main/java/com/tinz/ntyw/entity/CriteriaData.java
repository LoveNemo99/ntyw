package com.tinz.ntyw.entity;

import java.io.Serializable;
import java.util.Date;
public class CriteriaData implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer entpId,portId;
	private Date startTime,endTime;
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
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
}

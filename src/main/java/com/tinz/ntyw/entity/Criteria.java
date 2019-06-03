package com.tinz.ntyw.entity;

import java.io.Serializable;
public class Criteria implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer cantonId,industryId;
	private String entpKey;
	public Integer getCantonId() {
		return cantonId;
	}
	public void setCantonId(Integer cantonId) {
		this.cantonId = cantonId;
	}
	public Integer getIndustryId() {
		return industryId;
	}
	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
	}
	public String getEntpKey() {
		return entpKey;
	}
	public void setEntpKey(String entpKey) {
		this.entpKey = entpKey;
	}
	
}

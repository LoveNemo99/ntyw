package com.tinz.ntyw.entity;

public class UserInfo {
	private Integer id;
	private String username;
	private String cusername;
	private String district;
	private Integer districtId;
	private String districtCode;
	private String role;
	private Integer psId;
	private String psName;
	private String token;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCusername() {
		return cusername;
	}
	public void setCusername(String cusername) {
		this.cusername = cusername;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getPsId() {
		return psId;
	}
	public void setPsId(Integer psId) {
		this.psId = psId;
	}
	public Integer getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getPsName() {
		return psName;
	}
	public void setPsName(String psName) {
		this.psName = psName;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", username=" + username + ", cusername=" + cusername + ", district=" + district
				+ ", districtId=" + districtId + ", districtCode=" + districtCode + ", role=" + role + ", psId=" + psId
				+ ", psName=" + psName + ", token=" + token + "]";
	}

}

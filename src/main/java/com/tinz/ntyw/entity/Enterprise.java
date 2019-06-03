package com.tinz.ntyw.entity;

import java.io.Serializable;

public class Enterprise implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String code;
	private String name;
	private String orgCode;
	
	private Integer cantonId;
	private Integer regId;
	private Integer entpCatgId;
	private Integer entpSizeId;
	private Integer entpAffiId;
	private Integer indusCatgId;
	private Integer basinId;
	private Integer srcLevelId;
	
	private String canton;//行政区划
	private String reg;//注册类型
	private String entpCatg;//单位类别
	private String entpSize;//企业规模
	private String entpAffi;//单位隶属关系
	private String indusCatg;//行业类别
	private String basin;//流域
	private String srcLevel;//污染源等级
	
	private String instCode;
	private String address;
	private Float centerLongitude;//经度
	private Float centerLatitude;//纬度
	private String entpPerson;//企业负责人
	private String envPerson;//环保负责人
	private String entpPersonTel;//企业负责人
	private String envPersonTel;//环保负责人
	private String envAgency;//环保机构
	private Integer maintEntpId;//运维企业id
	private String visible;//是否展示
	private String checked;//是否审核
	private Integer sort;//顺序
	private String remark;//备注
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
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public Integer getCantonId() {
		return cantonId;
	}
	public void setCantonId(Integer cantonId) {
		this.cantonId = cantonId;
	}
	public Integer getRegId() {
		return regId;
	}
	public void setRegId(Integer regId) {
		this.regId = regId;
	}
	public Integer getEntpCatgId() {
		return entpCatgId;
	}
	public void setEntpCatgId(Integer entpCatgId) {
		this.entpCatgId = entpCatgId;
	}
	public Integer getEntpSizeId() {
		return entpSizeId;
	}
	public void setEntpSizeId(Integer entpSizeId) {
		this.entpSizeId = entpSizeId;
	}
	public Integer getEntpAffiId() {
		return entpAffiId;
	}
	public void setEntpAffiId(Integer entpAffiId) {
		this.entpAffiId = entpAffiId;
	}
	public Integer getIndusCatgId() {
		return indusCatgId;
	}
	public void setIndusCatgId(Integer indusCatgId) {
		this.indusCatgId = indusCatgId;
	}
	public Integer getBasinId() {
		return basinId;
	}
	public void setBasinId(Integer basinId) {
		this.basinId = basinId;
	}
	public Integer getSrcLevelId() {
		return srcLevelId;
	}
	public void setSrcLevelId(Integer srcLevelId) {
		this.srcLevelId = srcLevelId;
	}
	public String getCanton() {
		return canton;
	}
	public void setCanton(String canton) {
		this.canton = canton;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getEntpCatg() {
		return entpCatg;
	}
	public void setEntpCatg(String entpCatg) {
		this.entpCatg = entpCatg;
	}
	public String getEntpSize() {
		return entpSize;
	}
	public void setEntpSize(String entpSize) {
		this.entpSize = entpSize;
	}
	public String getEntpAffi() {
		return entpAffi;
	}
	public void setEntpAffi(String entpAffi) {
		this.entpAffi = entpAffi;
	}
	public String getIndusCatg() {
		return indusCatg;
	}
	public void setIndusCatg(String indusCatg) {
		this.indusCatg = indusCatg;
	}
	public String getBasin() {
		return basin;
	}
	public void setBasin(String basin) {
		this.basin = basin;
	}
	public String getSrcLevel() {
		return srcLevel;
	}
	public void setSrcLevel(String srcLevel) {
		this.srcLevel = srcLevel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Float getCenterLongitude() {
		return centerLongitude;
	}
	public void setCenterLongitude(Float centerLongitude) {
		this.centerLongitude = centerLongitude;
	}
	public Float getCenterLatitude() {
		return centerLatitude;
	}
	public void setCenterLatitude(Float centerLatitude) {
		this.centerLatitude = centerLatitude;
	}
	public String getEntpPerson() {
		return entpPerson;
	}
	public void setEntpPerson(String entpPerson) {
		this.entpPerson = entpPerson;
	}
	public String getEnvPerson() {
		return envPerson;
	}
	public void setEnvPerson(String envPerson) {
		this.envPerson = envPerson;
	}
	public String getEnvAgency() {
		return envAgency;
	}
	public void setEnvAgency(String envAgency) {
		this.envAgency = envAgency;
	}
	public Integer getMaintEntpId() {
		return maintEntpId;
	}
	public void setMaintEntpId(Integer maintEntpId) {
		this.maintEntpId = maintEntpId;
	}
	public String getVisible() {
		return visible;
	}
	public void setVisible(String visible) {
		this.visible = visible;
	}
	public String getChecked() {
		return checked;
	}
	public void setChecked(String checked) {
		this.checked = checked;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getInstCode() {
		return instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}
	
	public String getEntpPersonTel() {
		return entpPersonTel;
	}
	public void setEntpPersonTel(String entpPersonTel) {
		this.entpPersonTel = entpPersonTel;
	}
	public String getEnvPersonTel() {
		return envPersonTel;
	}
	public void setEnvPersonTel(String envPersonTel) {
		this.envPersonTel = envPersonTel;
	}
	@Override
	public String toString() {
		return "Enterprise [id=" + id + ", code=" + code + ", name=" + name + ", orgCode=" + orgCode + ", cantonId="
				+ cantonId + ", regId=" + regId + ", entpCatgId=" + entpCatgId + ", entpSizeId=" + entpSizeId
				+ ", entpAffiId=" + entpAffiId + ", indusCatgId=" + indusCatgId + ", basinId=" + basinId
				+ ", srcLevelId=" + srcLevelId + ", canton=" + canton + ", reg=" + reg + ", entpCatg=" + entpCatg
				+ ", entpSize=" + entpSize + ", entpAffi=" + entpAffi + ", indusCatg=" + indusCatg + ", basin=" + basin
				+ ", srcLevel=" + srcLevel + ", instCode=" + instCode + ", address=" + address + ", centerLongitude="
				+ centerLongitude + ", centerLatitude=" + centerLatitude + ", entpPerson=" + entpPerson + ", envPerson="
				+ envPerson + ", entpPersonTel=" + entpPersonTel + ", envPersonTel=" + envPersonTel + ", envAgency="
				+ envAgency + ", maintEntpId=" + maintEntpId + ", visible=" + visible + ", checked=" + checked
				+ ", sort=" + sort + ", remark=" + remark + "]";
	}
	
}

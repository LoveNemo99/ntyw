package com.tinz.ntyw.entity;

import java.io.Serializable;

public class Port implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer entpId;
	private String entp;
	private Integer typeId;//污染物类别ID
	private String type;
	private String name;
	private String code;
	private String mn1;//企业端数采MN
	private String mn2;
	private String dest;//排放去向
	private String maintEntp;
	private Integer maintEntpId;
	private String checked;
	private String equip;//安装设备
	private String remark;
	private Integer protocolId;//通讯协议版本ID
	private String protocol;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEntpId() {
		return entpId;
	}
	public void setEntpId(Integer entpId) {
		this.entpId = entpId;
	}
	
	public String getEntp() {
		return entp;
	}
	public void setEntp(String entp) {
		this.entp = entp;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMn1() {
		return mn1;
	}
	public void setMn1(String mn1) {
		this.mn1 = mn1;
	}
	public String getMn2() {
		return mn2;
	}
	public void setMn2(String mn2) {
		this.mn2 = mn2;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getMaintEntp() {
		return maintEntp;
	}
	public void setMaintEntp(String maintEntp) {
		this.maintEntp = maintEntp;
	}
	public Integer getMaintEntpId() {
		return maintEntpId;
	}
	public void setMaintEntpId(Integer maintEntpId) {
		this.maintEntpId = maintEntpId;
	}
	public String getChecked() {
		return checked;
	}
	public void setChecked(String checked) {
		this.checked = checked;
	}
	public String getEquip() {
		return equip;
	}
	public void setEquip(String equip) {
		this.equip = equip;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getProtocolId() {
		return protocolId;
	}
	public void setProtocolId(Integer protocolId) {
		this.protocolId = protocolId;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	
}

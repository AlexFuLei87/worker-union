/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 企业用户
 * model字段增加
 * 岗位信息roleName
 * 归属项目projectName
 * 年龄age
 * 
 * @author seulad
 *
 */
public class StaffDto implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/** ID */
	private BigInteger id;
	/** 企业ID */
	private BigInteger companyId;
	/** 姓名 */
	private String name;
	/** 性别（MALE/FEMALE） */
	private String sex;
	/** 生日 */
	private Date birthday;
	/** 年龄 */
	private Integer age;
	/** 工号 */
	private String jobNo;
	/** 籍贯 */
	private String nativePlace;
	/** 联系方式 */
	private String phone;
	/** 身份证号码 */
	private String idCardNo;
	/** 家庭住址 */
	private String address;
	/** 入职时间 */
	private Date entryDate;
	/** 职业经历 */
	private String career;
	/** 备注 */
	private String memo;
	/** 职位名称 */
	private String roleName;
	/** 项目名称 */
	private String projectName;
	/** 创建时间 */
	private Date cstCreate;
	/** 修改时间 */
	private Date cstModified;
	/** 删除标识 */
	private Boolean del;
	private Date startDate;
	private Date endDate;
	
	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getCompanyId() {
		return companyId;
	}

	public void setCompanyId(BigInteger companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getJobNo() {
		return jobNo;
	}

	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Boolean getDel() {
		return del;
	}

	public void setDel(Boolean del) {
		this.del = del;
	}

	public Date getCstCreate() {
		return cstCreate;
	}

	public void setCstCreate(Date cstCreate) {
		this.cstCreate = cstCreate;
	}

	public Date getCstModified() {
		return cstModified;
	}

	public void setCstModified(Date cstModified) {
		this.cstModified = cstModified;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) throws ParseException {

		this.startDate = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
	}

	public Date getEndDate() { return endDate; }

	public void setEndDate(String endDate) throws ParseException {

		this.endDate = new SimpleDateFormat("yyyy-MM-dd").parse(endDate) ;
	}

	@Override
	public String toString() {
		return "StaffDto [id=" + id + ", companyId=" + companyId + ", name=" + name + ", sex=" + sex + ", birthday="
				+ birthday + ", age=" + age + ", jobNo=" + jobNo + ", nativePlace=" + nativePlace + ", phone=" + phone
				+ ", idCardNo=" + idCardNo + ", address=" + address + ", entryDate=" + entryDate + ", career=" + career
				+ ", memo=" + memo + ", roleName=" + roleName + ", projectName=" + projectName + ", cstCreate="
				+ cstCreate + ", cstModified=" + cstModified + ", del=" + del + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", hashCode()=" + hashCode() + "]";
	}


}

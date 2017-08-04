/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.service;

import java.math.BigInteger;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.StaffDto;
import top.warmheart.workerunion.server.model.Staff;

public interface StaffService {

	/**
	 * 增加企业员工信息
	 * 
	 * @param staff
	 *            企业员工信息
	 */
	int add(Staff staff);

	/**
	 * 修改企业员工信息
	 * 
	 * @param staff
	 *            企业员工信息
	 */
	int modifyById(Staff staff);

	/**
	 * 根据企业员工工号获取企业员工信息
	 * 
	 * @param companyId
	 *            企业ID
	 * @param jobNo
	 *            员工工号
	 * @return 企业员工信息
	 */
	Staff getByJobNo(BigInteger companyId, String jobNo);

	/**
	 * 根据企业员工工号获取企业员工信息
	 * 
	 * @param id
	 *            员工ID
	 * @return 企业员工信息
	 */
	Staff getById(BigInteger id);

	/**
	 * 根据企业员工工号删除企业员工信息
	 * 
	 * @param id
	 *            员工ID
	 * @return 企业员工信息
	 */
	int removeById(BigInteger id);

	/**
	 * 根据企业员工工号获取企业员工详细信息
	 * 
	 * @param id
	 *            员工ID
	 * @return 企业员工信息
	 */
	StaffDto getDetailById(BigInteger id);

	/**
	 * 获取企业员工的权限信息
	 * 
	 * @param id
	 *            员工ID
	 * @return 包含权限信息的企业员工信息
	 */
	Staff getAuthenticationStaff(BigInteger id);

	/**
	 * 模糊查询员工信息
	 * 
	 * @param staffDto
	 *            员工信息
	 * @param page
	 * @return
	 */
	Page<StaffDto> pageByFuzzy(StaffDto staffDto, Page<?> page);
}

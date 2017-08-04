package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.workerunion.server.dto.Staff2Dto;
import top.warmheart.workerunion.server.model.ProjectApplication;

public interface ProjectApplicationService {
	/**
	 * 获取项目报建人员信息列表
	 * 
	 * @return
	 */
	List<Staff2Dto> listStaffByProjectId(BigInteger projectId);

	/**
	 * 根据项目及员工获取报建信息
	 * @param projectId
	 * @param staffId
	 * @return
	 */
	ProjectApplication getByProjectStaff(BigInteger projectId, BigInteger staffId);

	/**
	 * 删除报建信息
	 * @param projectId
	 * @param staffId
	 */
	int deleteByProjectStaff(BigInteger projectId, BigInteger staffId);

	/**
	 * 获取员工的有效报建信息
	 * @param staffId
	 * @return
	 */
	List<ProjectApplication> getValidByStaff(BigInteger staffId);

	/**
	 * 获取项目指定角色的报建信息
	 * @param id
	 * @param type
	 * @return
	 */
	ProjectApplication getByProjectRole(BigInteger projectId, String type);

	/**
	 * 增加报建信息
	 * @param projectId
	 * @param staffId
	 * @param type
	 * @return
	 */
	int add(BigInteger projectId, BigInteger staffId, String type);
}

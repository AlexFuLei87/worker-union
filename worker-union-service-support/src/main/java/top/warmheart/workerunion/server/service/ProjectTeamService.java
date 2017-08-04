package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.workerunion.server.dto.Staff3Dto;
import top.warmheart.workerunion.server.model.ProjectTeam;

public interface ProjectTeamService {
	/**
	 * 确认项目组是否包含该员工
	 * @param projectId 项目ID
	 * @param staffId 员工ID
	 * @return
	 */
	boolean contains(BigInteger projectId, BigInteger staffId);

	/**
	 * 添加新的项目组成员
	 * @param projectId
	 * @param staffId
	 * @param teamRoleId
	 * @return
	 */
	int add(BigInteger projectId, BigInteger staffId, BigInteger teamRoleId);

	/**
	 * 确认项目组是否包含该角色
	 * @param projectId 项目ID
	 * @param teamRoleId 角色ID
	 * @return
	 */
	boolean roleContains(BigInteger projectId, BigInteger teamRoleId);

	/**
	 * 通过项目及员工获取项目组成员
	 * @param projectId
	 * @param staffId
	 * @return
	 */
	ProjectTeam getByProjectStaff(BigInteger projectId, BigInteger staffId);

	/**
	 * 通过项目及员工删除该项目组成员
	 * @param projectId
	 * @param staffId
	 * @return
	 */
	int deleteByProjectStaff(BigInteger projectId, BigInteger staffId);

	/**
	 * 获取项目组下的成员信息列表
	 * @param projectId
	 * @return
	 */
	List<Staff3Dto> listStaffByProjectId(BigInteger projectId);

	/**
	 * 获取项目指定类型的人员信息
	 * @param projectId 项目组ID
	 * @param type 项目成员类型
	 * @return
	 */
	Staff3Dto getByProjectTeamType(BigInteger projectId, String type);
}

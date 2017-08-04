package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.workerunion.server.model.Permission;

/**
 * 权限
 * @author seulad
 *
 */
public interface PermissionService {

	/**
	 * 获取项目角色的权限列表
	 * @param teamRoleId 项目角色ID
	 * @return 权限列表
	 */
	List<Permission> listByTeamRole(BigInteger teamRoleId);
}

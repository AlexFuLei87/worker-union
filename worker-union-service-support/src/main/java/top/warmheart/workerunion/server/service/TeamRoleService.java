package top.warmheart.workerunion.server.service;

import java.math.BigInteger;

import top.warmheart.workerunion.server.model.TeamRole;

/**
 * 项目角色
 * @author seulad
 *
 */
public interface TeamRoleService {
	/**
	 * 通过ID获取项目组角色信息
	 * @param id 项目组角色ID
	 * @return
	 */
	TeamRole getById(BigInteger id);
	
	/**
	 * 获取企业下指定的项目角色信息
	 * @param companyId
	 * @param type
	 * @return
	 */
	TeamRole getByCompanyType(BigInteger companyId, String type);
}

package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.workerunion.server.model.Role;



public interface RoleService {

	/**
	 * 获取企业角色列表信息
	 * @param companyId
	 * @return
	 */
	List<Role> listByCompanyId(BigInteger companyId);

	/**
	 * 获取员工所属角色信息
	 * @param companyId
	 * @return
	 */
	List<Role> listByStaffId(BigInteger staffId, BigInteger companyId);

	/**
	 * 根据ID获取角色信息
	 * @param id
	 * @return
	 */
	Role getById(BigInteger id);

	/**
	 * 保存用户角色信息
	 * @param id
	 * @param roles
	 */
	void replace(BigInteger staffId, List<Role> roles);
}

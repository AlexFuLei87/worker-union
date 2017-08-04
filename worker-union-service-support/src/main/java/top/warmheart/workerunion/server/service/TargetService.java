package top.warmheart.workerunion.server.service;

import java.math.BigInteger;

import top.warmheart.workerunion.server.model.Target;

public interface TargetService {

	/**
	 * 根据项目ID获取目标信息
	 * @param id
	 * @return
	 */
	Target getByProjectId(BigInteger projectId);
	
	/**
	 * 保存项目目标详情
	 * @param target
	 * @return
	 */
	int replace(Target target);
}

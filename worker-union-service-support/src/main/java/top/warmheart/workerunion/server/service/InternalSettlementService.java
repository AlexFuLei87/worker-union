package top.warmheart.workerunion.server.service;

import java.math.BigInteger;

import top.warmheart.workerunion.server.model.InternalSettlement;

public interface InternalSettlementService {

	/**
	 * 根据项目ID获取项目内部结算评估情况
	 * @param projectId
	 * @return
	 */
	InternalSettlement getByProjectId(BigInteger projectId);

	/**
	 * 保存内部结算评估结果
	 * @param internalSettlement
	 * @return
	 */
	int replace(InternalSettlement internalSettlement);
	
	
}

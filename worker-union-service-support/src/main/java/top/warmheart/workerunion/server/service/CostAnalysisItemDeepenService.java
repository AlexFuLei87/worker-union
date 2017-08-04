package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.workerunion.server.model.CostAnalysisItemDeepen;

public interface CostAnalysisItemDeepenService {
	
	/**
	 * 根据项目获取成本深化项列表
	 * @param projectId 项目ID
	 * @return 成本深化项列表
	 */
	List<CostAnalysisItemDeepen> listByProjectId(BigInteger projectId);
	
	/**
	 * 根据ID获取成本深化项
	 * @param id ID
	 * @return 成本深化项列表
	 */
	CostAnalysisItemDeepen getById(BigInteger id);
	
	/**
	 * 增加新的成本深化项
	 * @param costAnalysisItemDeepen 成本深化项
	 */
	int add(CostAnalysisItemDeepen costAnalysisItemDeepen);
	
	/**
	 * 删除成本深化项
	 * @param id ID
	 */
	int removeById(BigInteger id);
	
	/**
	 * 修改成本深化项
	 * @param costAnalysisItemDeepen 成本深化项
	 */
	int modifyById(CostAnalysisItemDeepen costAnalysisItemDeepen);
}

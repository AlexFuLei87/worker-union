package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.workerunion.server.model.CostAnalysisItem;

public interface CostAnalysisItemService {
	
	/**
	 * 根据项目ID获取成本分析项列表
	 * @param projectId 项目ID
	 * @return 成本项列表
	 */
	List<CostAnalysisItem> listByProjectId(BigInteger projectId);
	
	/**
	 * 根据项目ID获取成本分析项
	 * @param id ID
	 * @return 成本项列表
	 */
	CostAnalysisItem getById(BigInteger id);
	
	/**
	 * 增加新的成本分析项
	 * @param costAnalysisItem 成本分析项
	 */
	int add(CostAnalysisItem costAnalysisItem);
	
	/**
	 * 删除成本分析项
	 * @param id ID
	 */
	int removeById(BigInteger id);
	
	/**
	 * 修改成本分析项
	 * @param costAnalysisItem 成本分析项
	 */
	int modifyById(CostAnalysisItem costAnalysisItem);
}

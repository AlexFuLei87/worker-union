package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.workerunion.server.dto.FundPlanItemDto;
import top.warmheart.workerunion.server.model.FundPlanItem;

public interface FundPlanItemService {

	/**
	 * 根据项目获取资金计划项
	 * 
	 * @param projectId
	 *            项目ID
	 * @return 资金计划项列表
	 */
	List<FundPlanItemDto> listByProjectId(BigInteger projectId);

	/**
	 * 根据项目获取简要资金计划项
	 * 
	 * @param projectId
	 *            项目ID
	 * @return 资金计划项列表
	 */
	List<FundPlanItem> listSimpleByProjectId(BigInteger projectId);

	/**
	 * 根据ID获取资金计划项
	 * 
	 * @param id
	 *            ID
	 * @return 资金计划项列表
	 */
	FundPlanItem getById(BigInteger id);

	/**
	 * 增加新的资金计划项
	 * 
	 * @param fundPlanItem
	 *            资金计划项
	 */
	int add(FundPlanItem fundPlanItem);

	/**
	 * 删除资金计划项
	 * 
	 * @param id
	 *            ID
	 */
	int removeById(BigInteger id);

	/**
	 * 修改资金计划项
	 * 
	 * @param fundPlanItem
	 *            资金计划项
	 */
	int modifyById(FundPlanItem fundPlanItem);

	/**
	 * 获取关联了指定成分深化项的资金计划项列表
	 * 
	 * @param costAnalysisItemId
	 *            成本深化项ID
	 * @return
	 */
	List<FundPlanItem> listByCostAnalysisItemId(BigInteger costAnalysisItemId);

}

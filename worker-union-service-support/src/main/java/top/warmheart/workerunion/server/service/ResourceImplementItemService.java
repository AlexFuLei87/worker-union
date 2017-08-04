package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.workerunion.server.dto.ResourceImplementItemDto;
import top.warmheart.workerunion.server.model.ResourceImplementItem;

public interface ResourceImplementItemService {

	/**
	 * 根据项目获取资源落实项列表
	 * 
	 * @param projectId
	 *            项目ID
	 * @return 资源落实项列表
	 */
	List<ResourceImplementItemDto> listByProjectId(BigInteger projectId);

	/**
	 * 根据项目获取简要资源落实列表
	 * 
	 * @param projectId
	 *            项目ID
	 * @return 资源落实项列表
	 */
	List<ResourceImplementItem> listSimpleByProjectId(BigInteger projectId);

	/**
	 * 根据ID获取资源落实项
	 * 
	 * @param id
	 *            ID
	 * @return 资源落实项列表
	 */
	ResourceImplementItem getById(BigInteger id);

	/**
	 * 增加新的资源落实项
	 * 
	 * @param fundPlanItem
	 *            资源落实项
	 */
	int add(ResourceImplementItem fundPlanItem);

	/**
	 * 删除资源落实项
	 * 
	 * @param id
	 *            ID
	 */
	int removeById(BigInteger id);

	/**
	 * 修改资源落实项
	 * 
	 * @param fundPlanItem
	 *            资源落实项
	 */
	int modifyById(ResourceImplementItem fundPlanItem);

	/**
	 * 获取关联了指定资金计划的资源落实项列表
	 * 
	 * @param fundPlanItemId
	 *            资金计划项ID
	 * @return
	 */
	List<ResourceImplementItem> listByFundPlanItemId(BigInteger fundPlanItemId);

}

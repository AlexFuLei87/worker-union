package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.SettlementItem2Dto;
import top.warmheart.workerunion.server.dto.SettlementItemDto;
import top.warmheart.workerunion.server.model.SettlementItem;

public interface SettlementItemService {

	/**
	 * 分页获取项目获取结算管理项
	 * 
	 * @param projectId
	 *            项目ID
	 * @param page
	 *            分页参数
	 * @return 结算管理项列表分页
	 */
	Page<SettlementItemDto> pageByProjectId(BigInteger projectId, Page<?> page);

	/**
	 * 根据ID获取结算管理项
	 * 
	 * @param id
	 *            ID
	 * @return 结算管理项列表
	 */
	SettlementItem getById(BigInteger id);

	/**
	 * 增加新的结算管理项
	 * 
	 * @param settlementItem
	 *            结算管理项
	 */
	int add(SettlementItem settlementItem);

	/**
	 * 删除结算管理项
	 * 
	 * @param id
	 *            ID
	 */
	int removeById(BigInteger id);

	/**
	 * 修改结算管理项
	 * 
	 * @param settlementItem
	 *            结算管理项
	 */
	int modifyById(SettlementItem settlementItem);

	/**
	 * 根据资源落实项ID获取结算项列表
	 * @param resourceImplementItemId
	 * @return
	 */
	List<SettlementItem> listByResourceImplementItemId(BigInteger resourceImplementItemId);

	/**
	 * 获取资源落实项在指定月的结算信息
	 * 
	 * @param resourceImplementItemId
	 * @param year
	 * @param month
	 * @return
	 */
	SettlementItem getByResourceImplementYearMonth(BigInteger resourceImplementItemId, Integer year,
			Integer month);

	/**
	 * 根据ID获取结算管理项
	 * 
	 * @param id
	 *            ID
	 * @return 结算管理项列表
	 */
	SettlementItem2Dto getDetailById(BigInteger id);
}

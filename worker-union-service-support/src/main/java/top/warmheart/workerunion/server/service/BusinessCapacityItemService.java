package top.warmheart.workerunion.server.service;

import java.math.BigInteger;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.BusinessCapacityItemDto;
import top.warmheart.workerunion.server.model.BusinessCapacityItem;


public interface BusinessCapacityItemService {

	/**
	 * 分页获取指定项目组的经营产值项列表
	 * @param projectId 项目ID
	 * @param page 分页参数
	 * @return
	 */
	Page<BusinessCapacityItemDto> pageByProjectId(BigInteger projectId, Page<Void> page);

	/**
	 * 根据项目及月份获取经营产值项
	 * @param projectId 项目ID
	 * @param year 年份
	 * @param month 月份
	 * @return
	 */
	BusinessCapacityItem getByProjectYearMonth(BigInteger projectId, Integer year, Integer month);

	/**
	 * 增加新的经营产值项
	 * @param businessCapacityItem
	 * @return
	 */
	int add(BusinessCapacityItem businessCapacityItem);

	/**
	 * 通过ID获取经营产值项
	 * @param id
	 * @return
	 */
	BusinessCapacityItem getById(BigInteger id);

	/**
	 * 根据id修改经营产值项
	 * @param businessCapacityItem
	 * @return
	 */
	int modifyById(BusinessCapacityItem businessCapacityItem);

	/**
	 * 根据id删除经营产值项
	 * @param id
	 * @return
	 */
	int removeById(BigInteger id);
	
}

package top.warmheart.workerunion.server.service;

import java.math.BigInteger;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.model.ProductCapacityItem;


public interface ProductCapacityItemService {

	/**
	 * 分页获取指定项目组的生产产值项列表
	 * @param projectId 项目ID
	 * @param page 分页参数
	 * @return
	 */
	Page<ProductCapacityItem> pageByProjectId(BigInteger projectId, Page<Void> page);

	/**
	 * 根据项目及月份获取生产产值项
	 * @param projectId 项目ID
	 * @param year 年份
	 * @param month 月份
	 * @return
	 */
	ProductCapacityItem getByProjectYearMonth(BigInteger projectId, Integer year, Integer month);

	/**
	 * 增加新的生产产值项
	 * @param productCapacityItem
	 * @return
	 */
	int add(ProductCapacityItem productCapacityItem);

	/**
	 * 通过ID获取生产产值项
	 * @param id
	 * @return
	 */
	ProductCapacityItem getById(BigInteger id);

	/**
	 * 根据id修改生产产值项
	 * @param productCapacityItem
	 * @return
	 */
	int modifyById(ProductCapacityItem productCapacityItem);

	/**
	 * 根据id删除生产产值项
	 * @param id
	 * @return
	 */
	int removeById(BigInteger id);
	
}

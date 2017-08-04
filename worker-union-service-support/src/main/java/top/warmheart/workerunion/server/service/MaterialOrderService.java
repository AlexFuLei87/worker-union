package top.warmheart.workerunion.server.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.MaterialOrderDetail2Dto;
import top.warmheart.workerunion.server.model.MaterialOrder;

public interface MaterialOrderService {

	/**
	 * 分页获取批次查询结果
	 * 
	 * @param projectId
	 * @param staffName
	 * @param cstCreate
	 * @param batchNo
	 * @param page
	 * @return
	 */
	Page<MaterialOrder> pageByFuzzy(BigInteger projectId, String staffName, Date cstCreate,
			String batchNo, Page<?> page);

	/**
	 * 获取指定项目指定材料的出入库数量合计
	 * @param projectId 项目ID
	 * @param num 材料编号
	 * @param type 出入库类型
	 * @return
	 */
	BigDecimal amountOrderDetailByType(BigInteger projectId, String num, String type);

	/**
	 * 分页获取指定材料出入库历史记录
	 * @param projectId
	 * @param num
	 * @param page
	 * @return
	 */
	Page<MaterialOrderDetail2Dto> pageOrderDetailByNum(BigInteger projectId, String num, Page<?> page);

	/**
	 * 将材料进行入库操作
	 * @param materialOrder
	 * @return
	 */
	void importMaterial(MaterialOrder materialOrder);

	/**
	 * 根据批次号获取材料批次信息
	 * @param projectId
	 * @param batchNo
	 * @return
	 */
	MaterialOrder getByProjectBatchNo(BigInteger projectId, String batchNo);

	/**
	 * 将材料进行出库操作
	 * @param materialOrder
	 * @return
	 */
	void exportMaterial(MaterialOrder materialOrder);

	/**
	 * 将冻结材料进行出库操作
	 * @param materialOrder
	 * @return
	 */
	void exportFreezeMaterial(MaterialOrder materialOrder);

	/**
	 * 模糊查询 获取批次信息
	 * @param id
	 * @param staffName
	 * @param cstCreate
	 * @param batchNo
	 * @param page
	 * @return
	 */
	Page<MaterialOrderDetail2Dto> pageDetailByFuzzy(BigInteger projectId, String staffName, Date cstCreate, String batchNo,
			Page<?> page);

}

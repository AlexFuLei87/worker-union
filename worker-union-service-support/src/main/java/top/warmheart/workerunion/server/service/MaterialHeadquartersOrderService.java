package top.warmheart.workerunion.server.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.MaterialHeadquartersOrderDetail2Dto;
import top.warmheart.workerunion.server.model.MaterialHeadquartersOrder;
import top.warmheart.workerunion.server.model.MaterialOrder;

public interface MaterialHeadquartersOrderService {
	/**
	 * 分页获取批次查询结果
	 * 
	 * @param companyId
	 * @param staffName
	 * @param cstCreate
	 * @param batchNo
	 * @param page
	 * @return
	 */
	Page<MaterialHeadquartersOrder> pageByFuzzy(BigInteger companyId, String staffName, Date cstCreate,
			String batchNo, Page<?> page);

	/**
	 * 获取指定企业指定材料的出入库数量合计
	 * @param companyId 企业ID
	 * @param num 材料编号
	 * @param type 出入库类型
	 * @return
	 */
	BigDecimal amountOrderDetailByType(BigInteger companyId, String num, String type);

	/**
	 * 分页获取指定材料出入库历史记录
	 * @param companyId
	 * @param num
	 * @param page
	 * @return
	 */
	Page<MaterialHeadquartersOrderDetail2Dto> pageOrderDetailByNum(BigInteger companyId, String num, Page<?> page);

	/**
	 * 将材料进行入库操作
	 * @param materialHeadquartersOrder
	 * @return
	 */
	void importMaterialHeadquarters(MaterialHeadquartersOrder materialHeadquartersOrder);

	/**
	 * 根据批次号获取材料批次信息
	 * @param companyId
	 * @param batchNo
	 * @return
	 */
	MaterialHeadquartersOrder getByCompanyBatchNo(BigInteger companyId, String batchNo);

	/**
	 * 将材料进行出库操作，出库到项目组
	 * @param materialHeadquartersOrder
	 * @param materialOrder
	 * @return
	 */
	void exportMaterialHeadquartersToProject(MaterialHeadquartersOrder materialHeadquartersOrder, MaterialOrder materialOrder);

	/**
	 * 模糊查询 获取批次信息
	 * @param companyId
	 * @param staffName
	 * @param cstCreate
	 * @param batchNo
	 * @param page
	 * @return
	 */
	Page<MaterialHeadquartersOrderDetail2Dto> pageDetailByFuzzy(BigInteger companyId, String staffName, Date cstCreate, String batchNo,
			Page<?> page);

}

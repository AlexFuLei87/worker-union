package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.MaterialTransferApplicationDto;
import top.warmheart.workerunion.server.model.MaterialTransferApplication;
import top.warmheart.workerunion.server.model.MaterialTransferApplicationDetail;
import top.warmheart.workerunion.server.model.Staff;

public interface MaterialTransferService {

	/**
	 * 材料转库申请
	 * @param materialTransferApplication
	 * @param materialTransferApplicationDetails
	 */
	void applyTransferMaterial(MaterialTransferApplication materialTransferApplication,
			List<MaterialTransferApplicationDetail> materialTransferApplicationDetails);
	
	/**
	 * 获取指定企业的转库申请列表
	 * 
	 * @param companyId
	 * @param status
	 * @return
	 */
	List<MaterialTransferApplicationDto> listByCompanyId(BigInteger companyId, String status);

	/**
	 * 获取转库申请
	 * 
	 * @param id
	 * @return
	 */
	MaterialTransferApplicationDto getDetailById(BigInteger id);

	/**
	 * 获取转库申请
	 * 
	 * @param id
	 * @return
	 */
	MaterialTransferApplication getById(BigInteger id);

	/**
	 * 获取转库申请详情
	 * 
	 * @param transferApplicationId
	 * @return
	 */
	List<MaterialTransferApplicationDetail> listApplicationDetailByApplicationId(
			BigInteger id);

	/**
	 * 驳回转库审核
	 * 
	 * @param transferApplicationId
	 */
	void failById(BigInteger id);

	/**
	 * 通过转库审核
	 * 
	 * @param transferApplicationId
	 * @param staff
	 */
	void passById(BigInteger id,String batchNo, Staff staff);

	/**
	 * 模糊查询转库审核信息，分页
	 * @param materialTransferApplicationDto
	 * @param page
	 * @return
	 */
	Page<MaterialTransferApplicationDto> pageByFuzzy(MaterialTransferApplicationDto materialTransferApplicationDto, Page<?> page);

}

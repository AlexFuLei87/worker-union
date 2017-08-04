package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.ContractDto;
import top.warmheart.workerunion.server.model.Contract;
import top.warmheart.workerunion.server.model.ContractAttachment;



public interface ContractService {

	/**
	 * 根据id获取合同信息
	 * @param id
	 * @return
	 */
	Contract getById(BigInteger id);

	/**
	 * 获取指定项目简要合同列表
	 * @param id
	 * @return
	 */
	List<Contract> listSimpleItemByProjectId(BigInteger projectId);

	/**
	 * 获取企业下 指定合同编号的合同信息
	 * @param companyId
	 * @param num
	 * @return
	 */
	Contract getByCompanyAndNum(BigInteger companyId, String num);

	/**
	 * 增加新的合同信息
	 * @param contract
	 * @return contract.id
	 */
	BigInteger add(Contract contract);

	/**
	 * 根据ID删除合同信息
	 * @param id
	 * @return
	 */
	int removeById(BigInteger id);

	/**
	 * 根据合同ID获取合同详情
	 * @param id
	 * @return
	 */
	ContractDto getDetailById(BigInteger id);

	/**
	 * 通过附件ID获取合同附件信息
	 * @param id
	 * @return
	 */
	ContractAttachment getAttachmentById(BigInteger attachmentId);

	/**
	 * 根据附件ID删除合同附件
	 * @param attachmentId
	 * @return
	 */
	int removeAttachmentById(BigInteger attachmentId);

	/**
	 * 修改合同信息
	 * @param contract
	 * @return
	 */
	int modifyById(Contract contract);

	/**
	 * 模糊查询，获取分页
	 * @param contractDto
	 * @param page 
	 * @return
	 */
	Page<ContractDto> pageByFuzzy(ContractDto contractDto, Page<?> page);

	/**
	 * 增加附件
	 * @param contractAttachment
	 * @return
	 */
	int addAttachment(ContractAttachment contractAttachment);
	
	/**
	 * 获取合同信息的附件列表
	 * @param supplierId
	 * @return
	 */
	List<ContractAttachment> listAttachmentByContractId(BigInteger contractId);

}

package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.SupplierDto;
import top.warmheart.workerunion.server.model.Supplier;
import top.warmheart.workerunion.server.model.SupplierAttachment;
import top.warmheart.workerunion.server.model.SupplierGrade;
import top.warmheart.workerunion.server.model.SupplierQualification;



public interface SupplierService {

	/**
	 * 根据ID获取供应商级别信息
	 * @param supplierGradeId
	 * @return
	 */
	SupplierGrade getGradeById(BigInteger supplierGradeId);

	/**
	 * 根据ID获取供应商资质信息
	 * @param supplierGradeId
	 * @return
	 */
	SupplierQualification getQualificationById(BigInteger supplierId);

	/**
	 * 根据企业ID及供应商编号获取供应商信息
	 * @param companyId
	 * @param num
	 * @return
	 */
	Supplier getByCompanyAndNum(BigInteger companyId, String num);

	/**
	 * 增加供应商信息
	 * @param supplier
	 * @param supplierQualifications 
	 * @return supplier.id
	 */
	BigInteger add(Supplier supplier, List<SupplierQualification> supplierQualifications);

	/**
	 * 根据ID获取供应商信息
	 * @param id
	 * @return
	 */
	Supplier getById(BigInteger id);

	/**
	 * 根据ID删除供应商信息
	 * @param id
	 * @return
	 */
	int removeById(BigInteger id);

	/**
	 * 根据ID修改供应商信息
	 * @param supplier
	 * @param supplierQualifications
	 */
	void modifyById(Supplier supplier, List<SupplierQualification> supplierQualifications);

	/**
	 * 获取供应商的资质列表信息
	 * @param supplierId
	 * @return
	 */
	List<SupplierQualification> listQualificationBySupplierId(BigInteger supplierId);

	/**
	 * 获取供应商信息的附件列表
	 * @param supplierId
	 * @return
	 */
	List<SupplierAttachment> listAttachmentBySupplierId(BigInteger supplierId);

	/**
	 * 根据ID获取供应商附件信息
	 * @param attachmentId
	 * @return
	 */
	SupplierAttachment getAttachmentById(BigInteger attachmentId);

	/**
	 * 根据ID删除供应商附件
	 * @param attachmentId
	 * @return
	 */
	int removeAttachmentById(BigInteger attachmentId);

	/**
	 * 获取企业的供应商级别列表
	 * @return
	 */
	List<SupplierGrade> listGrade();

	/**
	 * 获取企业的供应商资质列表
	 * @return
	 */
	List<SupplierQualification> listQualification();

	/**
	 * 模糊查询获取供应商分页列表信息
	 * @param supplierDto
	 * @param page
	 * @return
	 */
	Page<SupplierDto> pageByFuzzy(SupplierDto supplierDto, Page<?> page);

	int addAttachment(SupplierAttachment supplierAttachment);
}

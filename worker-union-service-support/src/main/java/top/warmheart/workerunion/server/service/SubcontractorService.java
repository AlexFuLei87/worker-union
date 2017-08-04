package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.SubcontractorDto;
import top.warmheart.workerunion.server.model.Subcontractor;
import top.warmheart.workerunion.server.model.SubcontractorAttachment;
import top.warmheart.workerunion.server.model.SubcontractorGrade;
import top.warmheart.workerunion.server.model.SubcontractorQualification;

public interface SubcontractorService {

	/**
	 * 根据id获取分包商信息
	 * 
	 * @param id
	 * @return
	 */
	Subcontractor getById(BigInteger id);

	/**
	 * 获取企业下的简要分包商列表
	 * @return
	 */
	List<Subcontractor> listSimpleItemByCompanyId(BigInteger companyId);
	

	/**
	 * 根据ID获取分包商级别信息
	 * @param subcontractorGradeId
	 * @return
	 */
	SubcontractorGrade getGradeById(BigInteger subcontractorGradeId);

	/**
	 * 根据ID获取分包商资质信息
	 * @param subcontractorGradeId
	 * @return
	 */
	SubcontractorQualification getQualificationById(BigInteger qualificationId);

	/**
	 * 根据企业ID及分包商编号获取分包商信息
	 * @param companyId
	 * @param num
	 * @return
	 */
	Subcontractor getByCompanyAndNum(BigInteger companyId, String num);

	/**
	 * 增加分包商信息
	 * @param subcontractor
	 * @param subcontractorQualifications 
	 * @return subcontractor.id
	 */
	BigInteger add(Subcontractor subcontractor, List<SubcontractorQualification> subcontractorQualifications);

	/**
	 * 根据ID删除分包商信息
	 * @param id
	 * @return
	 */
	int removeById(BigInteger id);

	/**
	 * 根据ID修改分包商信息
	 * @param subcontractor
	 * @param subcontractorQualifications
	 */
	void modifyById(Subcontractor subcontractor, List<SubcontractorQualification> subcontractorQualifications);

	/**
	 * 获取分包商的资质列表信息
	 * @param subcontractorId
	 * @return
	 */
	List<SubcontractorQualification> listQualificationBySubcontractorId(BigInteger subcontractorId);

	/**
	 * 获取分包商信息的附件列表
	 * @param subcontractorId
	 * @return
	 */
	List<SubcontractorAttachment> listAttachmentBySubcontractorId(BigInteger subcontractorId);

	/**
	 * 根据ID获取分包商附件信息
	 * @param attachmentId
	 * @return
	 */
	SubcontractorAttachment getAttachmentById(BigInteger attachmentId);

	/**
	 * 根据ID删除分包商附件
	 * @param attachmentId
	 * @return
	 */
	int removeAttachmentById(BigInteger attachmentId);

	/**
	 * 获取企业的分包商级别列表
	 * @return
	 */
	List<SubcontractorGrade> listGrade();

	/**
	 * 获取企业的分包商资质列表
	 * @return
	 */
	List<SubcontractorQualification> listQualification();

	/**
	 * 模糊查询分包商信息
	 * @param subcontractorDto
	 * @param page
	 * @return
	 */
	Page<SubcontractorDto> pageByFuzzy(SubcontractorDto subcontractorDto, Page<?> page);

	int addAttachment(SubcontractorAttachment subcontractorAttachment);

}

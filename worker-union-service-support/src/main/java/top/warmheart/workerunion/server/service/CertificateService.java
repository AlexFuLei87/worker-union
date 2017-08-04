package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.CertificateDto;
import top.warmheart.workerunion.server.model.Certificate;
import top.warmheart.workerunion.server.model.CertificateAttachment;
import top.warmheart.workerunion.server.model.CertificateSerie;
import top.warmheart.workerunion.server.model.CertificateType;

public interface CertificateService {
	/**
	 * 根据证书类型ID获取证书信息
	 * @param certificateTypeId
	 * @return
	 */
	CertificateType getTypeById(BigInteger certificateTypeId);	
	
	/**
	 * 获取有效的证书系列列表
	 * @return
	 */
	List<CertificateSerie> listSerie();
	
	/**
	 * 根据证书系列ID获取证书类型ID
	 * @param certificateSerieId
	 * @return
	 */
	List<CertificateType> listTypeBySerieId(BigInteger certificateSerieId);

	/**
	 * 增加证书信息
	 * @param certificate
	 * @return
	 */
	BigInteger add(Certificate certificate);

	/**
	 * 根据证书ID获取证书信息
	 * @param id
	 * @return
	 */
	Certificate getById(BigInteger id);
	
	/**
	 * 根据ID修改证书信息
	 * @param certificate
	 * @return
	 */
	int modifyById(Certificate certificate);

	/**
	 * 根据证书ID删除证书信息
	 * @param id
	 * @return
	 */
	int removeById(BigInteger id);

	/**
	 * 根据ID获取证书详情
	 * @param id
	 * @return
	 */
	CertificateDto getDetailById(BigInteger id);

	/**
	 * 模糊查询证书信息，分页
	 * @param certificateDto
	 * @param page
	 * @return
	 */
	Page<CertificateDto> pageByFuzzy(CertificateDto certificateDto, Page<?> page);

	/**
	 * 获取用户所拥有的证书列表
	 * @param id
	 * @return
	 */
	List<Certificate> listByStaffId(BigInteger staffId);

	/**
	 * 获取证书附件信息
	 * @param attachmentId
	 * @return
	 */
	CertificateAttachment getAttachmentById(BigInteger attachmentId);

	/**
	 * 删除证书附件
	 * @param attachmentId
	 * @return
	 */
	int removeAttachmentById(BigInteger attachmentId);

	/**
	 * 获取证书附件列表信息
	 * @param id
	 * @return
	 */
	List<CertificateAttachment> listAttachmentByCertificateId(BigInteger id);

	/**
	 * 新增证件附件
	 * @param certificateAttachment
	 */
	int addAttachment(CertificateAttachment certificateAttachment);
}

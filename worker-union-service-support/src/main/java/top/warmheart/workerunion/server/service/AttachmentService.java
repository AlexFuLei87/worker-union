package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.Attachment2Dto;
import top.warmheart.workerunion.server.dto.AttachmentDto;
import top.warmheart.workerunion.server.exception.WhAttachmentExistException;
import top.warmheart.workerunion.server.model.Attachment;
import top.warmheart.workerunion.server.model.AttachmentAudit;

public interface AttachmentService {
	/**
	 * 根据ID获取附件信息
	 * @param id 附件ID
	 * @return
	 */
	Attachment getById(BigInteger id);
	
	/**
	 * 根据ID获取附件信息
	 * @param id 附件ID
	 * @return
	 */
	AttachmentDto getAuditById(BigInteger id);
	
	/**
	 * 根据ID删除附件信息
	 * @param id 附件ID
	 * @return
	 */
	int removeById(BigInteger id);
	
	/**
	 * 增加新的附件信息
	 * @param attachment
	 */
	int add(Attachment attachment);
	
	/**
	 * 增加新的具有项目所属类型唯一性的附件信息
	 * @param attachment
	 */
	int addUniqueType(Attachment attachment)throws WhAttachmentExistException;
	
	/**
	 * 获取项目附件
	 * @param companyId 企业ID
	 * @param type 附件类型
	 * @param projectId 项目ID
	 * @return 项目附件
	 */
	Attachment getLatestByType(BigInteger projectId, String type);

	/**
	 * 根据项目ID获取项目下的指定类型附件列表信息
	 * @param projectId 项目ID
	 * @param attachmentType 附件类型
	 * @return
	 */
	List<AttachmentDto> listAuditAttachment(BigInteger projectId, String attachmentType);

	/**
	 * 根据附件类型分页获取指定项目组的附件信息
	 * @param projectId 项目ID
	 * @param type 附件类型
	 * @param page 分页参数
	 * @return
	 */
	Page<Attachment> pageByProjectType(BigInteger projectId, String type, Page<?> page);
	
	/**
	 * 根据附件类型分页获取指定项目组的附件信息
	 * @param projectId 项目ID
	 * @param type 附件类型
	 * @param page 分页参数
	 * @return
	 */
	Page<AttachmentDto> pageAuditByProjectType(BigInteger projectId, String type, Page<?> page);

	/**
	 * 插入附件审核信息
	 * @param attachmentAudit
	 * @return
	 */
	int replaceAttachmentAudit(AttachmentAudit attachmentAudit);

	/**
	 * 获取企业下指定附件类型待审核的附件列表
	 * @param companyId
	 * @param typeSchemeDeepen
	 * @return
	 */
	List<Attachment2Dto> listUndeterminedByTypeInCompany(BigInteger companyId, String attachmentType);

	/**
	 * 列表获取指定类型的附件信息
	 * @param projectId
	 * @param type
	 * @return
	 */
	List<Attachment> listByProjectType(BigInteger projectId, String type);
}

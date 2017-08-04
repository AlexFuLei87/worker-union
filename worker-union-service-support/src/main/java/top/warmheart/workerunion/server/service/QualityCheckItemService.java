package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.QualityCheckItemDto;
import top.warmheart.workerunion.server.model.QualityCheckItem;
import top.warmheart.workerunion.server.model.QualityCheckItemAttachment;

public interface QualityCheckItemService {
	/**
	 * 分页获取项目质量检查项列表
	 * @param projectId
	 * @param page
	 * @return
	 */
	Page<QualityCheckItem> pageByProjectId(BigInteger projectId, Page<?> page);

	/**
	 * 根据ID获取质量检查记录
	 * @param id
	 * @return
	 */
	QualityCheckItem getItemById(BigInteger id);

	/**
	 * 根据附件ID获取质量检查附件信息
	 * @param attachmentId
	 * @return
	 */
	QualityCheckItemAttachment getAttachmentById(BigInteger attachmentId);
	
	/**
	 * 根据记录ID获取附件信息列表
	 * @param id
	 * @return
	 */
	List<QualityCheckItemAttachment> listAttachmentByItemId(BigInteger id);

	/**
	 * 修改质量记录
	 * @param qualityCheckItem
	 * @return
	 */
	int modifyItemById(QualityCheckItem qualityCheckItem);

	/**
	 * 根据附件ID删除质量检查附件
	 * @param attachmentId
	 * @return
	 */
	int removeAttachmentById(BigInteger attachmentId);

	/**
	 * 增加质量记录附件信息
	 * @param qualityCheckItemAttachment
	 * @return
	 */
	int addAttachment(QualityCheckItemAttachment qualityCheckItemAttachment);

	int removeItemById(BigInteger id);

	BigInteger addItem(QualityCheckItem qualityCheckItem);

	List<QualityCheckItemDto> listByCompanyAndStatus(BigInteger companyId, String rectifyStatusVerify);
}

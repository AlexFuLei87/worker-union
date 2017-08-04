package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.SafetyCheckItemDto;
import top.warmheart.workerunion.server.model.SafetyCheckItem;
import top.warmheart.workerunion.server.model.SafetyCheckItemAttachment;


public interface SafetyCheckItemService {

	/**
	 * 分页获取项目安全检查项列表
	 * @param projectId
	 * @param page
	 * @return
	 */
	Page<SafetyCheckItem> pageByProjectId(BigInteger projectId, Page<?> page);

	/**
	 * 根据ID获取安全检查记录
	 * @param id
	 * @return
	 */
	SafetyCheckItem getItemById(BigInteger id);
	
	/**
	 * 根据ID获取安全检查记录附件信息
	 * @param attachmentId
	 * @return
	 */
	SafetyCheckItemAttachment getAttachmentById(BigInteger attachmentId);

	/**
	 * 根据记录ID获取附件信息列表
	 * @param id
	 * @return
	 */
	List<SafetyCheckItemAttachment> listAttachmentByItemId(BigInteger id);

	/**
	 * 修改安全记录
	 * @param safetyCheckItemCheck
	 * @return
	 */
	int modifyItemById(SafetyCheckItem safetyCheckItem);

	/**
	 * 根据附件ID删除附件
	 * @param attachmentId
	 * @return
	 */
	int removeAttachmentById(BigInteger attachmentId);

	/**
	 * 增加安全检查记录附件
	 * @param safetyCheckItemAttachment
	 * @return
	 */
	int addAttachment(SafetyCheckItemAttachment safetyCheckItemAttachment);

	/**
	 * 新增记录
	 * @param safetyCheckItem
	 * @return
	 */
	BigInteger addItem(SafetyCheckItem safetyCheckItem);

	/**
	 * 根据记录ID删除记录
	 * @param itemId
	 * @return
	 */
	int removeItemById(BigInteger itemId);

	List<SafetyCheckItemDto> listByCompanyAndStatus(BigInteger companyId, String rectifyStatusVerify);
}

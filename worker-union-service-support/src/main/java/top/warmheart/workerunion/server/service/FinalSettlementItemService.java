package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.workerunion.server.dto.FinalSettlementItemDto;
import top.warmheart.workerunion.server.model.FinalSettlementItem;
import top.warmheart.workerunion.server.model.FinalSettlementItemAttachment;

public interface FinalSettlementItemService {
	
	/**
	 * 根据条目ID获取条目下的附件
	 * @param id
	 * @return
	 */
	FinalSettlementItemAttachment getAttachmentByItemId(BigInteger finalSettlementItemId);
	
	/**
	 * 根据项目ID获取决算条目列表信息
	 * @param id
	 * @return
	 */
	List<FinalSettlementItemDto> listItemByProjectId(BigInteger projectId);

	/**
	 * 新增竣工决算项
	 * @param finalSettlementItem
	 * @return
	 */
	int addItem(FinalSettlementItem finalSettlementItem);

	/**
	 * 根据ID获取竣工决算项
	 * @param id
	 * @return
	 */
	FinalSettlementItem getItemById(BigInteger id);

	/**
	 * 修改竣工决算项
	 * @param finalSettlementItem
	 * @return
	 */
	int modifyItemById(FinalSettlementItem finalSettlementItem);

	/**
	 * 根据ID删除竣工决算项
	 * @param id
	 * @return
	 */
	int removeItemById(BigInteger id);

	/**
	 * 删除竣工决算附件
	 * @param id
	 * @return
	 */
	int removeAttachmentByItemId(BigInteger finalSettlementItemId);

	int addAttachment(FinalSettlementItemAttachment finalSettlementItemAttachment);
	
}

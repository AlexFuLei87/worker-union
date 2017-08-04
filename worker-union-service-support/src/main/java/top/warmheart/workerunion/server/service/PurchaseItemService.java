package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.workerunion.server.model.PurchaseItem;

public interface PurchaseItemService {

	/**
	 * 获取企业采购条目列表
	 * 
	 * @return 企业采购条目列表
	 */
	List<PurchaseItem> list();

	/**
	 * 根据ID获取采购条目
	 * @param purchaseItemId
	 * @return
	 */
	PurchaseItem getById(BigInteger id);

}

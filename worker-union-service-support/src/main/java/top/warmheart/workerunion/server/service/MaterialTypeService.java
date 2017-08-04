package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.model.MaterialType;
import top.warmheart.workerunion.server.model.MaterialTypeAttachment;

public interface MaterialTypeService {

	/**
	 * 根据材料编号获取指定企业的材料类型信息
	 * 
	 * @param companyId
	 * @param num
	 * @return
	 */
	MaterialType getByNum(BigInteger companyId, String num);

	/**
	 * 根据ID获取企业材料类型信息
	 * @param id
	 * @return
	 */
	MaterialType getById(BigInteger id);

	/**
	 * 获取企业材料类型的材料附件信息
	 * @param id
	 * @return
	 */
	List<MaterialTypeAttachment> listByTypeId(BigInteger materialTypeId);

	/**
	 * 增加新的企业材料类型
	 * @param materialType
	 * @return materialType.id
	 */
	BigInteger add(MaterialType materialType);

	/**
	 * 根据附件ID获取附件信息
	 * @param attachmentId
	 * @return
	 */
	MaterialTypeAttachment getAttachmentById(BigInteger attachmentId);

	/**
	 * 根据附件ID删除附件信息
	 * @param attachmentId
	 * @return
	 */
	int removeAttachmentById(BigInteger attachmentId);

	/**
	 * 根据id删除企业材料类型
	 * @param id
	 * @return
	 */
	int removeById(BigInteger id);

	/**
	 * 增加企业材料类型附件
	 * @param materialTypeAttachment
	 * @return
	 */
	int addAttachment(MaterialTypeAttachment materialTypeAttachment);

	/**
	 * 模糊查询企业材料类型，分页
	 * @param materialType
	 * @param page
	 * @return
	 */
	Page<MaterialType> pageByFuzzy(MaterialType materialType, Page<Void> page);

}

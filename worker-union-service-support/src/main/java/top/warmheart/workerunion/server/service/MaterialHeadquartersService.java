package top.warmheart.workerunion.server.service;

import java.math.BigInteger;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.model.MaterialHeadquarters;

public interface MaterialHeadquartersService {
	/**
	 * 根据项目ID及材料编号名称，分页查询材料信息列表
	 * @param companyId
	 * @param num
	 * @param name
	 * @return
	 */
	Page<MaterialHeadquarters> pageByFuzzy(BigInteger companyId, String num, String name, Page<?> page);

	/**
	 * 获取指定项目下指定编号的材料信息
	 * @param companyId
	 * @param num
	 * @return
	 */
	MaterialHeadquarters getByNum(BigInteger companyId, String num);
}

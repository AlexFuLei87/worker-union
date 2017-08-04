package top.warmheart.workerunion.server.service;

import java.math.BigInteger;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.model.Material;

public interface MaterialService {

	/**
	 * 根据项目ID及材料编号名称，分页查询材料信息列表
	 * 
	 * @param projectId
	 * @param num
	 * @param name
	 * @return
	 */
	Page<Material> pageByFuzzy(BigInteger projectId, String num, String name, Page<?> page);

	/**
	 * 获取指定项目下指定编号的材料信息
	 * 
	 * @param projectId
	 * @param num
	 * @return
	 */
	Material getByNum(BigInteger projectId, String num);

}

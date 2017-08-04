package top.warmheart.workerunion.server.service;

public interface RegionalCodeService {
	/**
	 * 根据六位行政地区代码获取地区名称
	 * 
	 * @param code
	 *            六位行政地区代码
	 * @return 行政地区名称
	 */
	String getNameByCode(String code);
}

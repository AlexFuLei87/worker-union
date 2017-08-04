package top.warmheart.workerunion.server.service;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.model.Attachment;
import top.warmheart.workerunion.server.model.Project;

public interface ProjectService {
	/**
	 * 创建新项目 并保存中标通知书
	 * 
	 * @param project
	 *            项目信息
	 */
	void add(Project project, Attachment attachment);

	/**
	 * 根据ID获取项目信息
	 * 
	 * @param id
	 *            项目ID
	 * @return 项目信息
	 */
	Project getById(BigInteger id);

	/**
	 * 根据项目编号获取项目信息
	 * 
	 * @param companyId
	 *            企业ID
	 * @param num
	 *            项目编号
	 * @return 项目信息
	 */
	Project getByNum(BigInteger companyId, String num);

	/**
	 * 根据企业ID获取项目信息
	 * 
	 * @param companyId
	 *            企业ID
	 * @param page
	 *            分页参数
	 * @return 项目分页信息
	 */
	Page<Project> pageAll(BigInteger companyId, Page<?> page);

	/**
	 * 根据项目状态及立项年份获取项目信息列表
	 * 
	 * @param companyId
	 *            企业ID
	 * @param fileStatus
	 *            项目状态
	 * @param page
	 *            分页参数
	 * @return 项目分页信息
	 */
	Page<Project> pageByStatusAndYear(BigInteger companyId, String fileStatus, Date year, Page<?> page);

	/**
	 * 根据项目状态获取项目信息列表
	 * 
	 * @param companyId
	 *            企业ID
	 * @param fileStatus
	 *            项目状态
	 * @param page
	 *            分页参数
	 * @return 项目分页信息
	 */
	Page<Project> pageByStatus(BigInteger companyId, String fileStatus, Page<?> page);

	/**
	 * 根据立项年份获取项目信息列表
	 * 
	 * @param companyId
	 *            企业ID
	 * @param year
	 *            立项年份
	 * @param page
	 *            分页参数
	 * @return 项目分页信息
	 */
	Page<Project> pageByYear(BigInteger companyId, Date year, Page<?> page);

	/**
	 * 获取员工归属的项目信息
	 * 
	 * @param staffId
	 *            员工ID
	 * 
	 * @param companyId
	 *            企业ID
	 * @param page
	 *            分页参数
	 * @return 项目分页信息
	 */
	Page<Project> pageAllEx(BigInteger staffId, BigInteger companyId, Page<?> page);

	/**
	 * 根据项目状态及立项年份获取员工归属的项目信息列表
	 * 
	 * @param staffId
	 *            员工ID
	 * @param companyId
	 *            企业ID
	 * @param fileStatus
	 *            项目状态
	 * @param page
	 *            分页参数
	 * @return 项目分页信息
	 */
	Page<Project> pageByStatusAndYearEx(BigInteger staffId, BigInteger companyId, String fileStatus, Date year, Page<?> page);

	/**
	 * 根据项目状态获取员工归属的项目信息列表
	 * 
	 * @param staffId
	 *            员工ID
	 * @param companyId
	 *            企业ID
	 * @param fileStatus
	 *            项目状态
	 * @param page
	 *            分页参数
	 * @return 项目分页信息
	 */
	Page<Project> pageByStatusEx(BigInteger staffId, BigInteger companyId, String fileStatus, Page<?> page);

	/**
	 * 根据立项年份获取员工归属的项目信息列表
	 * 
	 * @param staffId
	 *            员工ID
	 * @param companyId
	 *            企业ID
	 * @param year
	 *            立项年份
	 * @param page
	 *            分页参数
	 * @return 项目分页信息
	 */
	Page<Project> pageByYearEx(BigInteger staffId, BigInteger companyId, Date year, Page<?> page);

	/**
	 * 获取企业下的项目列表信息
	 * @param companyId
	 * @return
	 */
	List<Project> listSimpleByCompanyId(BigInteger companyId);

	/**
	 * 修改项目
	 * @param project
	 * @return
	 */
	int modifyById(Project project);

	/**
	 * 根据项目归档状态获取企业项目简要列表
	 * @param companyId
	 * @param fileStatus
	 * @return
	 */
	List<Project> listSimpleByFileStatus(BigInteger companyId, String fileStatus);
}

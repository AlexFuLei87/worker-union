package top.warmheart.workerunion.server.dao;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.Attachment2Dto;
import top.warmheart.workerunion.server.dto.AttachmentDto;
import top.warmheart.workerunion.server.model.Attachment;

public interface AttachmentMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table attachment
	 *
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(BigInteger id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table attachment
	 *
	 * @mbg.generated
	 */
	int insert(Attachment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table attachment
	 *
	 * @mbg.generated
	 */
	Attachment selectByPrimaryKey(BigInteger id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table attachment
	 *
	 * @mbg.generated
	 */
	List<Attachment> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table attachment
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Attachment record);

	/**
	 * 根据ID弱删除附件信息
	 * 
	 * @param id
	 *            附件ID
	 * @param statusPass
	 * @return
	 */
	int deleteById(@Param("id") BigInteger id, @Param("statusPass") String statusPass);

	/**
	 * 根据获取项目最新的该类型附件
	 * 
	 * @param projectId
	 *            项目ID
	 * @param type
	 *            附件类型
	 * @param companyId
	 *            企业ID
	 * @return
	 */
	Attachment selectLatestByType(@Param("projectId") BigInteger projectId, @Param("type") String type);

	List<Attachment> selectByType4Update(@Param("projectId") BigInteger projectId, @Param("type") String type);

	List<AttachmentDto> selectListAuditAttachment(@Param("projectId") BigInteger projectId,
			@Param("type") String attachmentType, @Param("defaultAuditStatus") String defaultAuditStatus);

	Integer countByProjectType(@Param("projectId") BigInteger projectId, @Param("type") String type);

	List<Attachment> pageByProjectType(@Param("projectId") BigInteger projectId, @Param("type") String type,
			@Param("page") Page<Attachment> page);

	List<AttachmentDto> pageAuditByProjectType(@Param("projectId") BigInteger projectId, @Param("type") String type,
			@Param("defaultAuditStatus") String defaultAuditStatus, @Param("page") Page<?> page);

	AttachmentDto selectAuditByPrimaryKey(@Param("id") BigInteger id,
			@Param("defaultAuditStatus") String defaultAuditStatus);

	List<Attachment2Dto> selectListUndeterminedByTypeInCompany(@Param("companyId")BigInteger companyId,@Param("type") String type,@Param("undeterminedStatus") String undeterminedStatus);

	List<Attachment> selectListByProjectType(@Param("projectId")BigInteger projectId,@Param("type") String type);
}
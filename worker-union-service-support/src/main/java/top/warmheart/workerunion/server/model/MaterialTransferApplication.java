package top.warmheart.workerunion.server.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * This class was generated by MyBatis Generator. This class corresponds to the
 * database table material_transfer_application
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class MaterialTransferApplication implements Serializable {

	/** 状态-未审核 */
	public static final String STATUS_UNDETERMINED = "UNDETERMINED";
	/** 状态-通过 */
	public static final String STATUS_PASS = "PASS";
	/** 状态-驳回 */
	public static final String STATUS_FAIL = "FAIL";
	/** 转到项目组 */
	public static final String TYPE_TO_PROJECT = "TO_PROJECT";
	/** 转到总部 */
	public static final String TYPE_TO_HEADQUARTERS = "TO_HEADQUARTERS";
	public static final List<String> TYPE_LIST = Arrays.asList(new String[] { TYPE_TO_PROJECT, TYPE_TO_HEADQUARTERS });
	/**
	 * Database Column Remarks: 材料转库申请ID
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column material_transfer_application.id
	 *
	 * @mbg.generated
	 */
	private BigInteger id;
	private BigInteger companyId;
	/**
	 * Database Column Remarks: 申请人ID
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column material_transfer_application.staff_id
	 *
	 * @mbg.generated
	 */
	private BigInteger staffId;

	/**
	 * Database Column Remarks: 申请人姓名
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column material_transfer_application.staff_name
	 *
	 * @mbg.generated
	 */
	private String staffName;

	/**
	 * Database Column Remarks: 出库项目组ID
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column material_transfer_application.export_project_id
	 *
	 * @mbg.generated
	 */
	private BigInteger exportProjectId;

	/**
	 * Database Column Remarks: 进库项目组ID
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column material_transfer_application.import_project_id
	 *
	 * @mbg.generated
	 */
	private BigInteger importProjectId;

	/**
	 * Database Column Remarks: 金额
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column material_transfer_application.money
	 *
	 * @mbg.generated
	 */
	private BigDecimal money;

	/**
	 * Database Column Remarks: 类型（转项目组：TO_PROJECT，转总部：TO_HEADQUARTERS）
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column material_transfer_application.type
	 *
	 * @mbg.generated
	 */
	private String type;

	/**
	 * Database Column Remarks: 申请状态（通过：PASS，驳回：FAIL，未审核：UNDETERMINED）
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column material_transfer_application.status
	 *
	 * @mbg.generated
	 */
	private String status;

	/**
	 * Database Column Remarks: 创建时间
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column material_transfer_application.cst_create
	 *
	 * @mbg.generated
	 */
	private Date cstCreate;

	/**
	 * Database Column Remarks: 修改时间
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column material_transfer_application.cst_modified
	 *
	 * @mbg.generated
	 */
	private Date cstModified;

	/**
	 * Database Column Remarks: 删除标识
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column material_transfer_application.is_del
	 *
	 * @mbg.generated
	 */
	private Boolean del;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table material_transfer_application
	 *
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column material_transfer_application.id
	 *
	 * @return the value of material_transfer_application.id
	 *
	 * @mbg.generated
	 */
	public BigInteger getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column material_transfer_application.id
	 *
	 * @param id
	 *            the value for material_transfer_application.id
	 *
	 * @mbg.generated
	 */
	public void setId(BigInteger id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column material_transfer_application.staff_id
	 *
	 * @return the value of material_transfer_application.staff_id
	 *
	 * @mbg.generated
	 */
	public BigInteger getStaffId() {
		return staffId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column material_transfer_application.staff_id
	 *
	 * @param staffId
	 *            the value for material_transfer_application.staff_id
	 *
	 * @mbg.generated
	 */
	public void setStaffId(BigInteger staffId) {
		this.staffId = staffId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column material_transfer_application.staff_name
	 *
	 * @return the value of material_transfer_application.staff_name
	 *
	 * @mbg.generated
	 */
	public String getStaffName() {
		return staffName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column material_transfer_application.staff_name
	 *
	 * @param staffName
	 *            the value for material_transfer_application.staff_name
	 *
	 * @mbg.generated
	 */
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column
	 * material_transfer_application.export_project_id
	 *
	 * @return the value of material_transfer_application.export_project_id
	 *
	 * @mbg.generated
	 */
	public BigInteger getExportProjectId() {
		return exportProjectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column
	 * material_transfer_application.export_project_id
	 *
	 * @param exportProjectId
	 *            the value for material_transfer_application.export_project_id
	 *
	 * @mbg.generated
	 */
	public void setExportProjectId(BigInteger exportProjectId) {
		this.exportProjectId = exportProjectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column
	 * material_transfer_application.import_project_id
	 *
	 * @return the value of material_transfer_application.import_project_id
	 *
	 * @mbg.generated
	 */
	public BigInteger getImportProjectId() {
		return importProjectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column
	 * material_transfer_application.import_project_id
	 *
	 * @param importProjectId
	 *            the value for material_transfer_application.import_project_id
	 *
	 * @mbg.generated
	 */
	public void setImportProjectId(BigInteger importProjectId) {
		this.importProjectId = importProjectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column material_transfer_application.money
	 *
	 * @return the value of material_transfer_application.money
	 *
	 * @mbg.generated
	 */
	public BigDecimal getMoney() {
		return money;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column material_transfer_application.money
	 *
	 * @param money
	 *            the value for material_transfer_application.money
	 *
	 * @mbg.generated
	 */
	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column material_transfer_application.type
	 *
	 * @return the value of material_transfer_application.type
	 *
	 * @mbg.generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column material_transfer_application.type
	 *
	 * @param type
	 *            the value for material_transfer_application.type
	 *
	 * @mbg.generated
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column material_transfer_application.status
	 *
	 * @return the value of material_transfer_application.status
	 *
	 * @mbg.generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column material_transfer_application.status
	 *
	 * @param status
	 *            the value for material_transfer_application.status
	 *
	 * @mbg.generated
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column material_transfer_application.cst_create
	 *
	 * @return the value of material_transfer_application.cst_create
	 *
	 * @mbg.generated
	 */
	public Date getCstCreate() {
		return cstCreate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column material_transfer_application.cst_create
	 *
	 * @param cstCreate
	 *            the value for material_transfer_application.cst_create
	 *
	 * @mbg.generated
	 */
	public void setCstCreate(Date cstCreate) {
		this.cstCreate = cstCreate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column material_transfer_application.cst_modified
	 *
	 * @return the value of material_transfer_application.cst_modified
	 *
	 * @mbg.generated
	 */
	public Date getCstModified() {
		return cstModified;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column material_transfer_application.cst_modified
	 *
	 * @param cstModified
	 *            the value for material_transfer_application.cst_modified
	 *
	 * @mbg.generated
	 */
	public void setCstModified(Date cstModified) {
		this.cstModified = cstModified;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column material_transfer_application.is_del
	 *
	 * @return the value of material_transfer_application.is_del
	 *
	 * @mbg.generated
	 */
	public Boolean getDel() {
		return del;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column material_transfer_application.is_del
	 *
	 * @param del
	 *            the value for material_transfer_application.is_del
	 *
	 * @mbg.generated
	 */
	public void setDel(Boolean del) {
		this.del = del;
	}

	public BigInteger getCompanyId() {
		return companyId;
	}

	public void setCompanyId(BigInteger companyId) {
		this.companyId = companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table material_transfer_application
	 *
	 * @mbg.generated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", companyId=").append(companyId);
		sb.append(", staffId=").append(staffId);
		sb.append(", staffName=").append(staffName);
		sb.append(", exportProjectId=").append(exportProjectId);
		sb.append(", importProjectId=").append(importProjectId);
		sb.append(", money=").append(money);
		sb.append(", type=").append(type);
		sb.append(", status=").append(status);
		sb.append(", cstCreate=").append(cstCreate);
		sb.append(", cstModified=").append(cstModified);
		sb.append(", del=").append(del);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}
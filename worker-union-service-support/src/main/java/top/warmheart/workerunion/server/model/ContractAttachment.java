package top.warmheart.workerunion.server.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table contract_attachment
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class ContractAttachment implements Serializable {
	public static final String TYPE_INFORMATION = "INFORMATION";
    /**
     * Database Column Remarks:
     *   附件ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_attachment.id
     *
     * @mbg.generated
     */
    private BigInteger id;

    /**
     * Database Column Remarks:
     *   企业ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_attachment.company_id
     *
     * @mbg.generated
     */
    private BigInteger companyId;

    /**
     * Database Column Remarks:
     *   合同ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_attachment.contract_id
     *
     * @mbg.generated
     */
    private BigInteger contractId;

    /**
     * Database Column Remarks:
     *   附件文件名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_attachment.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   文件contentType属性
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_attachment.content_type
     *
     * @mbg.generated
     */
    private String contentType;

    /**
     * Database Column Remarks:
     *   文件尺寸（字节）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_attachment.size
     *
     * @mbg.generated
     */
    private BigInteger size;

    /**
     * Database Column Remarks:
     *   文件路径
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_attachment.path
     *
     * @mbg.generated
     */
    private String path;

    /**
     * Database Column Remarks:
     *   附件类型（INFORMATION）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_attachment.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_attachment.staff_id
     *
     * @mbg.generated
     */
    private BigInteger staffId;

    /**
     * Database Column Remarks:
     *   创建人姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_attachment.staff_name
     *
     * @mbg.generated
     */
    private String staffName;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_attachment.cst_create
     *
     * @mbg.generated
     */
    private Date cstCreate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_attachment.cst_modified
     *
     * @mbg.generated
     */
    private Date cstModified;

    /**
     * Database Column Remarks:
     *   删除标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_attachment.is_del
     *
     * @mbg.generated
     */
    private Boolean del;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table contract_attachment
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_attachment.id
     *
     * @return the value of contract_attachment.id
     *
     * @mbg.generated
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_attachment.id
     *
     * @param id the value for contract_attachment.id
     *
     * @mbg.generated
     */
    public void setId(BigInteger id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_attachment.company_id
     *
     * @return the value of contract_attachment.company_id
     *
     * @mbg.generated
     */
    public BigInteger getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_attachment.company_id
     *
     * @param companyId the value for contract_attachment.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(BigInteger companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_attachment.contract_id
     *
     * @return the value of contract_attachment.contract_id
     *
     * @mbg.generated
     */
    public BigInteger getContractId() {
        return contractId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_attachment.contract_id
     *
     * @param contractId the value for contract_attachment.contract_id
     *
     * @mbg.generated
     */
    public void setContractId(BigInteger contractId) {
        this.contractId = contractId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_attachment.name
     *
     * @return the value of contract_attachment.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_attachment.name
     *
     * @param name the value for contract_attachment.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_attachment.content_type
     *
     * @return the value of contract_attachment.content_type
     *
     * @mbg.generated
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_attachment.content_type
     *
     * @param contentType the value for contract_attachment.content_type
     *
     * @mbg.generated
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_attachment.size
     *
     * @return the value of contract_attachment.size
     *
     * @mbg.generated
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_attachment.size
     *
     * @param size the value for contract_attachment.size
     *
     * @mbg.generated
     */
    public void setSize(BigInteger size) {
        this.size = size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_attachment.path
     *
     * @return the value of contract_attachment.path
     *
     * @mbg.generated
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_attachment.path
     *
     * @param path the value for contract_attachment.path
     *
     * @mbg.generated
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_attachment.type
     *
     * @return the value of contract_attachment.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_attachment.type
     *
     * @param type the value for contract_attachment.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_attachment.staff_id
     *
     * @return the value of contract_attachment.staff_id
     *
     * @mbg.generated
     */
    public BigInteger getStaffId() {
        return staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_attachment.staff_id
     *
     * @param staffId the value for contract_attachment.staff_id
     *
     * @mbg.generated
     */
    public void setStaffId(BigInteger staffId) {
        this.staffId = staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_attachment.staff_name
     *
     * @return the value of contract_attachment.staff_name
     *
     * @mbg.generated
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_attachment.staff_name
     *
     * @param staffName the value for contract_attachment.staff_name
     *
     * @mbg.generated
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_attachment.cst_create
     *
     * @return the value of contract_attachment.cst_create
     *
     * @mbg.generated
     */
    public Date getCstCreate() {
        return cstCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_attachment.cst_create
     *
     * @param cstCreate the value for contract_attachment.cst_create
     *
     * @mbg.generated
     */
    public void setCstCreate(Date cstCreate) {
        this.cstCreate = cstCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_attachment.cst_modified
     *
     * @return the value of contract_attachment.cst_modified
     *
     * @mbg.generated
     */
    public Date getCstModified() {
        return cstModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_attachment.cst_modified
     *
     * @param cstModified the value for contract_attachment.cst_modified
     *
     * @mbg.generated
     */
    public void setCstModified(Date cstModified) {
        this.cstModified = cstModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_attachment.is_del
     *
     * @return the value of contract_attachment.is_del
     *
     * @mbg.generated
     */
    public Boolean getDel() {
        return del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_attachment.is_del
     *
     * @param del the value for contract_attachment.is_del
     *
     * @mbg.generated
     */
    public void setDel(Boolean del) {
        this.del = del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_attachment
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
        sb.append(", contractId=").append(contractId);
        sb.append(", name=").append(name);
        sb.append(", contentType=").append(contentType);
        sb.append(", size=").append(size);
        sb.append(", path=").append(path);
        sb.append(", type=").append(type);
        sb.append(", staffId=").append(staffId);
        sb.append(", staffName=").append(staffName);
        sb.append(", cstCreate=").append(cstCreate);
        sb.append(", cstModified=").append(cstModified);
        sb.append(", del=").append(del);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
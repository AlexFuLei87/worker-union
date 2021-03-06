package top.warmheart.workerunion.server.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table certificate_type
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class CertificateType implements Serializable {
    /**
     * Database Column Remarks:
     *   证书类型ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column certificate_type.id
     *
     * @mbg.generated
     */
    private BigInteger id;

    /**
     * Database Column Remarks:
     *   证书系列ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column certificate_type.certificate_serie_id
     *
     * @mbg.generated
     */
    private BigInteger certificateSerieId;

    /**
     * Database Column Remarks:
     *   证书系列名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column certificate_type.certificate_serie_name
     *
     * @mbg.generated
     */
    private String certificateSerieName;

    /**
     * Database Column Remarks:
     *   证书类型名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column certificate_type.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column certificate_type.cst_create
     *
     * @mbg.generated
     */
    private Date cstCreate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column certificate_type.cst_modified
     *
     * @mbg.generated
     */
    private Date cstModified;

    /**
     * Database Column Remarks:
     *   删除标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column certificate_type.is_del
     *
     * @mbg.generated
     */
    private Boolean del;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table certificate_type
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column certificate_type.id
     *
     * @return the value of certificate_type.id
     *
     * @mbg.generated
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column certificate_type.id
     *
     * @param id the value for certificate_type.id
     *
     * @mbg.generated
     */
    public void setId(BigInteger id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column certificate_type.certificate_serie_id
     *
     * @return the value of certificate_type.certificate_serie_id
     *
     * @mbg.generated
     */
    public BigInteger getCertificateSerieId() {
        return certificateSerieId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column certificate_type.certificate_serie_id
     *
     * @param certificateSerieId the value for certificate_type.certificate_serie_id
     *
     * @mbg.generated
     */
    public void setCertificateSerieId(BigInteger certificateSerieId) {
        this.certificateSerieId = certificateSerieId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column certificate_type.certificate_serie_name
     *
     * @return the value of certificate_type.certificate_serie_name
     *
     * @mbg.generated
     */
    public String getCertificateSerieName() {
        return certificateSerieName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column certificate_type.certificate_serie_name
     *
     * @param certificateSerieName the value for certificate_type.certificate_serie_name
     *
     * @mbg.generated
     */
    public void setCertificateSerieName(String certificateSerieName) {
        this.certificateSerieName = certificateSerieName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column certificate_type.name
     *
     * @return the value of certificate_type.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column certificate_type.name
     *
     * @param name the value for certificate_type.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column certificate_type.cst_create
     *
     * @return the value of certificate_type.cst_create
     *
     * @mbg.generated
     */
    public Date getCstCreate() {
        return cstCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column certificate_type.cst_create
     *
     * @param cstCreate the value for certificate_type.cst_create
     *
     * @mbg.generated
     */
    public void setCstCreate(Date cstCreate) {
        this.cstCreate = cstCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column certificate_type.cst_modified
     *
     * @return the value of certificate_type.cst_modified
     *
     * @mbg.generated
     */
    public Date getCstModified() {
        return cstModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column certificate_type.cst_modified
     *
     * @param cstModified the value for certificate_type.cst_modified
     *
     * @mbg.generated
     */
    public void setCstModified(Date cstModified) {
        this.cstModified = cstModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column certificate_type.is_del
     *
     * @return the value of certificate_type.is_del
     *
     * @mbg.generated
     */
    public Boolean getDel() {
        return del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column certificate_type.is_del
     *
     * @param del the value for certificate_type.is_del
     *
     * @mbg.generated
     */
    public void setDel(Boolean del) {
        this.del = del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table certificate_type
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
        sb.append(", certificateSerieId=").append(certificateSerieId);
        sb.append(", certificateSerieName=").append(certificateSerieName);
        sb.append(", name=").append(name);
        sb.append(", cstCreate=").append(cstCreate);
        sb.append(", cstModified=").append(cstModified);
        sb.append(", del=").append(del);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
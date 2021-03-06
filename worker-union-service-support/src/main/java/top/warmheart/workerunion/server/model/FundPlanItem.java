package top.warmheart.workerunion.server.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table fund_plan_item
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class FundPlanItem implements Serializable {
    /**
     * Database Column Remarks:
     *   资金计划条目ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_plan_item.id
     *
     * @mbg.generated
     */
    private BigInteger id;

    /**
     * Database Column Remarks:
     *   企业ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_plan_item.company_id
     *
     * @mbg.generated
     */
    private BigInteger companyId;

    /**
     * Database Column Remarks:
     *   项目ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_plan_item.project_id
     *
     * @mbg.generated
     */
    private BigInteger projectId;

    /**
     * Database Column Remarks:
     *   采购条目ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_plan_item.purchase_item_id
     *
     * @mbg.generated
     */
    private BigInteger purchaseItemId;

    /**
     * Database Column Remarks:
     *   采购条目名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_plan_item.purchase_item_name
     *
     * @mbg.generated
     */
    private String purchaseItemName;

    /**
     * Database Column Remarks:
     *   关联成本分析深化项
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_plan_item.cost_analysis_item_deepen_id
     *
     * @mbg.generated
     */
    private BigInteger costAnalysisItemDeepenId;

    /**
     * Database Column Remarks:
     *   需求说明
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_plan_item.requirement
     *
     * @mbg.generated
     */
    private String requirement;

    /**
     * Database Column Remarks:
     *   资金（单位：元）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_plan_item.money
     *
     * @mbg.generated
     */
    private BigDecimal money;

    /**
     * Database Column Remarks:
     *   预计采购时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_plan_item.expected_purchase_date
     *
     * @mbg.generated
     */
    private Date expectedPurchaseDate;

    /**
     * Database Column Remarks:
     *   预计使用时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_plan_item.expected_service_date
     *
     * @mbg.generated
     */
    private Date expectedServiceDate;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_plan_item.cst_create
     *
     * @mbg.generated
     */
    private Date cstCreate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_plan_item.cst_modified
     *
     * @mbg.generated
     */
    private Date cstModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_plan_item
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_plan_item.id
     *
     * @return the value of fund_plan_item.id
     *
     * @mbg.generated
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_plan_item.id
     *
     * @param id the value for fund_plan_item.id
     *
     * @mbg.generated
     */
    public void setId(BigInteger id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_plan_item.company_id
     *
     * @return the value of fund_plan_item.company_id
     *
     * @mbg.generated
     */
    public BigInteger getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_plan_item.company_id
     *
     * @param companyId the value for fund_plan_item.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(BigInteger companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_plan_item.project_id
     *
     * @return the value of fund_plan_item.project_id
     *
     * @mbg.generated
     */
    public BigInteger getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_plan_item.project_id
     *
     * @param projectId the value for fund_plan_item.project_id
     *
     * @mbg.generated
     */
    public void setProjectId(BigInteger projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_plan_item.purchase_item_id
     *
     * @return the value of fund_plan_item.purchase_item_id
     *
     * @mbg.generated
     */
    public BigInteger getPurchaseItemId() {
        return purchaseItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_plan_item.purchase_item_id
     *
     * @param purchaseItemId the value for fund_plan_item.purchase_item_id
     *
     * @mbg.generated
     */
    public void setPurchaseItemId(BigInteger purchaseItemId) {
        this.purchaseItemId = purchaseItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_plan_item.purchase_item_name
     *
     * @return the value of fund_plan_item.purchase_item_name
     *
     * @mbg.generated
     */
    public String getPurchaseItemName() {
        return purchaseItemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_plan_item.purchase_item_name
     *
     * @param purchaseItemName the value for fund_plan_item.purchase_item_name
     *
     * @mbg.generated
     */
    public void setPurchaseItemName(String purchaseItemName) {
        this.purchaseItemName = purchaseItemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_plan_item.cost_analysis_item_deepen_id
     *
     * @return the value of fund_plan_item.cost_analysis_item_deepen_id
     *
     * @mbg.generated
     */
    public BigInteger getCostAnalysisItemDeepenId() {
        return costAnalysisItemDeepenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_plan_item.cost_analysis_item_deepen_id
     *
     * @param costAnalysisItemDeepenId the value for fund_plan_item.cost_analysis_item_deepen_id
     *
     * @mbg.generated
     */
    public void setCostAnalysisItemDeepenId(BigInteger costAnalysisItemDeepenId) {
        this.costAnalysisItemDeepenId = costAnalysisItemDeepenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_plan_item.requirement
     *
     * @return the value of fund_plan_item.requirement
     *
     * @mbg.generated
     */
    public String getRequirement() {
        return requirement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_plan_item.requirement
     *
     * @param requirement the value for fund_plan_item.requirement
     *
     * @mbg.generated
     */
    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_plan_item.money
     *
     * @return the value of fund_plan_item.money
     *
     * @mbg.generated
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_plan_item.money
     *
     * @param money the value for fund_plan_item.money
     *
     * @mbg.generated
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_plan_item.expected_purchase_date
     *
     * @return the value of fund_plan_item.expected_purchase_date
     *
     * @mbg.generated
     */
    public Date getExpectedPurchaseDate() {
        return expectedPurchaseDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_plan_item.expected_purchase_date
     *
     * @param expectedPurchaseDate the value for fund_plan_item.expected_purchase_date
     *
     * @mbg.generated
     */
    public void setExpectedPurchaseDate(Date expectedPurchaseDate) {
        this.expectedPurchaseDate = expectedPurchaseDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_plan_item.expected_service_date
     *
     * @return the value of fund_plan_item.expected_service_date
     *
     * @mbg.generated
     */
    public Date getExpectedServiceDate() {
        return expectedServiceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_plan_item.expected_service_date
     *
     * @param expectedServiceDate the value for fund_plan_item.expected_service_date
     *
     * @mbg.generated
     */
    public void setExpectedServiceDate(Date expectedServiceDate) {
        this.expectedServiceDate = expectedServiceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_plan_item.cst_create
     *
     * @return the value of fund_plan_item.cst_create
     *
     * @mbg.generated
     */
    public Date getCstCreate() {
        return cstCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_plan_item.cst_create
     *
     * @param cstCreate the value for fund_plan_item.cst_create
     *
     * @mbg.generated
     */
    public void setCstCreate(Date cstCreate) {
        this.cstCreate = cstCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_plan_item.cst_modified
     *
     * @return the value of fund_plan_item.cst_modified
     *
     * @mbg.generated
     */
    public Date getCstModified() {
        return cstModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_plan_item.cst_modified
     *
     * @param cstModified the value for fund_plan_item.cst_modified
     *
     * @mbg.generated
     */
    public void setCstModified(Date cstModified) {
        this.cstModified = cstModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_plan_item
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
        sb.append(", projectId=").append(projectId);
        sb.append(", purchaseItemId=").append(purchaseItemId);
        sb.append(", purchaseItemName=").append(purchaseItemName);
        sb.append(", costAnalysisItemDeepenId=").append(costAnalysisItemDeepenId);
        sb.append(", requirement=").append(requirement);
        sb.append(", money=").append(money);
        sb.append(", expectedPurchaseDate=").append(expectedPurchaseDate);
        sb.append(", expectedServiceDate=").append(expectedServiceDate);
        sb.append(", cstCreate=").append(cstCreate);
        sb.append(", cstModified=").append(cstModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
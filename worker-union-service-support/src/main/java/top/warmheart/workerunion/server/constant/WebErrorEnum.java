/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.constant;




/**
 * Web错误
 * @author seulad
 *
 */
public enum WebErrorEnum {
	ILLEGAL_PARAMETER("ILLEGAL_PARAMETER", "存在非法的参数，请检查请求参数"),
	UNKNOWN_ERROR("UNKNOWN_ERROR", "未知异常，请联系管理员"),
	NOT_LOGIN("NOT_LOGIN", "用户未登录"),
	UNAUTHORIZED("UNAUTHORIZED", "用户未授权"),
	INCORRECT_PASSWORD("INCORRECT_PASSWORD","密码错误"),
	UNKNOWN_ACCOUNT("UNKNOWN_ACCOUNT","账户不存在"),
	DISABLED_ACCOUNT("DISABLED_ACCOUNT","该账户已注销"),
	INCOMPATIBLE_PROJECT("INCOMPATIBLE_PROJECT", "项目不一致，请重新进入项目"),
	STAFF_CANNOT_DELETE("STAFF_CANNOT_DELETE", "无权限删除该员工"),
	
	DUPLICATE_PROJECT_NUM("DUPLICATE_PROJECT_NUM","项目编号已存在"),
	COST_ANALYSIS_EXIST("COST_ANALYSIS_EXIST","成本分析表已存在"),
	MATERIAL_TYPE_EXIST("MATERIAL_TYPE_EXIST","该企业材料类型编号已存在"),
	CONTRACT_EXIST("CONTRACT_EXIST","该合同编号已存在"),
	PROJECT_TEAM_EXIST("PROJECT_TEAM_EXIST","项目角色已存在或该成员已分配角色"),
	PROJECT_APPLICATION_EXIST("PROJECT_APPLICATION_EXIST","员工已报建项目或该角色已分配"),
	PROJECT_COLLAPSED("PROJECT_COLLAPSED","项目部已解体，操作失败"),
	PROJECT_ARCHIVED("PROJECT_ARCHIVED","项目已归档，操作失败"),
	PROJECT_ARCHIVE_RELEASE("PROJECT_ARCHIVE_RELEASE","项目已释放归档，操作失败"),
	ATTACHMENT_EXIST("ATTACHMENT_EXIST","该附件已存在"),
	ATTACHMENT_AUDITED("ATTACHMENT_AUDITED","该附件已审核，操作失败"),
	SETTLEMENT_ITEM_EXIST("SETTLEMENT_ITEM_EXIST","该资源落实当月已结算"),
	BUSINESS_CAPACITY_ITEM_EXIST("BUSINESS_CAPACITY_ITEM_EXIST","该月经营产值已存在"),
	BUSINESS_CAPACITY_ITEM_CHECKED("BUSINESS_CAPACITY_ITEM_CHECKED","该月经营产值已核定，操作失败"),
	PRODUCT_CAPACITY_ITEM_EXIST("PRODUCT_CAPACITY_ITEM_EXIST","该月生产产值已存在"),
	PRODUCT_CAPACITY_ITEM_CHECKED("PRODUCT_CAPACITY_ITEM_CHECKED","该月生产产值已核定，操作失败"),
	SAFETY_CHECK_ITEM_MODIFY_DISABLED("SAFETY_CHECK_ITEM_MODIFY_DISABLED","当前记录整改状态下无法修改"),
	QUALITY_CHECK_ITEM_MODIFY_DISABLED("QUALITY_CHECK_ITEM_MODIFY_DISABLED","当前记录整改状态下无法修改"),
	COST_ANALYSIS_ITEM_DEEPEN_LINKED("COST_ANALYSIS_ITEM_DEEPEN_LINKED","已关联资金计划项，操作失败"),
	FUND_PLAN_ITEM_LINKED("FUND_PLAN_ITEM_LINKED","已关联资源落实项，操作失败"),
	RESOURCE_IMPLEMENT_ITEM_LINKED("RESOURCE_IMPLEMENT_ITEM_LINKED","已关联结算管理项，操作失败"),
	MATERIAL_ORDER_EXIST("MATERIAL_ORDER_EXIST","该批次号已存在"),
	MATERIAL_HEADQUARTERS_ORDER_EXIST("MATERIAL_HEADQUARTERS_ORDER_EXIST","该批次号已存在"),
	MATERIAL_INSUFFICIENT("MATERIAL_INSUFFICIENT","材料库存不足，操作失败"),
	MATERIAL_HEADQUARTERS_INSUFFICIENT("MATERIAL_HEADQUARTERS_INSUFFICIENT","材料库存不足，操作失败"),
	SUPPLIER_EXIST("SUPPLIER_EXIST","该供应商编号已存在"),
	SUBCONTRACTOR_EXIST("SUBCONTRACTOR_EXIST","该分包商编号已存在"),
	FINAL_SETTLEMENT_ITEM_ATTACHMENT_EXIST("FINAL_SETTLEMENT_ITEM_ATTACHMENT_EXIST","该竣工决算附件已存在"),
	MATERIAL_TRANSFER_TO_ARCHIVED_PROJECT("MATERIAL_TRANSFER_TO_ARCHIVED_PROJECT","目标项目已归档，操作失败"),
	INCORRECT_PASSWORD_CONFIRM("INCORRECT_PASSWORD_CONFIRM","两次密码输入不一致"),

	PROJECT_DELETED("PROJECT_DELETED","该项目已删除"),
	STAFF_DELETED("STAFF_DELETED","该员工已删除"),
	ATTACHMENT_DELETED("ATTACHMENT_DELETED","该附件已删除"),
	PURCHASE_ITEM_DELETED("PURCHASE_ITEM_DELETED","该采购条目项已删除"),
	SAFETY_CHECK_ITEM_ATTACHMENT_DELETED("SAFETY_CHECK_ITEM_ATTACHMENT_DELETED","该安全记录附件已删除"),
	QUALITY_CHECK_ITEM_ATTACHMENT_DELETED("QUALITY_CHECK_ITEM_ATTACHMENT_DELETED","该质量记录附件已删除"),
	SAFETY_CHECK_ITEM_DELETED("SAFETY_CHECK_ITEM_DELETED","该安全记录已删除"),
	QUALITY_CHECK_ITEM_DELETED("QUALITY_CHECK_ITEM_DELETED","该质量记录已删除"),
	SUBCONTRACTOR_DELETED("SUBCONTRACTOR_DELETED","该分包商已删除"),
	SUPPLIER_DELETED("SUPPLIER_DELETED","该供应商已删除"),
	SUBCONTRACTOR_ATTACHMENT_DELETED("SUBCONTRACTOR_ATTACHMENT_DELETED","该分包商附件已删除"),
	SUPPLIER_ATTACHMENT_DELETED("SUPPLIER_ATTACHMENT_DELETED","该供应商附件已删除"),
	CONTRACT_DELETED("CONTRACT_DELETED","该合同已删除"),
	CONTRACT_ATTACHMENT_DELETED("CONTRACT_ATTACHMENT_DELETED","该合同附件已删除"),
	CERTIFICATE_ATTACHMENT_DELETED("CERTIFICATE_ATTACHMENT_DELETED","该证书附件已删除"),
	MATERIAL_TYPE_DELETED("INVALID_MATERIAL_TYPE_DELETED","该企业材料类型已删除"),
	MATERIAL_TYPE_ATTACHMENT_DELETED("MATERIAL_TYPE_ATTACHMENT_DELETED","该企业材料类型附件已删除"),
	CERTIFICATE_TYPE_DELETED("CERTIFICATE_TYPE_DELETED","该证书类型已删除"),
	CERTIFICATE_DELETED("CERTIFICATE_DELETED","该证书已删除"),
	FINAL_SETTLEMENT_ITEM_DELETED("FINAL_SETTLEMENT_ITEM_DELETED","该竣工决算项已删除"),
	FINAL_SETTLEMENT_ITEM_ATTACHMENT_DELETED("FINAL_SETTLEMENT_ITEM_ATTACHMENT_DELETED","该竣工决算项附件已删除"),
	MATERIAL_TRANSFER_APPLICATION_DELETED("MATERIAL_TRANSFER_APPLICATION_DELETED","该转库申请已删除"),
	MATERIAL_TRANSFER_APPLICATION_DETERMINED("MATERIAL_TRANSFER_APPLICATION_DETERMINED","该转库申请已审批"),
	ROLE_DELETED("ROLE_DELETED","该岗位已删除"),
	
	INVALID_FINAL_SETTLEMENT_ITEM("INVALID_FINAL_SETTLEMENT_ITEM","无效的竣工决算项"),
	INVALID_FINAL_SETTLEMENT_ITEM_ATTACHMENT("INVALID_FINAL_SETTLEMENT_ITEM_ATTACHMENT","无效的竣工决算项附件"),
	INVALID_STAFF("INVALID_STAFF","无效的员工信息"),
	INVALID_TEAM_ROLE("INVALID_TEAM_ROLE","无效的项目组角色信息"),
	INVALID_COST_ANALYSIS_ITEM("INVALID_COST_ANALYSIS_ITEM","无效的成本分析项"),
	INVALID_COST_ANALYSIS_ITEM_DEEPEN("INVALID_COST_ANALYSIS_ITEM_DEEPEN","无效的成本深化项"),
	INVALID_PROJECT_TEAM("INVALID_PROJECT_TEAM","无效的项目组成员信息"),
	INVALID_PROJECT_APPLICATION("INVALID_PROJECT_APPLICATION","无效的项目报建成员信息"),
	INVALID_ATTACHMENT("INVALID_ATTACHMENT","无效的附件"),
	INVALID_PROJECT("INVALID_PROJECT","无效的项目"),
	INVALID_FUND_PLAN_ITEM("INVALID_FUND_PLAN_ITEM","无效的资金计划项"),
	INVALID_PURCHASE_ITEM("INVALID_PURCHASE_ITEM","无效的采购条目"),
	INVALID_YEARMONTH("INVALID_YEARMONTH", "月份不在有效范围内"),
	INVALID_BUSINESS_CAPACITY_ITEM("INVALID_BUSINESS_CAPACITY_ITEM", "无效的经营产值项"),
	INVALID_PRODUCT_CAPACITY_ITEM("INVALID_PRODUCT_CAPACITY_ITEM", "无效的生产产值项"),
	INVALID_TARGET("INVALID_TARGET", "未录入项目目标，请指定目标后操作"),
	INVALID_SAFETY_CHECK_ITEM_ATTACHMENT("INVALID_SAFETY_CHECK_ITEM_ATTACHMENT","无效的安全记录附件"),
	INVALID_QUALITY_CHECK_ITEM_ATTACHMENT("INVALID_QUALITY_CHECK_ITEM_ATTACHMENT","无效的质量记录附件"),
	INVALID_SAFETY_CHECK_ITEM("INVALID_SAFETY_CHECK_ITEM","无效的安全记录"),
	INVALID_QUALITY_CHECK_ITEM("INVALID_QUALITY_CHECK_ITEM","无效的质量记录"),
	INVALID_RESOURCE_IMPLEMENT_ITEM("INVALID_RESOURCE_IMPLEMENT_ITEM","无效的资源落实项"),
	INVALID_SUBCONTRACTOR("INVALID_SUBCONTRACTOR","无效的分包商"),
	INVALID_SUBCONTRACTOR_GRADE("INVALID_SUBCONTRACTOR_GRADE","无效的分包商级别"),
	INVALID_SUBCONTRACTOR_QUALIFICATION("INVALID_SUBCONTRACTOR_QUALIFICATION","存在无效的分包商资质"),
	INVALID_SUBCONTRACTOR_ATTACHMENT("INVALID_SUBCONTRACTOR_ATTACHMENT","无效的分包商附件"),
	INVALID_CERTIFICATE_ATTACHMENT("INVALID_CERTIFICATE_ATTACHMENT","无效的证书附件"),
	INVALID_SUPPLIER("INVALID_SUPPLIER","无效的供应商"),
	INVALID_SUPPLIER_GRADE("INVALID_SUPPLIER_GRADE","无效的供应商级别"),
	INVALID_SUPPLIER_QUALIFICATION("INVALID_SUPPLIER_QUALIFICATION","存在无效的供应商资质"),
	INVALID_SUPPLIER_ATTACHMENT("INVALID_SUPPLIER_ATTACHMENT","无效的供应商附件"),
	INVALID_CONTRACT("INVALID_CONTRACT","无效的合同"),
	INVALID_CONTRACT_ATTACHMENT("INVALID_CONTRACT_ATTACHMENT","无效的合同附件"),
	INVALID_SETTLEMENT_ITEM("INVALID_SETTLEMENT_ITEM","无效的结算项"),
	INVALID_MATERIAL("INVALID_MATERIAL","无效的项目材料信息"),
	INVALID_MATERIAL_TRANSFER_APPLICATION("INVALID_MATERIAL_TRANSFER_APPLICATION","无效的转库申请"),
	INVALID_MATERIAL_HEADQUARTERS("INVALID_MATERIAL_HEADQUARTERS","无效的总部仓库材料信息"),
	INVALID_MATERIAL_TYPE("INVALID_MATERIAL_TYPE","无效的企业材料类型"),
	INVALID_MATERIAL_TYPE_ATTACHMENT("INVALID_MATERIAL_TYPE_ATTACHMENT","无效的企业材料类型附件"),
	INVALID_MATERIAL_BATCH_NO("INVALID_MATERIAL_BATCH_NO","无效的材料批次号，B/HQB前缀为系统保留字段"),
	INVALID_MATERIAL_HEADQUARTERS_BATCH_NO("INVALID_MATERIAL_HEADQUARTERS_BATCH_NO","无效的材料批次号，B/HQB前缀为系统保留字段"),
	INVALID_CERTIFICATE_TYPE("INVALID_CERTIFICATE_TYPE","无效的证书类型"),
	INVALID_CERTIFICATE("INVALID_CERTIFICATE","无效的证书信息"),
	INVALID_ROLE("INVALID_ROLE","无效的岗位信息"),
	INVALID_ID_CARD("INVALID_ID_CARD", "无效的身份证号码"),
	
	STAFF_JOBNO_EXIST("STAFF_JOBNO_EXIST", "工号已存在");
	
	public String errorCode;
	public String errorCodeDesc;
	public static final String CODE = "errorCode";
	public static final String CODE_DESC = "errorCodeDesc";
	
	private WebErrorEnum(String errorCode, String errorCodeDesc) {
		this.errorCode = errorCode;
		this.errorCodeDesc = errorCodeDesc;
	}
}

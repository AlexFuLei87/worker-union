package top.warmheart.workerunion.server.dao;

import java.math.BigInteger;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.warmheart.workerunion.server.model.StaffHasRole;

public interface StaffHasRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_has_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("staffId") BigInteger staffId, @Param("roleId") BigInteger roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_has_role
     *
     * @mbg.generated
     */
    int insert(StaffHasRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_has_role
     *
     * @mbg.generated
     */
    List<StaffHasRole> selectAll();

	void deleteByStaffId(BigInteger staffId);
}
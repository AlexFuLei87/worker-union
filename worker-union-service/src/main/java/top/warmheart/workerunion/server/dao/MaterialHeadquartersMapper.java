package top.warmheart.workerunion.server.dao;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.model.MaterialHeadquarters;

public interface MaterialHeadquartersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_headquarters
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigInteger id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_headquarters
     *
     * @mbg.generated
     */
    int insert(MaterialHeadquarters record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_headquarters
     *
     * @mbg.generated
     */
    MaterialHeadquarters selectByPrimaryKey(BigInteger id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_headquarters
     *
     * @mbg.generated
     */
    List<MaterialHeadquarters> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_headquarters
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MaterialHeadquarters record);

	Integer countByFuzzy(@Param("companyId")BigInteger companyId,@Param("num") String num,@Param("name") String name);

	List<MaterialHeadquarters> pageByFuzzy(@Param("companyId")BigInteger companyId,@Param("num") String num,@Param("name") String name,@Param("page") Page<?> page);

	MaterialHeadquarters selectByNum(@Param("companyId")BigInteger companyId,@Param("num") String num);

	int insertOrAccumulate(MaterialHeadquarters materialHeadquarters);

	MaterialHeadquarters selectByNum4Update(@Param("companyId")BigInteger companyId,@Param("num") String num);


}
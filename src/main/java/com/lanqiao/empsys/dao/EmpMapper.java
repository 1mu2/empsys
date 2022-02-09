package com.lanqiao.empsys.dao;

import com.lanqiao.empsys.model.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author mushen
* @description 针对表【emp】的数据库操作Mapper
* @createDate 2022-02-09 17:37:52
* @Entity com.lanqiao.empsys.model.Emp
*/
public interface EmpMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer id);

    List<Emp> selectByActive(@Param("emp") Emp record,
                            @Param("pageNum") int pageNum ,
                            @Param("pageSize") int pageSize);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

}

package com.lanqiao.empsys.service;

import com.lanqiao.empsys.model.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
* @author mushen
* @description 针对表【emp】的数据库操作Service
* @createDate 2022-02-09 17:36:49
*/
public interface IEmpService {
    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer id);

    List<Emp> selectByActive( Emp record, int pageNum,int pageSize);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}

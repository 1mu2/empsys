package com.lanqiao.empsys.service.impl;

import com.lanqiao.empsys.dao.EmpMapper;
import com.lanqiao.empsys.model.Emp;
import com.lanqiao.empsys.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author mushen
* @description 针对表【emp】的数据库操作Service实现
* @createDate 2022-02-09 17:36:49
*/
@Service("empService")
public class EmpServiceImpl implements IEmpService {

    @Autowired
    EmpMapper empMapper;

    @Override
    public int deleteByPrimaryKey (Integer id) {
        return this.empMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert (Emp emp) {
        return this.empMapper.insert(emp);
    }

    @Override
    public int insertSelective (Emp emp) {
        return this.empMapper.insertSelective(emp);
    }

    @Override
    public Emp selectByPrimaryKey (Integer id) {
        return this.empMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Emp> selectByActive (Emp record, int pageNum, int pageSize) {
        return this.empMapper.selectByActive(record,pageNum,pageSize);
    }

    @Override
    public int updateByPrimaryKeySelective (Emp record) {
        return this.empMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey (Emp record) {
        return this.empMapper.updateByPrimaryKey(record);
    }
}





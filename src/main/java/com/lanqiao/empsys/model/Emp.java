package com.lanqiao.empsys.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName emp
 */
@Data
public class Emp implements Serializable {
    /**
     * 
     */
    private Integer empno;

    /**
     * 
     */
    private String ename;
    private String mname;
    private String dname;

    /**
     * 
     */
    private String job;

    /**
     * 
     */
    private Integer mgr;

    /**
     * 
     */
    private String hiredate;

    /**
     * 
     */
    private Integer sal;

    /**
     * 
     */
    private Integer comm;

    /**
     * 
     */
    private Integer deptno;

}
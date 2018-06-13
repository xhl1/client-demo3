package com.example.clientdemo3.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lxh
 * @ClassName: Loan
 * @Package com.mdl.cts.entity
 * @Description: TODO 放款信息表
 * @date 2018/5/16下午 1:23
 */
@Data
@Table(name = "t_loan")
public class Loan {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*
     *融资申请id
     * */
    private Long applyId;
    /*
     * 融资号
     * */
    private String applyCode;
    /*
     * 融资金额
     * */
    private Long amount;
    /*
     * 企业id
     * */
    private Long enterpriseId;
    /*
     * 企业名称
     * */
    private String enterpriseName;
    /*
     * 已放款金额
     * */
    private Long lendAmount;
    /*
     * 起息日
     * */
    private Long valueDate;
    /*
     * 状态，1：放款中，2：放款完成
     * */
    private Integer status;
    /*
     * 放款时间
     * */
    private Long lendTime;
    /*
     * 创建时间
     * */
    private Long createTime;
    /*
     * 更新时间
     * */
    private Long updateTime;

}

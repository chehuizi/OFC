package com.fanxing.ofc.domain.entity;

import lombok.Data;

/**
 * 履约单据
 * @author chehuizi
 */
@Data
public class OmsOfcOrder extends DomainEntityBase {

    /**
     * 单号
     */
    private String orderNo;
    /**
     * 单据类型
     */
    private Integer orderType;
}

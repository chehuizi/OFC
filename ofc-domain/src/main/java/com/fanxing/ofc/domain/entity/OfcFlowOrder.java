package com.fanxing.ofc.domain.entity;

import lombok.Builder;
import lombok.Data;

/**
 * 履约流程单据
 * @author chehuizi
 */
@Builder
@Data
public class OfcFlowOrder extends DomainEntityBase {



    /**
     * 履约流程单号
     */
    private String ofcFlowNo;
    /**
     * OMS单号
     */
    private String omsOrderNo;
    /**
     * OMS单据类型
     */
    private Integer omsOrderType;
    /**
     * 履约流程配置ID
     */
    private Integer flowId;
}

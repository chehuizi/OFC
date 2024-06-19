package com.fanxing.ofc.domain.entity;

import com.fanxing.ofc.domain.entity.vo.OfcFlowNodeConfig;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 履约流程配置
 * @author chehuizi
 */
@Builder
@Data
public class OfcFlowConfig extends DomainEntityBase {

    /**
     * 履约流程配置ID
     */
    private Integer flowId;
    /**
     * 履约流程名称
     */
    private String  flowName;
    /**
     * 履约流程节点配置列表
     */
    private List<OfcFlowNodeConfig> nodeConfigList;
}

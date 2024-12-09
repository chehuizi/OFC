package com.fanxing.ofc.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 领域实体基类
 * @author chehuizi
 */
@Data
public class DomainEntityBase implements Serializable {

    private static final long serialVersionUID = 2417165205000251911L;

    /**
     * 实体ID（实体唯一标识）
     */
    private String entityId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifyTime;

}

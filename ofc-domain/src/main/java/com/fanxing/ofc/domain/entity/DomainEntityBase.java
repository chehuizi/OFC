package com.fanxing.ofc.domain.entity;

import java.io.Serializable;

/**
 * 领域实体基类
 * @author chehuizi
 */
public class DomainEntityBase implements Serializable{

    private static final long serialVersionUID = 2417165205000251911L;

    /**
     * 实体ID（实体唯一标识）
     */
    private String entityId;
}

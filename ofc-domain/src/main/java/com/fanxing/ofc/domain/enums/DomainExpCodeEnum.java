package com.fanxing.ofc.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 领域错误枚举
 * @author chehuizi
 */
@AllArgsConstructor
@Getter
public enum DomainExpCodeEnum {
    REPOSITORY_CREATE_ERROR(800001, "创建失败"),
    REPOSITORY_UPDATE_ERROR(800002, "更新失败"),
    REPOSITORY_DELETE_ERROR(800003, "删除失败"),
    REPOSITORY_SELECT_ERROR(800004, "查询失败"),
    ;

    /**
     * 错误码
     */
    private Integer errCode;
    /**
     * 错误信息
     */
    private String  errMsg;
}

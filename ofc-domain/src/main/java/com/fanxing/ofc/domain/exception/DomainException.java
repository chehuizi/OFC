package com.fanxing.ofc.domain.exception;

import com.fanxing.ofc.domain.enums.DomainExpCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 领域异常
 * @author chehuizi
 */
@AllArgsConstructor
@Data
public class DomainException extends RuntimeException {

    /**
     * 错误码
     */
    private Integer errCode;
    /**
     * 错误信息
     */
    private String  errMsg;

    public DomainException(DomainExpCodeEnum domainExpCodeEnum, Exception ex) {
        super(ex);
        this.setErrCode(domainExpCodeEnum.getErrCode());
        this.setErrMsg(domainExpCodeEnum.getErrMsg());
    }
}

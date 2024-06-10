package com.fanxing.ofc.domain.exception;

import com.fanxing.ofc.domain.enums.DomainErrorEnum;
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

    public DomainException(DomainErrorEnum domainErrorEnum, Exception ex) {
        super(ex);
        this.setErrCode(domainErrorEnum.getErrCode());
        this.setErrMsg(domainErrorEnum.getErrMsg());
    }
}

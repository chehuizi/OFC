package com.fanxing.ofc.domain.repository;

import com.fanxing.ofc.domain.entity.DomainEntityBase;
import com.fanxing.ofc.domain.exception.DomainException;
import com.fanxing.ofc.domain.repository.param.DomainEntityQueryParamBase;

import java.util.List;

/**
 * 领域实体仓库
 * @author chehuizi
 * @param <T> 领域实体
 * @param <R> 领域实体查询参数
 */
public interface DomainEntityRepository<T extends DomainEntityBase, R extends DomainEntityQueryParamBase> {

    /**
     * 创建
     * @param t
     * @return
     * @throws DomainException
     */
    Boolean create(T t) throws DomainException;

    /**
     * 更新
     * @param t
     * @return
     * @throws DomainException
     */
    Boolean update(T t) throws DomainException;

    /**
     * 删除
     * @param t
     * @return
     * @throws DomainException
     */
    Boolean delete(T t) throws DomainException;

    /**
     * 查询单个实体
     * @param r
     * @return
     * @throws DomainException
     */
    T selectOne(R r) throws DomainException;

    /**
     * 查询实体列表
     * @param r
     * @return
     * @throws DomainException
     */
    List<T> selectList(R r) throws DomainException;
}

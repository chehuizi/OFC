package com.fanxing.ofc.infrastructure.repository.impl;

import com.fanxing.ofc.domain.entity.DomainEntityBase;
import com.fanxing.ofc.domain.enums.DomainExpCodeEnum;
import com.fanxing.ofc.domain.exception.DomainException;
import com.fanxing.ofc.domain.repository.DomainEntityRepository;
import com.fanxing.ofc.domain.repository.param.DomainEntityQueryParamBase;

import java.util.List;

/**
 * 持久化仓库基类
 */
public abstract class DomainEntityRepositoryImplBase<T extends DomainEntityBase, R extends DomainEntityQueryParamBase>
        implements DomainEntityRepository<T, R> {
    @Override
    public Boolean create(T t) throws DomainException {
        try {
            return createImpl(t);
        } catch (Exception ex) {
            throw new DomainException(DomainExpCodeEnum.REPOSITORY_CREATE_ERROR, ex);
        }
    }

    protected abstract Boolean createImpl(T t);

    @Override
    public Boolean update(T t) throws DomainException {
        try {
            return updateImpl(t);
        } catch (Exception ex) {
            throw new DomainException(DomainExpCodeEnum.REPOSITORY_UPDATE_ERROR, ex);
        }
    }

    protected abstract Boolean updateImpl(T t);

    @Override
    public Boolean delete(T t) throws DomainException {
        try {
            return deleteImpl(t);
        } catch (Exception ex) {
            throw new DomainException(DomainExpCodeEnum.REPOSITORY_DELETE_ERROR, ex);
        }
    }

    protected abstract Boolean deleteImpl(T t);

    @Override
    public T selectOne(R r) throws DomainException {
        try {
            return selectOneImpl(r);
        } catch (Exception ex) {
            throw new DomainException(DomainExpCodeEnum.REPOSITORY_DELETE_ERROR, ex);
        }
    }

    protected abstract T selectOneImpl(R r);

    @Override
    public List<T> selectList(R r) throws DomainException {
        try {
            return selectListImpl(r);
        } catch (Exception ex) {
            throw new DomainException(DomainExpCodeEnum.REPOSITORY_DELETE_ERROR, ex);
        }
    }

    protected abstract List<T> selectListImpl(R r);
}

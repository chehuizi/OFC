package com.fanxing.ofc.infrastructure.repository.impl;

import com.fanxing.ofc.domain.entity.OmsOfcOrder;
import com.fanxing.ofc.domain.repository.OmsOfcOrderRepository;
import com.fanxing.ofc.domain.repository.param.OmsOfcOrderQueryParam;

import java.util.List;

public class OmsOfcOrderRepositoryImpl extends DomainEntityRepositoryImplBase<OmsOfcOrder, OmsOfcOrderQueryParam>
    implements OmsOfcOrderRepository {

    @Override
    public Boolean createImpl(OmsOfcOrder omsOfcOrder) {
        return null;
    }

    @Override
    protected Boolean updateImpl(OmsOfcOrder omsOfcOrder) {
        return null;
    }

    @Override
    protected Boolean deleteImpl(OmsOfcOrder omsOfcOrder) {
        return null;
    }

    @Override
    protected OmsOfcOrder selectOneImpl(OmsOfcOrderQueryParam omsOfcOrderQueryParam) {
        return null;
    }

    @Override
    protected List<OmsOfcOrder> selectListImpl(OmsOfcOrderQueryParam omsOfcOrderQueryParam) {
        return null;
    }
}

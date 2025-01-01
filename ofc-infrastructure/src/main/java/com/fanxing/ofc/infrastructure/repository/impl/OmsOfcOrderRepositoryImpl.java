package com.fanxing.ofc.infrastructure.repository.impl;

import com.fanxing.ofc.domain.entity.OmsOfcOrder;
import com.fanxing.ofc.domain.repository.OmsOfcOrderRepository;
import com.fanxing.ofc.domain.repository.param.OmsOfcOrderQueryParam;
import com.fanxing.ofc.infrastructure.mapper.OmsOfcOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OmsOfcOrderRepositoryImpl extends DomainEntityRepositoryImplBase<OmsOfcOrder, OmsOfcOrderQueryParam>
    implements OmsOfcOrderRepository {

    @Autowired
    private OmsOfcOrderMapper omsOfcOrderMapper;

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

package com.fanxing.ofc;

import com.fanxing.ofc.domain.repository.OmsOfcOrderRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OmsOfcOrderRepositoryTest {

    @Autowired
    private OmsOfcOrderRepository omsOfcOrderRepository;

    @Test
    public void test() {
        omsOfcOrderRepository.selectOne(null);
    }
}

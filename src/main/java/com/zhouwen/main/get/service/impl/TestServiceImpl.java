package com.zhouwen.main.get.service.impl;

import com.zhouwen.main.get.dao.mapper.TbWebmagicConfigureMapper;
import com.zhouwen.main.get.dao.pojo.TbWebmagicConfigure;
import com.zhouwen.main.get.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestServiceImpl
 * @Description
 * @Author CZZTECH
 * @DateTime 2018/8/20 17:17
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    TbWebmagicConfigureMapper tbWebmagicConfigureMapper;

    @Override
    public TbWebmagicConfigure selectOneRecord() {
        TbWebmagicConfigure test = new TbWebmagicConfigure();
        test.setName("test");
        test.setType("test_url");
        test.setValue("test_value");
        tbWebmagicConfigureMapper.insert(test);
        return null;
    }
}

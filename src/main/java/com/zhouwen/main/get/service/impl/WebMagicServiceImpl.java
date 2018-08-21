package com.zhouwen.main.get.service.impl;

import com.zhouwen.main.get.core.WebMagicProcessor;
import com.zhouwen.main.get.dao.mapper.TbWebmagicConfigureMapper;
import com.zhouwen.main.get.dao.pojo.TbWebmagicConfigure;
import com.zhouwen.main.get.pipline.WebMagicPipline;
import com.zhouwen.main.get.service.WebMagicService;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.Spider;

import javax.annotation.Resource;

/**
 * @ClassName WebMagicServiceImpl
 * @Description
 * @Author CZZTECH
 * @DateTime 2018/8/21 14:52
 */
@Service
public class WebMagicServiceImpl implements WebMagicService {

    @Resource
    TbWebmagicConfigureMapper tbWebmagicConfigureMapper;

    @Override
    public void getIfengData() {
        TbWebmagicConfigure tbWebmagicConfigure = new TbWebmagicConfigure();
        tbWebmagicConfigure.setName("conf_url");
        tbWebmagicConfigure.setType("conf_type");
        tbWebmagicConfigureMapper.selectOne(tbWebmagicConfigure);
        Spider.create(new WebMagicProcessor()).addUrl("http://www.ifeng.com/")
                .addPipeline(new WebMagicPipline()).thread(5).run();
    }
}

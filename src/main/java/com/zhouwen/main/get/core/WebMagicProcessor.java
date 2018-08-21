package com.zhouwen.main.get.core;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @ClassName WebMagicProcessor
 * @Description
 * @Author CZZTECH
 * @DateTime 2018/8/21 14:48
 */
public class WebMagicProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);

    //页面信息
    @Override
    public void process(Page page) {

    }

    @Override
    public Site getSite() {
        return site;
    }
}

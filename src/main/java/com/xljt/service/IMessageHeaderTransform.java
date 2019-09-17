package com.xljt.service;

import com.xljt.pojo.MessageHeaderPojo;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : IMessageHeaderTransform <br>
 * @date : 2019/9/12 16:24 <br>
 */
public interface IMessageHeaderTransform {

    /**
     * 将原始报文解析，此处只解析头部和主体数据
     * @param oldMessage 原始完整报文
     * @return
     */
    MessageHeaderPojo getMessageHeader(String oldMessage);

}

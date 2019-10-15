package com.xljt.transformservice;

import com.xljt.pojo.MessageLocationPojo;

/**
 * @author : XU
 * @version : 1.0
 * @description : IMessageLocationTransform 车辆位置解析
 * @date : 2019/9/16 13:55
 */
public interface IMessageLocationTransform {

    /**
     * 解析车辆定位单元数据
     * @param oldMessage
     * @param index
     * @return
     */
    MessageLocationPojo getMessageLocation(String oldMessage,int index);
}

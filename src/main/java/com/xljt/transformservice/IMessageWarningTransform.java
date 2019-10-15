package com.xljt.transformservice;

import com.xljt.pojo.MessageWarningPojo;

/**
 * @author : XU
 * @version : 1.0
 * @description : IMessageWarningTransform 报警数据
 * @date : 2019/9/17 10:12
 */
public interface IMessageWarningTransform {

    MessageWarningPojo getMessageWarning(String oldMessage, int index);

}

package com.xljt.service;

import com.xljt.pojo.MessageWarningPojo;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : IMessageWarningTransform <br>
 * @date : 2019/9/17 10:12 <br>
 */
public interface IMessageWarningTransform {

    MessageWarningPojo getMessageWarning(String oldMessage, int index);

}

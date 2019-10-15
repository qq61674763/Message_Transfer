package com.xljt.transformservice.transformImpl;

import com.xljt.pojo.MessageLocationPojo;
import com.xljt.transformservice.IMessageLocationTransform;
import com.xljt.utils.MessageFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageLocationTransformImpl <br>
 * @date : 2019/9/16 14:04 <br>
 */
@Service
public class MessageLocationTransformImpl implements IMessageLocationTransform, Serializable {

    @Autowired
    private MessageLocationPojo messageLocationPojo ;

    /**
     * 解析车辆定位单元数据
     *
     * @param oldMessage
     * @return
     */
    @Override
    public MessageLocationPojo getMessageLocation(String oldMessage, int index) {
        //定位状态
        messageLocationPojo.setLocationStatus(oldMessage.substring(index, index + 2));
        index += 2;
        //经度
        messageLocationPojo.setLongitude(MessageFormat.numberToInt(oldMessage.substring(index, index + 8)));
        index += 8;
        //纬度
        messageLocationPojo.setLatitude(MessageFormat.numberToInt(oldMessage.substring(index, index + 8)));
        index += 8;
        messageLocationPojo.setIndex(index);

        return messageLocationPojo;
    }
}

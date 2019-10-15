package com.xljt.transformservice.transformImpl;

import com.xljt.pojo.MessageCustomizePojo;
import com.xljt.transformservice.IMessageCustomizeTransform;
import com.xljt.utils.MessageFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : XU
 * @version : 1.0
 * @description : MessageCustomizeTransformImpl
 * @date : 2019/9/17 16:03
 */
@Service
public class MessageCustomizeTransformImpl implements IMessageCustomizeTransform {

    @Autowired
    MessageCustomizePojo messageCustomize;

    @Override
    public MessageCustomizePojo getMessageCustomize(String oldMessage, int index) {
        messageCustomize.setCustomizeLength(MessageFormat.numberToInt(oldMessage.substring(index, index + 4)));
        index += 4;
        messageCustomize.setCustomizeData(oldMessage.substring(index, index + Integer.valueOf(messageCustomize.getCustomizeLength()) * 2));
        index += Integer.valueOf(messageCustomize.getCustomizeLength()) * 2;
        messageCustomize.setIndex(index);
        return messageCustomize;
    }
}

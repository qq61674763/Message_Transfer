package com.xljt.service.transformImpl;

import com.xljt.pojo.MessageCustomizePojo;
import com.xljt.service.IMessageCustomizeTransform;
import com.xljt.utils.MessageFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageCustomizeTransformImpl <br>
 * @date : 2019/9/17 16:03 <br>
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

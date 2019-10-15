package com.xljt.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageCustomizePojo <br>
 * @date : 2019/9/17 15:58 <br>
 */
@Component
public class MessageCustomizePojo {

    private String customizeLength;
    private String customizeData;
    private int index;

    public String getCustomizeLength() {
        return customizeLength;
    }

    public void setCustomizeLength(String customizeLength) {
        this.customizeLength = customizeLength;
    }

    public String getCustomizeData() {
        return customizeData;
    }

    public void setCustomizeData(String customizeData) {
        this.customizeData = customizeData;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "MessageCustomizePojo{" +
                "customizeLength='" + customizeLength + '\'' +
                ", customizeData='" + customizeData + '\'' +
                ", index=" + index +
                '}';
    }
}

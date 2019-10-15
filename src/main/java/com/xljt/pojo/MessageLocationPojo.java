package com.xljt.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageLocationPojo <br>
 * @date : 2019/9/16 13:57 <br>
 */
@Component
public class MessageLocationPojo {
    /**
     * 定位状态
     */
    private String locationStatus;
    /**
     * 经度
     */
    private String longitude;
    /**
     * 纬度
     */
    private String latitude;
    /**
     * 偏移量
     */
    private int index;

    public void setLocationStatus(String locationStatus) {
        this.locationStatus = locationStatus;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getLocationStatus() {
        return locationStatus;
    }

    @Override
    public String toString() {
        return "MessageLocationPojo{" +
                "locationStatus='" + locationStatus + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", index=" + index +
                '}';
    }
}

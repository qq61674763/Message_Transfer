package com.xljt.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author : XU
 * @version : 1.0
 * @description : CarLocation
 * @date : 2019/9/12 10:23
 */
@Component
public class CarLocationPojo implements Serializable {

    private String locationStatus;
    private String longitude;
    private String latitude;

    public String getLocationStatus() {
        return locationStatus;
    }

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
}

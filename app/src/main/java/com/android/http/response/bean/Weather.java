package com.android.http.response.bean;

/**
 * Created by liyanan on 16/4/22.
 */
public class Weather {


    /**
     * city : 北京
     * pinyin : beijing
     * citycode : 101010100
     * date : 16-04-22
     * time : 08:00
     * postCode : 100000
     * longitude : 116.391
     * latitude : 39.904
     * altitude : 33
     * weather : 晴
     * temp : 25
     * l_tmp : 11
     * h_tmp : 25
     * WD : 北风
     * WS : 3-4级(10~17km/h)
     * sunrise : 05:25
     * sunset : 18:59
     */

    private String city;
    private String pinyin;
    private String citycode;
    private String date;
    private String time;
    private String postCode;
    private double longitude;
    private double latitude;
    private String altitude;
    private String weather;
    private String temp;
    private String l_tmp;
    private String h_tmp;
    private String WD;
    private String WS;
    private String sunrise;
    private String sunset;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getL_tmp() {
        return l_tmp;
    }

    public void setL_tmp(String l_tmp) {
        this.l_tmp = l_tmp;
    }

    public String getH_tmp() {
        return h_tmp;
    }

    public void setH_tmp(String h_tmp) {
        this.h_tmp = h_tmp;
    }

    public String getWD() {
        return WD;
    }

    public void setWD(String WD) {
        this.WD = WD;
    }

    public String getWS() {
        return WS;
    }

    public void setWS(String WS) {
        this.WS = WS;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "city:" + city + "\n"
                + "pinyin:" + pinyin + "\n"
                + "citycode:" + citycode + "\n"
                + "date:" + date + "\n"
                + "time:" + time + "\n"
                + "postCode:" + postCode + "\n"
                + "longitude:" + longitude + "\n"
                + "latitude:" + latitude + "\n"
                + "altitude:" + altitude + "\n"
                + "weather:" + weather + "\n"
                + "temp:" + temp + "\n"
                + "WD:" + WD + "\n"
                + "WS:" + WS + "\n"
                + "sunrise:" + sunrise + "\n";
    }
}

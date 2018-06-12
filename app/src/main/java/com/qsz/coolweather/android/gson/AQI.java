package com.qsz.coolweather.android.gson;

/**
 * Created by QSZ on 2018/6/8 15:24
 * 包含当前空气质量的基本情况
 * @author QSZ
 */
public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }

}

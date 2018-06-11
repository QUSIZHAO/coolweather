package com.qsz.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by QSZ on 2018/6/8 15:20
 * 包含城市的基本信息
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update mUpdate;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}

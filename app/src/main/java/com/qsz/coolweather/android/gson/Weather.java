package com.qsz.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 总实例类引用各个实体类
 * Created by QSZ on 2018/6/8 15:43
 */
public class Weather {

    public String status;
    public Basic mBasic;
    public AQI mAQI;
    public Now mNow;
    public Suggestoin mSuggestoin;

    @SerializedName("daily_forecast")
    public List<Forecast> mForecastList;
}

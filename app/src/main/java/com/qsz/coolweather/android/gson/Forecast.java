package com.qsz.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 包含未来几天的天气信息
 * Created by QSZ on 2018/6/8 15:38
 * @author QSZ
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

}

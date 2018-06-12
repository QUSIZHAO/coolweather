package com.qsz.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by QSZ on 2018/6/8 15:26
 * 包含当前的天气信息
 * @author QSZ
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}

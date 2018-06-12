package com.qsz.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by QSZ on 2018/6/8 15:30
 * 包含天气相关的生活建议
 * @author QSZ
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }

}

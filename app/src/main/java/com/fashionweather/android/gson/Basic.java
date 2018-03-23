package com.fashionweather.android.gson;

import com.google.gson.annotations.SerializedName;

    /**
     * Created by Administrator on 2018/3/20 0020.
     */

    public class Basic {
        @SerializedName("location")     //SerializedName注解实现json字段和Java字段之间建立映射关系
        public String cityName;

        @SerializedName("cid")
        public String weatherId;

}

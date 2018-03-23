package com.fashionweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/3/20 0020.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond_txt")
    public String condInfo;

}

package com.fashionweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/3/20 0020.
 */

public class Suggestion {
    @SerializedName("brf")
    String sign;

    public String type;

    @SerializedName("txt")
    public String suggestion;

}

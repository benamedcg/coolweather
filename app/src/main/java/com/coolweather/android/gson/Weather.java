package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2018/3/20 0020.
 */

public class Weather {

    public String status;

    public Basic basic;

    public Now now;

    public Update update;

    @SerializedName("lifestyle")
    public List<Suggestion> suggestionList;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
    
}

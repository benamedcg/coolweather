package com.coolweather.android.util;

import android.text.TextUtils;

import com.coolweather.android.db.City;
import com.coolweather.android.db.County;
import com.coolweather.android.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2018/3/19 0019.
 */

public class Utility {
    /***
     * 解析和处理服务器返回的省级数据
     *
     * */
    public static boolean handleProvinceResponse(String response){

        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces = new JSONArray(response);
                for (int i=0;i<allProvinces.length();i++){
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    /***
     * 解析和处理服务器返回的市级数据
     *
     * */
    public static boolean handleCityResponse(String response,int cityId){

        if(!TextUtils.isEmpty(response)) try {
            JSONArray allCountries = new JSONArray(response);
            for (int i = 0; i < allCountries.length(); i++) {
                JSONObject countryObject = allCountries.getJSONObject(i);
                County county = new County();
                county.setCountyName(countryObject.getString("name"));
                county.setWeatherId(countryObject.getString("id"));
                county.setCityId(cityId);
                county.save();
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }

    /***
     * 解析和处理服务器返回的县级数据
     *
     * */
    public static boolean handleCountryResponse(String response,int prvinceId){

        if(!TextUtils.isEmpty(response)) try {
            JSONArray allCities = new JSONArray(response);
            for (int i = 0; i < allCities.length(); i++) {
                JSONObject cityObject = allCities.getJSONObject(i);
                City city = new City();
                city.setCityName(cityObject.getString("name"));
                city.setCityCode(cityObject.getInt("id"));
                city.setProvinceId(prvinceId);
                city.save();
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }
}




















package com.huahuaxiaomuzhu.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JsonUtil {
    /**
     * 处理json
     * @param rawText
     * @return 格式化的json或者错误信息
     */
    public static String handleJson(String rawText){
        if (rawText.equals("")){
            return "";
        }
        try {
            JSONObject jsonObject= JSONObject.parseObject(rawText);

        return JSON.toJSONString(jsonObject, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteDateUseDateFormat);}
        catch (JSONException e){
            return e.getMessage();
        }
    }
}

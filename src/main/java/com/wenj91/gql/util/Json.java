package com.wenj91.gql.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Json {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    static {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        objectMapper.setDateFormat(sdf);
    }

    public static String stringify(Object o){
        try {
            return objectMapper.writeValueAsString(o);
        }catch (Exception e){
            log.error("json stringify err:", e);
            return "";
        }
    }

    public static <T> T parse(String str, Class<T> tClass) throws JsonProcessingException {
        return objectMapper.readValue(str, tClass);
    }

    public static Map map(String str) throws JsonProcessingException {
        return objectMapper.readValue(str, HashMap.class);
    }
}

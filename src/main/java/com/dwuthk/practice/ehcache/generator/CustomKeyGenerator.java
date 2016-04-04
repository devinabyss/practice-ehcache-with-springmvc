package com.dwuthk.practice.ehcache.generator;

import java.lang.reflect.Method;
import org.springframework.cache.interceptor.KeyGenerator;

/**
 *
 * Simple Custom Cache Key Generator
 * 
 * @author HK
 */
public class CustomKeyGenerator implements KeyGenerator {

    public static final String NO_PARAM_KEY = "NO_PARAM_KEY";

    public static final String NULL_PARAM_KEY = "NULL_PARAM_KEY";

    public Object generate(Object target, Method method, Object... params) {
        if (params.length == 1) {
            return (params[0] == null ? NULL_PARAM_KEY : String.valueOf(params[0]));
        }
        if (params.length == 0) {
            return NO_PARAM_KEY;
        }

        String keyStr = "";
        for (Object param : params) {
            keyStr += ":" + String.valueOf(param == null ? NULL_PARAM_KEY : param);
        }

        return keyStr;
    }
}

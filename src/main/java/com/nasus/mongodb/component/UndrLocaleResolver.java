package com.nasus.mongodb.component;

import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created by Royal on 2020/7/29
 */
public class UndrLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        //获取请求参数信息
        String localeStr =   httpServletRequest.getParameter("l");
        Locale locale = Locale.getDefault();  // 默认为操作系统自带的
        if(!StringUtils.isEmpty(localeStr)){
            String[] localSpilt = localeStr.split("_");
            locale = new Locale(localSpilt[0],localSpilt[1]);   //设置 locale 国家  和 语言
        }else{ // 如果为空  ， 默认 中文
            locale = new Locale("zh","CN");   //设置 locale 国家  和 语言
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, @Nullable HttpServletResponse httpServletResponse, @Nullable Locale locale) {

    }
}

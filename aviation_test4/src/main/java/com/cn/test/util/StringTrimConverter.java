package com.cn.test.util;

import org.springframework.core.convert.converter.Converter;

/**
 * created on 2016年9月6日
 *
 * 自定义字符串转换器
 *
 * @author  megagao
 * @version  0.0.1
 */
public class StringTrimConverter implements Converter<String, String> {

	public String convert(String source) {
		try {
			//去掉字符串两边空格，如果去除后为空设置为null
			if(source!=null){
				source = source.trim();
				if("".equals(source)){
					return null;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return source;
	}
}

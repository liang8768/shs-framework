package com.framework.shs.core.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 反射的基本工具类
 * 
 * ReflectionUtils.java	
 * @author Liang
 * 2014年6月19日
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class ReflectionUtils {
	/**
	 * 日志
	 */
	private static Logger logger = LoggerFactory.getLogger(ReflectionUtils.class);
	
	/**
	 * 通过反射, 获得Class定义中声明的父类的泛型参数的类型.
	 * 如无法找到, 返回Object.class.
	 * 
	 * @param clazz 传入一个class
	 * @return 传入class的父类的泛型参数的类型
	 */
	public static <T> Class<T> getSuperClassGenricType(final Class clazz){
		return getSuperClassGenricType(clazz, 0);
	}
	
	/**
	 * 
	 * 通过反射, 获得Class定义中声明的父类的泛型参数的类型.
	 * 如无法找到, 返回Object.class.
	 * 
	 * @param clazz 传入一个class
	 * @param index 多个泛型参数  要返回的下标
	 * @return 传入class的父类的泛型参数的类型
	 */
	
	public static <T> Class getSuperClassGenricType(final Class clazz,final int index){
		Type genType = clazz.getGenericSuperclass();
		//如果不是 泛型参数
		if(!(genType instanceof ParameterizedType)){
			logger.warn(clazz.getSimpleName() + "此传入的class的父类没有泛型参数！");
			return Object.class;
		}
		//获得泛型的实际类型数组
		Type[] params = ((ParameterizedType)genType).getActualTypeArguments();
		//传入的下标越界
		if(index >= params.length || index < 0){
			logger.warn("Index: " + index + ", Size of " + clazz.getSimpleName() + "'s Parameterized Type: "
					+ params.length);
			return Object.class;
		}
		if(!(params[index] instanceof Class)){
			logger.warn(clazz.getSimpleName() + " not set the actual class on superclass generic parameter");
			return Object.class;
		}
		return (Class) params[index];
	}
	
}

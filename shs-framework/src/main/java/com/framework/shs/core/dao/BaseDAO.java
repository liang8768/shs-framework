package com.framework.shs.core.dao;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 数据访问基类
 * 
 * 封装一些简单数据访问功能 增 删 改 查
 * 
 * BaseDAO.java	
 * @author Liang
 * 2014年6月19日
 */
public class BaseDAO<T> {
	/**
	 * 日志类
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());
	/**
	 * hibernate的session工程
	 */
	protected SessionFactory sessionFactory;
}

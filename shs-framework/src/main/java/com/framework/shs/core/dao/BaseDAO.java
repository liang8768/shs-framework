package com.framework.shs.core.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 数据访问基类
 * 
 * 封装一些简单数据访问功能 增 删 改 查
 * 
 * BaseDAO.java	
 * @author Liang
 * 2014年6月19日
 */
@SuppressWarnings("unchecked")
public class BaseDAO<T> {
	/**
	 * 日志类
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());
	/**
	 * hibernate的session工程
	 */
	protected SessionFactory sessionFactory;
	/**
	 * 真实的泛型参数类型 
	 */
	protected Class<T> entityClass;
	
	/**
	 * 取得SessionFactory
	 * 
	 * @return
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	/**
	 * 采用@Autowired按类型注入SessionFactory, 当有多个SesionFactory的时候在子类重载本函数.
	 */
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	/**
	 * 保存或修改实体对象
	 * 
	 * @param entity
	 */
	public void save(final T entity){
		getSession().saveOrUpdate(entity);
		logger.debug("save entity: {}", entity);
	}
	/**
	 * 删除实体对象
	 * 
	 * @param entity
	 */
	public void delete(final T entity){
		getSession().delete(entity);
		logger.debug("delete entity: {}", entity);
	}
	/**
	 * 按照ID删除实体对象
	 * 
	 * @param id
	 */
	public void delete(final Serializable id){
		delete(get(id));
		logger.debug("delete entity {},id is {}", entityClass.getSimpleName(), id);
	}
	
	/**
	 * 按照ID获取实体对象
	 * 
	 * @param id
	 * @return
	 */
	public T get(final Serializable id){
		return (T) getSession().get(entityClass, id);
	}
	
	/**
	 *	获取全部实体对象.
	 */
	public List<T> findAll() {
		return getSession().createCriteria(entityClass).list();
	}
	
	/**
	 * 取得当前hibernate的session
	 * 
	 * @return
	 */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
}

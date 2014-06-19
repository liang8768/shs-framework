package com.boya.ssh.dao.support;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.boya.ssh.utils.ReflectionUtils;

public class HibernateDao<T> {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	protected SessionFactory sessionFactory;
	
	protected Class<T> entityClass;
	
	public HibernateDao() {
		this.entityClass = ReflectionUtils.getSuperClassGenricType(getClass());
	}
	
	/**
	 * 取得sessionFactory.
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * 采用@Autowired按类型注入SessionFactory, 当有多个SesionFactory的时候在子类重载本函数.
	 */
	@Autowired
	public void setSessionFactory(final SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * 取得当前Session.
	 */
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	
	/**
	 * 保存或修改对象
	 */
	public void save(final T entity) {
		getSession().saveOrUpdate(entity);
		logger.debug("save entity: {}", entity);
	}

	/**
	 * 删除对象.
	 * 
	 */
	public void delete(final T entity) {
		getSession().delete(entity);
		logger.debug("delete entity: {}", entity);
	}

	/**
	 * 按id删除对象.
	 */
	public void delete(final Long id) {
		delete(get(id));
		logger.debug("delete entity {},id is {}", entityClass.getSimpleName(), id);
	}

	/**
	 * 按id获取对象.
	 */
	public T get(final Long id) {
		return (T) getSession().get(entityClass, id);
	}


	/**
	 *	获取全部对象.
	 */
	public List<T> findAll() {
		return getSession().createCriteria(entityClass).list();
	}

	
}

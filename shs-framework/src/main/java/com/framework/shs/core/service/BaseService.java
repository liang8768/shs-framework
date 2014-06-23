package com.framework.shs.core.service;

import java.io.Serializable;
import java.util.List;

import javax.persistence.MappedSuperclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.framework.shs.core.dao.BaseDAO;
import com.framework.shs.core.entity.IdEntity;
import com.framework.shs.core.utils.ReflectionUtils;

/**
 * 业务处理类基类
 * 
 * BaseService.java	
 * @author Liang
 * 2014年6月23日
 * @param <M>
 * @param <T>
 */
@MappedSuperclass
public class BaseService<D extends BaseDAO<T>,T extends IdEntity> {
	/**
	 * 日志类
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected D entityDAO;
	
	/**
	 * 实体的class
	 */
	protected Class<T> entityClass;
	/**
	 * 数据访问类的class
	 */
	protected Class<T> daoClass;
	
	@SuppressWarnings("unchecked")
	public BaseService(){
		this.daoClass = ReflectionUtils.getSuperClassGenricType(getClass(), 0);
		this.entityClass = ReflectionUtils.getSuperClassGenricType(getClass(), 1);
	}
	
	/**
	 * 保存或修改实体对象
	 * 
	 * @param entity
	 */
	public void save(final T entity){
		entityDAO.save(entity);
		logger.debug("save entity: {} by {}", entity,entityDAO);
	}
	/**
	 * 删除实体对象
	 * 
	 * @param entity
	 */
	public void delete(final T entity){
		entityDAO.delete(entity);
		logger.debug("delete entity: {} by {}", entity,entityDAO);
	}
	/**
	 * 按照ID删除实体对象
	 * 
	 * @param id
	 */
	public void delete(final Serializable id){
		delete(get(id));
		logger.debug("delete entity {} ,id is {}", entityClass.getSimpleName(),id);
	}
	
	/**
	 * 按照ID获取实体对象
	 * 
	 * @param id
	 * @return
	 */
	public T get(final Serializable id){
		return (T)entityDAO.get(id);
	}
	
	/**
	 *	获取全部实体对象.
	 */
	public List<T> findAll() {
		return entityDAO.findAll();
	}
	
	public D getEntityDAO() {
		return entityDAO;
	}
	
	@Autowired
	public void setEntityDAO(D entityDAO) {
		this.entityDAO = entityDAO;
	}
}

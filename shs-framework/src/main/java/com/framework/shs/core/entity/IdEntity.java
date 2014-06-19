package com.framework.shs.core.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 各实体的Id生成策略抽象类
 * 
 * IdEntity.java	
 * @author Liang
 * 2014年6月19日
 */
@MappedSuperclass
public class IdEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
}

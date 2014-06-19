package com.boya.ssh.dao;

import org.springframework.stereotype.Service;

import com.boya.ssh.dao.support.HibernateDao;
import com.boya.ssh.entity.Role;

/**
 * 用户管理DAO类
 * 
 * @author boya
 */
@Service
public class RoleDao extends HibernateDao<Role>{

}

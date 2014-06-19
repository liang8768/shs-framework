package com.boya.ssh.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.boya.ssh.dao.RoleDao;
import com.boya.ssh.entity.Role;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 角色操作
 * 
 * @author boya
 */
@Controller
@Transactional
public class RoleAction extends ActionSupport {
	
	private static Logger logger = LoggerFactory.getLogger(RoleAction.class);

	private RoleDao roleDao;
	
	private Role role;
	private Long id;
	private List<Role> roles;
	

	public String save() throws Exception {
		roleDao.save(role);
		return list();
	}
	
	public String create() {
		return "input";
	}
	
	public String edit() {
		role = roleDao.get(id);
		return "input";
	}

	public String delete(){
		roleDao.delete(id);
		return "reload";
	}
	
	public String list() {
		roles = roleDao.findAll();
		return "success";
	}
	
	
	public String execute() {
		return list();
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public RoleDao getRoleDao() {
		return roleDao;
	}

	@Autowired
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	
	

}

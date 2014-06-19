package com.boya.ssh.web;

import java.io.InputStream;
import java.util.Locale;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.boya.ssh.utils.ValidateCodeUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String local;
	private InputStream inputStream;

	/**
	 * 获得验证码
	 * 
	 * @return
	 */
	public String identify() {
		return SUCCESS;
	}
	
	public String validateCode() throws Exception {
		Map session = ActionContext.getContext().getSession();
		ValidateCodeUtil validate = new ValidateCodeUtil();
		String validateCode = validate.getValidateCode();
		inputStream = validate.createImage(validateCode);
		
		session.put("validateCode", validateCode);
		
		return SUCCESS;
	}

	public String execute() {
		if (local != null) {
			if (local.equals("zh_CN")) {
				ActionContext.getContext().setLocale(Locale.CHINA);
			} else {
				ActionContext.getContext().setLocale(Locale.ENGLISH);
			}
		}

		return SUCCESS;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
	

}

package com.boya.ssh.security;

import org.apache.shiro.authc.UsernamePasswordToken;

public class ValidateCodeToken extends UsernamePasswordToken {
    private String validateCode;

    public String getValidateCode() {
		return validateCode;
	}
	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

	public ValidateCodeToken() {
         super();
    }
    public ValidateCodeToken(String username, String password, boolean rememberMe, String host,String validateCode) {        
         super(username, password, rememberMe, host);
         this.validateCode = validateCode;
    }
}

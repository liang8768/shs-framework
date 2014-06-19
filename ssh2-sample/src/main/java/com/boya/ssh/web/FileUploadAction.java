package com.boya.ssh.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {

	private static final long serialVersionUID = 5156288255337069381L;

	private String contentType;	//上传文件的编码类型
	private File upload;	//上传文件
	private String fileName;	//上传文件的名称
	private String caption;	//提交的相关信息

	public String input() throws Exception {
		return SUCCESS;
	}

	public String upload() throws Exception {
		String path = "upload\\";
		InputStream in = new FileInputStream(upload);
		String contextPath = ServletActionContext.getServletContext().getRealPath("/");

		File dir = new File(contextPath+path);
		if (!dir.exists()) {
			dir.mkdir();
		}

		String filePath = contextPath + path + fileName;
		OutputStream out = new FileOutputStream(filePath);
		int bytesRead;
		byte[] buffer = new byte[8192];
		while ((bytesRead = in.read(buffer, 0, 8192)) != -1) {
			out.write(buffer, 0, bytesRead);
		}
		out.close();
		in.close();
		
        return SUCCESS;		
	}

	public String getUploadFileName() {
		return fileName;
	}

	public void setUploadFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUploadContentType() {
		return contentType;
	}

	public void setUploadContentType(String contentType) {
		this.contentType = contentType;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}


	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
}

package com.mkyong.common.action;

import java.util.Locale;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LocaleAction extends ActionSupport{

	Map<String, String[]> parameters;

	//business logic
	public String execute() {
		
		String str = getText("global.submit");
		System.out.println(str);
		return "SUCCESS";

	}
	
	
	
}
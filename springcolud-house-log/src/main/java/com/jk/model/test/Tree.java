package com.jk.model.test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Tree implements Serializable {
	private Integer id;
	private String  text;
	private String  url;

	private Integer pid;
	private String  iconCls;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	@Override
	public String toString() {
		return "Tree{" +
				"id=" + id +
				", text='" + text + '\'' +
				", url='" + url + '\'' +
				", pid=" + pid +
				", iconCls='" + iconCls + '\'' +
				'}';
	}
}

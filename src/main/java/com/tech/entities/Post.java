package com.tech.entities;

import java.sql.*;

public class Post {
	private int pid;
	private String pTitle;
	private String pcontent;
	private String pCode;
	private String pPic;
	private Timestamp pDate;
	private int catId;
	private int userId;
	
	
	public Post(String pTitle, String pcontent, String pCode, String pPic, Timestamp pDate, int catId, int userId) {
		
		this.pTitle = pTitle;
		this.pcontent = pcontent;
		this.pCode = pCode;
		this.pPic = pPic;
		this.pDate = pDate;
		this.catId = catId;
		this.userId = userId;
	}
	public Post() {
		super();
	}
	public Post(int pid, String pTitle, String pcontent, String pCode, String pPic, Timestamp pDate, int catId, int userId) {
		
		this.pid = pid;
		this.pTitle = pTitle;
		this.pcontent = pcontent;
		this.pCode = pCode;
		this.pPic = pPic;
		this.pDate = pDate;
		this.catId = catId;
		this.userId = userId;
	}
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpTitle() {
		return pTitle;
	}
	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}
	public String getPcontent() {
		return pcontent;
	}
	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpPic() {
		return pPic;
	}
	public void setpPic(String pPic) {
		this.pPic = pPic;
	}
	public Timestamp getpDate() {
		return pDate;
	}
	public void setpDate(Timestamp pDate) {
		this.pDate = pDate;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	

}

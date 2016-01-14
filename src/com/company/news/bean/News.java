package com.company.news.bean;

public class News {
	private Integer id;
	private String title;
	private  Integer type;
	private String context;
	private String author;
	private String addtime;
	private String pic;
	private String note;
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public News(Integer id, String title, Integer type, String context,
			String author, String addtime, String pic, String note) {
		this.id = id;
		this.title = title;
		this.type = type;
		this.context = context;
		this.author = author;
		this.addtime = addtime;
		this.pic = pic;
		this.note=note;
	}
	public News() {
		// TODO Auto-generated constructor stub
	}
	

}

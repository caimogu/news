package com.company.news.action;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.company.news.bean.News;
import com.company.news.service.IserverNews;
import com.company.news.service.TypeService;
import com.company.news.service.impl.NewsService;

public class NewsAction extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private IserverNews servernews;


	public NewsAction() {
			try {
				servernews=new NewsService();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String a=request.getParameter("a");
			if(a==null){
				list(request,response);
			}else if(a.equals("save")){
				save(request,response);
			}else if(a.equals("addnews")){
				try {
					addnews(request,response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(a.equals("del")){
				delete(request,response);
			}
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		List<News> list=new ArrayList<News>();
		list.remove(request.getParameter("id"));
	}

	private void addnews(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		TypeService  ts= new TypeService();
		request.setAttribute("typelist", ts.getAll());
		request.getRequestDispatcher("jsp/news/add.jsp").forward(request, response);
		
	}

	private void save(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		News news=new News();
		String title=new String(request.getParameter("title").getBytes("ISO-8859-1"),"UTF-8");
		news.setTitle(title);
		news.setType(Integer.parseInt(request.getParameter("type")));
		news.setAuthor(request.getParameter("author"));
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String addtime=sdf.format(new Date());
		
		news.setAddtime(addtime);
		news.setPic(request.getParameter("pic"));
		news.setContext(request.getParameter("context"));
		news.setNote(request.getParameter("note"));
		servernews.save(news);
		response.sendRedirect("news.do");
		
	}

	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("newslist", servernews.findAll());
		//System.out.println(newsList);
		request.getRequestDispatcher("jsp/news/list.jsp").forward(request, response);
		
	}


	public void init() throws ServletException {
		// Put your code here
	}

}

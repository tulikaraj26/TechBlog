package com.tech.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.tech.entities.Category;
import com.tech.entities.Post;

public class PostDao {
	
	Connection con;
	
	public PostDao() {
		super();
	}

	public PostDao(Connection con) {
		this.con = con;
	}

	public ArrayList<Category> getAllCategories()
	{
		ArrayList<Category> list = new ArrayList<>();
		try
		{
			String query = "select * from categories";
			Statement st =con.createStatement();
			ResultSet set = st.executeQuery(query);
			while(set.next())
			{
				int cid = set.getInt("cid");
				String name = set.getString("name");
				String description = set.getString("description");
				Category c = new Category(cid,name,description);
				list.add(c);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	public boolean savePost(Post p)
	{
		boolean f = false;
		try
		{
			String query = "insert into posts(pTitle, pContent, pCode, pPic, catId, userId) values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, p.getpTitle());
			ps.setString(2, p.getPcontent());
			ps.setString(3, p.getpCode());
			ps.setString(4, p.getpPic());
			ps.setInt(5, p.getCatId());
			ps.setInt(6, p.getUserId());
			
			ps.executeUpdate();
			f = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}

	
	//get all the posts
	public List<Post> getAllPosts()
	{
		List<Post> list = new ArrayList<>();
		//fetch all the post
		try
		{
			PreparedStatement p = con.prepareStatement("select * from posts order by pid desc");
			
			ResultSet rs = p.executeQuery();
			
			while(rs.next())
			{
				int pid = rs.getInt("pid");
				String pTitle = rs.getString("pTitle");
				String pContent = rs.getString("pContent");
				String pCode = rs.getString("pCode");
				String pPic = rs.getString("pPic");
				Timestamp date = rs.getTimestamp("pDate");
				int catId = rs.getInt("catId");
				int userId = rs.getInt("userId");
				
				Post post = new Post(pid, pTitle, pContent, pCode, pPic, date, catId, userId);
				list.add(post);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<Post> getPostByCatId(int catId)
	{
		List<Post> list = new ArrayList<>();
		//fetch all post by id
		
		try
		{
			PreparedStatement p = con.prepareStatement("select * from posts where catId=?");
			p.setInt(1, catId);
			
			ResultSet rs = p.executeQuery();
			
			while(rs.next())
			{
				int pid = rs.getInt("pid");
				String pTitle = rs.getString("pTitle");
				String pContent = rs.getString("pContent");
				String pCode = rs.getString("pCode");
				String pPic = rs.getString("pPic");
				Timestamp date = rs.getTimestamp("pDate");
				
				int userId = rs.getInt("userId");
				
				Post post = new Post(pid, pTitle, pContent, pCode, pPic, date, catId, userId);
				list.add(post);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
  
	public Post getPostByPostId(int postId)
	{
		Post p =null;
		String query = "select * from posts where pid=?";
		try
		{
			PreparedStatement ps  = this.con.prepareStatement(query);
			ps.setInt(1, postId);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				int pid = rs.getInt("pid");
				String pTitle = rs.getString("pTitle");
				String pContent = rs.getString("pContent");
				String pCode = rs.getString("pCode");
				String pPic = rs.getString("pPic");
				Timestamp date = rs.getTimestamp("pDate");
				int cid = rs.getInt("catId");
				
				int userId = rs.getInt("userId");
				
			    p = new Post(pid, pTitle, pContent, pCode, pPic, date, cid, userId);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return p;
	}
	

}

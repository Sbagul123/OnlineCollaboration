package com.coll.OnlineCollaboration.service;

import java.util.List;

import com.coll.OnlineCollaboration.model.BlogComments;

public interface IBlogCommentsService {

	
	List<BlogComments> getAllBlogComments();
	BlogComments getBlogCommentsById(int blogCommentsId);
	boolean addBlogCommnets(BlogComments blogComments);
	boolean updateBlogComments(BlogComments blogComments);
	boolean deleteBlogComments(BlogComments blogComments);
	
}

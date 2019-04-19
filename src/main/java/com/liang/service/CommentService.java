package com.liang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liang.bean.Comment;
import com.liang.dao.CommentMapper;

@Service
public class CommentService {
	
	@Autowired
	CommentMapper commentMapper;

	/**
	 * 更新帖子点赞个数
	 */


	public  void  updateComment(String pid){
		commentMapper.updateById(Integer.valueOf(pid));
	}


	/**
	 * 按帖子id（fid）查询评论表信息
	 * @param fid
	 * @return
	 */
	public List<Comment> getCommentFid(int fid) {
		
		return commentMapper.selectByCommentFid(fid);
	}

	/**
	 * 按用户id（userid）查询评论表的fid信息
	 * @param userid
	 * @return
	 */
	public List<Comment> getCommentUserid(int userid) {

		return commentMapper.selectByCommentUserid(userid);
	}

	/**
	 * 添加评论
	 * @param comment
	 */
	public void setComment(Comment comment) {

		commentMapper.insert(comment);
	}

	/**
	 * 按pid删除评论表
	 * @param
	 */
	public void deleteComment(int pid) {

		commentMapper.deleteByPrimaryKey(pid);
	}

	/**
	 * 删除该用户对应的所有评论信息(按userid)
	 * @param userid
	 */
	public void deleteCommentUserid(int userid) {
		
		commentMapper.deleteByUserid(userid);
	}

	/**
	 * 去评论表中查找 五条
	 */
	public List<Comment> getComment() {

		return commentMapper.comment();
	}
}

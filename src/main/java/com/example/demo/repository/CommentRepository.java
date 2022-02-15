package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
	List<Comment> findByTutorialId(int postId);
	 @Transactional
	  void deleteByTutorialId(int tutorialId);

}

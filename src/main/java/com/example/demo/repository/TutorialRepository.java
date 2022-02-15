package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {
//	List<Tutorial> findByIsPublished(boolean isPubliched);
//	List<Tutorial>findByTitleContaining(String title);

}

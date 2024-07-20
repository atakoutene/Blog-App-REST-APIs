package com.aurelien.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurelien.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}

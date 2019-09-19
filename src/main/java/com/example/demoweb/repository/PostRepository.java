package com.example.demoweb.repository;

import com.example.demoweb.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface PostRepository extends CrudRepository<Post, Long> {
}
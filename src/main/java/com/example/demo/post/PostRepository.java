package com.example.demo.post;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PostRepository {
    List<Post> posts;
    PostRepository postRepository;
    PostRepository(){
        this.posts = new ArrayList<>();
        this.posts.add(new Post(1,"title1","hello world java1","홍길동1"));
        this.posts.add(new Post(2,"title2","hello world java2","홍길동2"));
        this.posts.add(new Post(3,"title3","hello world java3","홍길동3"));
        this.posts.add(new Post(4,"title4","hello world java4","홍길동4"));

    }
    List<Post> findAll() {
        return this.posts;
    }
}

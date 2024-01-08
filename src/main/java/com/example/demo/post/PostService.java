package com.example.demo.post;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostRepository postRepository;

    PostService() {
        this.postRepository = new PostRepository();
    }

    List<Post> findAll(){
        return this.postRepository.findAll();
    }
}

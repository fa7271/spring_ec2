package com.example.demo.post;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Controller
// CORS 정책 :
public class PostController {
    private PostService postService;

    public PostController() {
        this.postService = new PostService();
    }
    @GetMapping("/csr/json")
    @ResponseBody
    List<Post> findAll() {
        return postService.findAll();
    }
    @GetMapping("/ssr")
    public String findAllSsr(Model model) {
        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);
        return "post_list";
    }

}
// Controller -> service -> Repository

// 1. 메모리 db에 넣고 있는 데이터 추가 / 삭제 부분을 repository 로 분리한다.

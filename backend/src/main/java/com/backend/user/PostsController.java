package com.backend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {

    @Autowired
    PostsService postsService;

    @GetMapping("/posts/{postsId}")
    Posts getOnePosts(@PathVariable final long postsId) {
        // TODO: 여러개의 DTO 조인할경우 어떻게처리 할지 고민
        // optional을 어떻게 처리할껀지
        //return postsService.getOnePosts(postsId);
        return null;
    }
}

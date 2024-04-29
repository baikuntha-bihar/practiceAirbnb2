package com.practice02.controller;

import com.practice02.payLoad.PostDto;
import com.practice02.service.PostService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    //   http://localhost:8080/api/posts

    @PostMapping
    public ResponseEntity<?>createPost(@Valid @RequestBody PostDto postDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity<>(bindingResult.getFieldError().getDefaultMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
        PostDto postSaved = postService.createPost(postDto);
        return new ResponseEntity<>(postSaved, HttpStatus.CREATED);
    }

    //  http://localhost:8080/api/posts/3

    @DeleteMapping("{id}")
    public ResponseEntity<String> deletePost(@PathVariable long id){
        postService.deletePost(id);
        return  new ResponseEntity<>("Post Record is deleted:"+id, HttpStatus.OK);
    }
}

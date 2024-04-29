package com.practice02.service;

import com.practice02.payLoad.PostDto;

public interface PostService {

    public PostDto createPost(PostDto postDto);

    void deletePost(long id);
}

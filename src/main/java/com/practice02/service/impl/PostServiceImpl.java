package com.practice02.service.impl;

import com.practice02.entity.Post;
import com.practice02.payLoad.PostDto;
import com.practice02.repository.PostRepository;
import com.practice02.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {


    private PostRepository postRepository;

    private ModelMapper modelMapper;

    public PostServiceImpl(PostRepository postRepository, ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = mapToEntity(postDto);
        Post savedPost = postRepository.save(post);
        PostDto dto = mapToDto(post);
        return dto;
    }
   Post mapToEntity(PostDto postDto){
       Post post = modelMapper.map(postDto, Post.class);
       return post;

   }
   PostDto mapToDto(Post post){
       PostDto dto = modelMapper.map(post, PostDto.class);
       return dto;
   }

    @Override
    public void deletePost(long id) {
        postRepository.deleteById(id);
    }
}

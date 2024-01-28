package com.myblog.service;

import com.myblog.payload.PostDto;
import com.myblog.payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto PostDto);

     PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

     PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);


    PostDto deletePostById(long id);
}

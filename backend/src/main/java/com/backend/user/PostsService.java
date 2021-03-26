package com.backend.user;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostDto dto) {
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional
    public Optional<Posts> getOnePosts(final long postsId) {
        return postsRepository.findById(postsId);
    }
}

package org.example.blogcms;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository repository;

    public Post findById(UUID id) {
        return repository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    public List<Post> findAll() {
        return repository.findAll();
    }

    public Post create(PostDto dto) {
        var post = Post.builder()
                .title(dto.title())
                .content(dto.content())
                .imageUrl(dto.imageUrl())
                .published(dto.published())
                .build();

        return repository.save(post);
    }

    public Post update(UUID id, Post updated) {
        var post = findById(id);
        post.setTitle(updated.getTitle());
        post.setContent(updated.getContent());
        post.setImageUrl(updated.getImageUrl());
        post.setPublished(updated.getPublished());

        return repository.save(post);
    }

    public void delete(UUID id) {
        var post = findById(id);
        repository.delete(post);
    }
}

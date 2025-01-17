package org.example.blogcms;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService service;

    @GetMapping("{id}")
    public Post get(@PathVariable UUID id) {
        return service.findById(id);
    }

    @GetMapping
    public List<Post> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Post create(@RequestBody PostDto dto) {
        return service.create(dto);
    }

    @PutMapping("{id}")
    public Post update(@PathVariable UUID id, @RequestBody Post post) {
        return service.update(id, post);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

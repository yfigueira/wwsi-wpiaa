package org.example.blogcms;

import java.time.LocalDateTime;

public record PostDto(
        String title,
        String content,
        String imageUrl,
        LocalDateTime published
) {
}

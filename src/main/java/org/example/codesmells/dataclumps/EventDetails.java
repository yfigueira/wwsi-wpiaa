package org.example.codesmells.dataclumps;

import java.time.LocalDate;

public record EventDetails(
        String name,
        LocalDate date,
        String location
) {
}

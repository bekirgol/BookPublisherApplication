package com.gol.bekir.bookpublisherapplication.data.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateBookRequest {
    private String title;
    private String description;
    private String publishedDate;
    private String authorId;
}

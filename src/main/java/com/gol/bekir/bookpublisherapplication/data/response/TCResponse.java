package com.gol.bekir.bookpublisherapplication.data.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class TCResponse<T> {
    private boolean isSuccess;
    private String errorMessage;
    private T response;
}

package com.twitter.api.Twitter_API.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class ExceptionResponse {
    private String message;
    private int status;
    private LocalDateTime dateTime;
}

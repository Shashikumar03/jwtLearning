package com.example.learnjwt.modals;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Builder
public class JwtRequest {
    private String username;
    private String password;
}

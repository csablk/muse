package com.csablk.muse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class AuthRequest {
    private String email; 
    private String password;
    
}
    
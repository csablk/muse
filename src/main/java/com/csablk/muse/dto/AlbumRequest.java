package com.csablk.muse.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlbumRequest {
    private String name; 
    private String desc; 
    private String bgColor; 
    private MultipartFile imageFile;
}

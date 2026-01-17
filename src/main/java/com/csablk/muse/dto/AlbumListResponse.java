package com.csablk.muse.dto;

import java.util.List;

import com.csablk.muse.document.Album;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlbumListResponse {
    private boolean success; 
    private List<Album> albums;     
}

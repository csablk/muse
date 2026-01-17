package com.csablk.muse.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.csablk.muse.document.Album;
import com.csablk.muse.dto.AlbumListResponse;
import com.csablk.muse.dto.AlbumRequest;
import com.csablk.muse.repository.AlbumRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AlbumService {
    private final AlbumRepository albumRepository;
    private final Cloudinary cloudinary;

    public Album addAlbum(AlbumRequest request) throws IOException{
        Map<String, Object> imageUploadResult = cloudinary.uploader().upload(request.getImageFile().getBytes(), ObjectUtils.asMap("resource_type", "image"));
        
        Album newAlbum = Album.builder()
            .name(request.getName())
            .desc(request.getDesc())
            .bgColor(request.getBgColor())
            .imageUrl(imageUploadResult.get("secure_url").toString())
            .build();
        return albumRepository.save(newAlbum);
    }

    public AlbumListResponse getAllAlbums() {
        return new AlbumListResponse(true, albumRepository.findAll());
    }

        public Boolean removeAlbum(String id) {
            Album existingAlbum = albumRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Album not found"));
            albumRepository.delete(existingAlbum);
            return true;
        }
}


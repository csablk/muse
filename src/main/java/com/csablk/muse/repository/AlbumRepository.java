package com.csablk.muse.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.csablk.muse.document.Album;

public interface AlbumRepository extends MongoRepository<Album, String> {
    
}

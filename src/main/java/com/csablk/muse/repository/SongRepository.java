package com.csablk.muse.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.csablk.muse.document.Song;

public interface SongRepository extends MongoRepository<Song, String>{
    
}

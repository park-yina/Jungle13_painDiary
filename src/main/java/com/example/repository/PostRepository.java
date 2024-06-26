package com.example.repository;

import com.example.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<PostEntity,Long> {
    List<PostEntity> findByBoardType(String boardType);

}

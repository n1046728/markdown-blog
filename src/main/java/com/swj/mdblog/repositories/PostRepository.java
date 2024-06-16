package com.swj.mdblog.repositories;

import com.swj.mdblog.entities.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
}

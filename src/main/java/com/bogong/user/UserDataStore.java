package com.bogong.user;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bgong on 17/1/15.
 */
@Repository
public interface UserDataStore extends PagingAndSortingRepository<User, Long> {
    List<User> findByName(String name);
}

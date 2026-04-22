package com.benjamin.animeoldies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.benjamin.animeoldies.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {

}

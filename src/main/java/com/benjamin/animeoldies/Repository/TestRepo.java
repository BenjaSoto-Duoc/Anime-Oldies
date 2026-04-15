package com.benjamin.animeoldies.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.benjamin.animeoldies.Model.TestClass;

@Repository
public interface TestRepo extends JpaRepository<TestClass, Long> {

}

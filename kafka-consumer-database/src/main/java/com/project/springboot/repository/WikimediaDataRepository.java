package com.project.springboot.repository;

import com.project.springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
    //Jpa repository will give all the crud operations out of the box.
}

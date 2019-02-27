package com.codeclan.example.userFileFolderJava.repositories;

import com.codeclan.example.userFileFolderJava.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}

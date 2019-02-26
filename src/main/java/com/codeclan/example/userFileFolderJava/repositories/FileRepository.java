package com.codeclan.example.userFileFolderJava.repositories;

import com.codeclan.example.userFileFolderJava.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}

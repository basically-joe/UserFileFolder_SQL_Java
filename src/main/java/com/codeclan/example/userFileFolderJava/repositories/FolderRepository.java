package com.codeclan.example.userFileFolderJava.repositories;

import com.codeclan.example.userFileFolderJava.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository <Folder, Long> {
}

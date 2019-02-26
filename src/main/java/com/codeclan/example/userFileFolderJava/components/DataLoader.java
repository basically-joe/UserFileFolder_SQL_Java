package com.codeclan.example.userFileFolderJava.components;

import com.codeclan.example.userFileFolderJava.repositories.FileRepository;
import com.codeclan.example.userFileFolderJava.repositories.FolderRepository;
import com.codeclan.example.userFileFolderJava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

	}
}

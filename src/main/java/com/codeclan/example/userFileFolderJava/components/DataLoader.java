package com.codeclan.example.userFileFolderJava.components;

import com.codeclan.example.userFileFolderJava.models.File;
import com.codeclan.example.userFileFolderJava.models.Folder;
import com.codeclan.example.userFileFolderJava.models.User;
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

		User user1 = new User("Joe");
		userRepository.save(user1);

		User user2 = new User("Jodie");
		userRepository.save(user2);

		Folder folder1 = new Folder("IT", user1);
		folderRepository.save(folder1);

		Folder folder2 = new Folder("Design", user1);
		folderRepository.save(folder2);

		File file1 = new File("JoeCV", "txt", 20, folder1);
		fileRepository.save(file1);

		File file2 = new File("BlackJackGame", "java", 20000, folder1);
		fileRepository.save(file2);

		user1.addFolder(folder1);
		user1.addFolder(folder2);
		userRepository.save(user1);

		folder1.addFiles(file1);
		folder1.addFiles(file2);
		folderRepository.save(folder1);

	}
}

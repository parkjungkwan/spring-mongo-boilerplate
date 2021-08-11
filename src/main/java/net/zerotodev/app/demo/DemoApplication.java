package net.zerotodev.app.demo;

import net.zerotodev.app.demo.user.entity.User;
import net.zerotodev.app.demo.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		userRepository.save(new User("a","홍길동","a@","1"));
		userRepository.save(new User("b","홍길동","b@","1"));
		userRepository.save(new User("c","이순신","c@","1"));
		List<User> users = userRepository.findAll();
		System.out.println(" 전체를 출력 하시오 ");
		for(User u: users){
			System.out.println(u.toString());
		}
		System.out.println(" 홍길동만 출력 하시오 ");
		for(User u: userRepository.findAllByName("홍길동")){
			System.out.println(u.toString());
		}
	}
}

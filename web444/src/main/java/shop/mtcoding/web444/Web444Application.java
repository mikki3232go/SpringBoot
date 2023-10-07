package shop.mtcoding.web444;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Web444Application {

	public static void main(String[] args) {
		SpringApplication.run(Web444Application.class, args);
	}

}

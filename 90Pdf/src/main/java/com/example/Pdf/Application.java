package com.example.Pdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public List<Emp> lst =new ArrayList<Emp>(Arrays.asList(
			new Emp(1,"php","10"),new Emp(2,"java","10"),new Emp(3,"dot","10")
	));

	@RequestMapping("/")
	public ModelAndView index(){
		return new ModelAndView(new Mypdf(),"emp",lst);
	}

}

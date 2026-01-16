package com.prorev.base;

import com.prorev.base.solutions.ArrayUtils;
import java.util.Arrays;
// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaseApplication {

	public static void main(String[] args) {
		String[] greetings=new String[]{"Hello, World!"};
		System.out.println(greetings[0]);
		greetings=ArrayUtils.getConcatenation(greetings);
		System.out.println(Arrays.toString(greetings));
		// greetings=ArrayUtils.getInterleaving(greetings.getClass(), greetings, 2);
		System.out.println(Arrays.toString(greetings));
		// SpringApplication.run(BaseApplication.class, args);
	}
}

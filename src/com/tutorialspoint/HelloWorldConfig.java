package com.tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {

@Bean
public HelloWorld helloWorld(){
    return new HelloWorld();
 }
public static void main(String[] args) {
	   ApplicationContext ctx =  new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	   
	   HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

	  
	}
}

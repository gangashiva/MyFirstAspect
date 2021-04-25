package com.example.aop;

import com.example.aop.service.MyFirstService;
import com.example.aop.service.MySecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class MyfirstaspectApplication implements CommandLineRunner {

  @Autowired
  MyFirstService myFirstService;

  @Autowired
  MySecondService mySecondService;

  public static void main(String[] args) {
    SpringApplication.run(MyfirstaspectApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    myFirstService.doSomething();
    mySecondService.doAnotherthing();

  }
}
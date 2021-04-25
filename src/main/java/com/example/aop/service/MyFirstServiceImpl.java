package com.example.aop.service;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class MyFirstServiceImpl implements MyFirstService{
  private static final Logger LOG = Logger.getLogger("MyFirstServiceImpl");
  @Override
  public void doSomething() {
    //here do some business logic
    try {
      long start = System.currentTimeMillis();
      System.out.println("Inside First Service...!");
      Thread.sleep(500);
      //LOG.info("Service 1 took: "+(System.currentTimeMillis() - start));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}

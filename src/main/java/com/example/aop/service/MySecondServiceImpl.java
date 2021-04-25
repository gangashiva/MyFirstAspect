package com.example.aop.service;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class MySecondServiceImpl implements MySecondService{
  private static final Logger LOG = Logger.getLogger("MySecondServiceImpl");

  @Override
  public void doAnotherthing() {
  // do some other stuff
    try {
      long start = System.currentTimeMillis();
      System.out.println("Inside Second Service.......!");
      Thread.sleep(200);
      //LOG.info("Service 2 took: "+(System.currentTimeMillis() - start));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

package com.simplilearn.tdd.test;

import org.testng.annotations.Test;

public class TestLogin {
  @Test(groups = {"Login"})
  public void testLoginValid() {
	  System.out.println("Login Valid");
  }
  
  @Test(groups = {"Login"})
  public void testLoginInValid() {
	  System.out.println("login Invalid");
  }
  
  @Test(groups = {"Trasnfer"})
  public void testTrasnferDate() {
	  System.out.println("Trasnfer Date");
  }
  
  @Test(groups = {"Transfer"})
  public void testTransferTime() {
	  System.out.println("TransferTime");
  }
  
}

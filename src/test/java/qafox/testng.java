package qafox;

import org.testng.annotations.Test;

public class testng {
	
	
	
	@Test(priority=1)
	public void invlidlogin() {
		System.out.println("invalidlogin");
		
	}
//	@Test(priority=2,dependsOnMethods = "alwayRun",alwaysRun = true)
//	public void checkInvLid() {
//		System.out.println("checkInv");
//	}

	@Test(priority=0,dependsOnMethods = {"invlidlogin"},ignoreMissingDependencies = true)
	public void alwayRun() {
		System.out.println("alwayrun");
	}
	
	

}

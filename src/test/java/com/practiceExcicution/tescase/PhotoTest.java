package com.practiceExcicution.tescase;

import org.testng.annotations.Test;

public class PhotoTest {
	@Test(groups="ST")
	public void test1() {
		System.out.println("batch2");
	}
@Test(groups="RT")
public void test2() {
	System.out.println("batch2");
}
@Test(groups="TT")
public void test3() {
	System.out.println("batch2");
}
}

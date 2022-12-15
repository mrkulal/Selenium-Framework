package com.pixated.genericUtility;

public class ThreadSafe {
	public static ThreadLocal<WebdriverLyberery>WebdriverLyberery=new ThreadLocal<WebdriverLyberery>();
public static WebdriverLyberery getWebdriverLyberery() {
	return WebdriverLyberery.get();
	
}
public static void setWebdriverLyberery(WebdriverLyberery sWebdriverLyberery) {
	WebdriverLyberery.set(sWebdriverLyberery);
}
}

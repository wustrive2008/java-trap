package com.wubaoguo.java.chars;

/**
 * 
* @ClassName: StringCheese 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author wustrive
* @date 2017年3月2日 下午10:50:16 
*
 */
public class StringCheese {
	public static void main(String[] args) {
		byte bytes[] = new byte[256];
		for (int i = 0; i < 256; i++) {
			bytes[i] = (byte)i;
		}
		String str = new String(bytes);
		for (int i = 0, n =  str.length(); i < n; i++) {
			System.out.println((int)str.charAt(i) + " ");
		}
	}
}

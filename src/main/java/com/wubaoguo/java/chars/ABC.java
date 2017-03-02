package com.wubaoguo.java.chars;

/**
 * 
* @ClassName: ABC 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author wustrive
* @date 2017年3月2日 下午10:37:33 
*
 */
public class ABC {
	public static void main(String[] args) {
		String letters = "ABC";
		char[] numbers = {'1','2','3'};
		System.out.println(letters + " easy as " + numbers); //输出： ABC easy as [C@7852e922
		System.out.println(letters + " easy as " + String.valueOf(numbers)); //输出：ABC easy as 123
		Object numbers2 = new char[] {'1','2','3'};
		System.out.print(letters + " easy as ");
		System.out.println(numbers2);     //输出： ABC easy as [C@4e25154f
	}
}

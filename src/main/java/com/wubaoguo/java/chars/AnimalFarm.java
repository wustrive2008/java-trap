package com.wubaoguo.java.chars;

/**
 * 
* @ClassName: AnimalFarm 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author wustrive
* @date 2017年3月2日 下午10:37:27 
*
 */
public class AnimalFarm {
	
	public static void main(String[] args) {
		final String pig = "length: 10";
		final String dog = "length: " + pig.length();
		System.out.println("Animals are equal:" + pig == dog); //输出： false
		System.out.println(("Animals are equal:" + pig) == dog); //输出：false
		System.out.println("Animals are equal:" + (pig == dog)); //输出： Animals are equal:false
		System.out.println("Animals are equal:" + pig.equals(dog)); //输出： Animals are equal:true
	}

}

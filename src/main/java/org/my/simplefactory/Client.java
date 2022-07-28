package org.my.simplefactory;

public class Client {

	public static void main(String[] args) {
		Post post = PostFactory.createPost("news");
		System.out.println(post);
		post = PostFactory.createPost("produc");
		System.out.println(post);
	}

}

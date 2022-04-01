package com.array;

public class Reverse {

	public static void reverse(String str) {

		String[] split = str.split(" ");

		for (int j = 0; j <= split.length - 1; j++) {
			char[] ch = split[j].toCharArray();
			int strlen = ch.length;
			for (int i = strlen - 1; i >= 0; i--) {
				System.out.print(ch[i]);
			}
			System.out.print(" ");

		}

	}

	public static void main(String[] args) {
		reverse("Sumeet Kumar");
	}

}

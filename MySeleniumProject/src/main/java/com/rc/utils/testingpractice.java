package com.rc.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//Printing string without having duplicate character with duplicate character separately
public class testingpractice {

	public static void main(String[] args) {
		String s = "sandipkhansole";
		// String s="SSSS";
		// seperateDuplicateCharFromString(s);
		// System.out.println(reverseString(s));
		// isStringPalindrome(s, reverseString(s));
		// findduplicateCharFromString(s);
		// swapStringWithTwoVariables("Sandip","khansole");
		// isnumpalindrome(544);
//		if(isPrimeNumber(5)==true) {
//			System.out.println("Number is prime number");
//		}
//		else {
//			System.out.println("Number is prime not number");
//		}
		// getWovelsFromString(s);
		// getNumberOfCharFromString(s);
		// getNumberOfcharacterocurrenceinString1(s);
		// checkAvailableNumber(30);
		// getTaregetNumberAddition(9);
		//getMinnumberfromArray();
		CharOccurrence(s);
	}

	public static String reverseString(String s) {
		String revStr = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			revStr = revStr + s.charAt(i);
		}
		return revStr;
	}

	public static void isStringPalindrome(String Str, String revStr) {
		if (Str.toLowerCase().equals(revStr.toLowerCase())) {
			System.out.println("The given String: " + Str + " is Palindrome!");
		} else {
			System.out
					.println("The given String: " + Str + " is not the palindrome and reverse String: " + revStr + "");
		}
	}

	public static void seperateDuplicateCharFromString(String s) {
		char[] ch = s.toCharArray();
		String newstr = "";
		String duplstr = "";
		for (int i = 0; i < ch.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				newstr = newstr + ch[i];
			} else if (repeated) {
				duplstr = duplstr + ch[i];
			}

		}
		System.out.println("newStr: " + newstr);
		System.out.println("newStrlength: " + newstr.length());
		System.out.println("duplStr: " + duplstr);
		System.out.println("dupStrlength: " + duplstr.length());

	}

	public static void findduplicateCharFromString(String s) {
		// S=svdscvssd;
		char[] ch = s.toCharArray();
		String duplStr = "";
		for (int i = 0; i < s.length(); i++) {
			boolean repeated = false;
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					repeated = true;
					break;
				}
			}
			if (repeated) {
				duplStr = duplStr + ch[i];
			}
		}
		System.out
				.println("Duplicate characters from given String are: " + duplStr.length() + " String is: " + duplStr);
	}

	public static void swapStringWithTwoVariables(String a, String b) {
		// a=sandip b=khansole
		System.out.println("String before Swapping a= " + a + " b= " + b);
		a = a + b;
		b = a.substring(0, b.length() - 2);
		a = a.substring(b.length(), a.length());
		System.out.println("String After Swapping a= " + a + " b= " + b);
	}

	public static int reversenum(int num) {
		int revnum = 0;
		while (num > 0) {
			revnum = revnum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(revnum);
		return revnum;
	}

	public static void isnumpalindrome(int num) {
		if (num == reversenum(num)) {
			System.out.println("Given number is palindrome: " + num);
		} else {
			System.out.println("Given number is not palindrome: " + num + " Actual reverse Number: " + reversenum(num));
		}
	}

	public static boolean isPrimeNumber(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void getWovelsFromString(String str) {
		// StringBuilder b=new StringBuilder();
		// StringBuilder s = b.append(str);
		char[] ch = str.toCharArray();
		int wcount = 0;
		int ccount = 0;
		String wovels = "";
		String consonats = "";
		for (int i = 0; i < ch.length; i++) {
			// char character=str.charAt(i);
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				wovels = wovels + ch[i];
				wcount = wcount + 1;
			} else {
				consonats = consonats + ch[i];
				ccount = ccount + 1;
			}
		}
		System.out.println("Wovels:  " + wovels + " Count: " + wcount);
		System.out.println("consonats:  " + consonats + " Count: " + ccount);
	}

	public static void getNumberOfcharacterocurrenceinString1(String s) {
		char[] ch = s.toCharArray();
		boolean[] b = new boolean[s.length()];
		for (int i = 0; i < ch.length; i++) {
			if (b[i]) {
				continue; // reseting the previous char values from the array b
			}
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count = count + 1;
					b[j] = true;
				}

			}
			System.out.println(ch[i] + " : " + count);
		}
	}

	public static void getNumberOfcharacterocurrenceinString(String s) {
		Map<Character, Integer> mp = new HashMap<>();
		for (char n : s.toCharArray()) {
			mp.put(n, mp.getOrDefault(n, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void checkAvailableNumber(int num) {
		int[] a = { -9, 9, -6, 6, -3, 3, -11, 11 };
		// List<int[]> al= Arrays.asList(a);;
		boolean b = false;
		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);
			if (a[i] == num) {
				b = true;
			}
		}
		if (b == false) {
			System.out.println("Given number is not present in the list: " + num);
		}
	}

	public static void getTaregetNumberAddition(int targetnum) {
		int[] nums = { 2, 7, 11, 15, 7 };
		boolean b = false;
		// int[]
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == targetnum) {
					b = true;
				}
			}
			if (b == true) {
				System.out.println("Output: " + i);
			}
		}
	}

	public static void getMaxnumberfromArray() {
		int[] num = { 10, 5, 25, 8, 15, 3 };
		int max = num[0];
		// Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {

			if (num[i] > max) {
				max = num[i];
			}

		}
		System.out.println(max);

	}

	public static void getMinnumberfromArray() {
		int[] num = { 10, 5, 25, 8, 15, 3 };
		int min = num[0];
		// Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {

			if (num[i] < min) {
				min = num[i];
			}

		}
		System.out.println(min);

	}

	public static void CharOccurrence(String s) {
		HashMap<Character, Integer> charcount = new HashMap<>();
		for (char ch : s.toCharArray()) {
			if(charcount.containsKey(ch)) {
				charcount.put(ch, charcount.get(ch)+1);
			}
			else {
				charcount.put(ch, 1);
			}
		}
	System.out.println(charcount);
	}
}

package com.snet.unicode;

/**
 * This class prints a master list of all devanaagari unicodes
 * 
 * @author kalyan
 *
 */
public class DevanaagariUnicodes {
	public static void main(String[] args) {
		char ch = '\u0900';
		for (int i = 1; i < 129; i++) {
			System.out.println(String.format("%d \\u%04x %s %s", i, (int) ch, Integer.toHexString(ch), ch++));
		}
	}
}

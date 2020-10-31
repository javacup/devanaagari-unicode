package com.snet.unicode;

/**
 * given a devanaagari script this class will parse each character and display
 * the unicode
 * 
 * @author kalyan
 *
 */
public class DevanagariToUnicode {
	public static void main(String[] args) {
		String a = "मम नाम कल्याणः";
		int strLen = a.length();
		char array[] = new char[strLen];
		String strArray1[] = new String[strLen];
		for (int i = 0; i < strLen; i++) {
			array[i] = a.charAt(i);
			char ch = a.charAt(i);
			strArray1[i] = Character.toString(ch);
			System.out.println("Index = " + i + "* Char = " + array[i] + "** String =" + strArray1[i]);
			System.out.println(String.format("%d \\u%04x %s %s", i, (int) ch, Integer.toHexString(ch), ch++));
		}
	}
}

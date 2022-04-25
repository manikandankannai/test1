package org.lang;

public class LanguageInfo extends StateDetails {
	public void tamilLanguage() {
System.out.println("tamil is a world old language");
	}
	public void englishLanguage() {
		System.out.println("english is world common Language");

	}
	public void hindilanguage() {
		System.out.println("hindi is india most pepole Language");

	}
	public static void main(String[] args) {
		LanguageInfo l=new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindilanguage();
		l.southIndia();
		l.norrthIndia();
	}
	

}

package com.abm.component;

import org.springframework.stereotype.Component;

@Component("splchecker")
public class SpellChecker {
	public void checkSpellingMistakes(String document) {
		System.out.println("Haan Bol Bhai" + document);
	}
}

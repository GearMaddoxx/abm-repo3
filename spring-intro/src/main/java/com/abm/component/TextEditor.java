package com.abm.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("txtEditor")
public class TextEditor {
	
	@Autowired //DI
	private SpellChecker sp;
	
	public void loadDocument(String document) {
		System.out.println("Chaacha" + document);
		//SpellChecker sp = new SpellChecker();
		sp.checkSpellingMistakes(document);
	}
}

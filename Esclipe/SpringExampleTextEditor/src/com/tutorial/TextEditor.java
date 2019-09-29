package com.tutorial;

public class TextEditor {
	private SpellChecker spellChecker;
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor Constructor.s");
		this.spellChecker = spellChecker;
		
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}

package com.tutorial;

public class TextEditor {

	private SpellChecker spellChecker;
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor Consutructor");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
}

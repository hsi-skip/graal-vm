package com.hsi.graalvm.entity;

import javax.validation.constraints.NotEmpty;

import com.sun.istack.internal.NotNull;

public class InterpreterRequest {

	@NotEmpty
	String language;
	
	@NotNull
	String sourceCode;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

}

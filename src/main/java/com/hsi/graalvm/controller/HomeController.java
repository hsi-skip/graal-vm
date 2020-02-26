package com.hsi.graalvm.controller;

import org.graalvm.polyglot.Context;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsi.graalvm.entity.InterpreterRequest;

@RestController
public class HomeController {

	@PostMapping("/")
	public void index(@RequestBody InterpreterRequest request) {

        Context context = Context.newBuilder().allowAllAccess(true).build();
        context.eval(request.getLanguage(), request.getSourceCode());
        
	}
	
}

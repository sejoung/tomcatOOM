package com.github.sejoung.controller;

import java.util.Stack;
import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {

	@GetMapping("/test")
	public void test() {
		var stack = new Stack<String>();
		int mb = 1024 * 1024;
		var runtime = Runtime.getRuntime();
		log.info("Free Memory = {} Max Memory = {} totalMemory = {}",
				runtime.freeMemory() / mb, runtime.maxMemory() / mb,
				runtime.totalMemory() / mb);
		IntStream.range(1, Integer.MAX_VALUE).forEach((i) -> stack.push("마구닥 들어가라" + i));
	}

}

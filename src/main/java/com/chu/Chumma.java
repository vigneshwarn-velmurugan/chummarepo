package com.chu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Chumma {
@GetMapping(value="/get")
public String get() {
	return " athula onnum illa keezha potturu ";
}
}

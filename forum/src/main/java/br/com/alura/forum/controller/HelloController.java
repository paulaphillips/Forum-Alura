package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/")
	//response body diz ao Spring que o retorno do método deve ser devolvido como resposta. Diz que ele não precisa procurar esse retorno como 
	//se fosse uma página.
	@ResponseBody
	public String hello() {
		return "Hello World";
		
	}
}

package taiga.teste;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index(){
		return "Spring boot - conteiner 127.17.0.36?8081";
	}
}

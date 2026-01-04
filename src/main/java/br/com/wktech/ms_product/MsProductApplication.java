package br.com.wktech.ms_product;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MsProductApplication {
	
	private static final Logger log = LoggerFactory.getLogger(MsProductApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MsProductApplication.class, args);
	}

    @GetMapping("/products")
    public String products() {
    	log.info("Endpoint /products foi chamado");
        return "Microserviço de Produtos";
    }
}

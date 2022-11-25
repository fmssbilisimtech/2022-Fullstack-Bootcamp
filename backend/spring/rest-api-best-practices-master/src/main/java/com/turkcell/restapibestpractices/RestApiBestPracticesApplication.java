package com.turkcell.restapibestpractices;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;





@SpringBootApplication
@EnableCaching
public class RestApiBestPracticesApplication  {



    public static void main(String[] args) {
        SpringApplication.run(RestApiBestPracticesApplication.class, args);
    }

//    @Bean
//    public OpenAPI customOpenAPI(@Value("${application-description}") String description,
//                                 @Value("${application-version}") String version){
//        return new OpenAPI()
//                .info(new Info()
//                        .title("FolksdevBank API")
//                        .version(version)
//                        .description(description)
//                        .license(new License().name("FolksdevBank API Licence")));
//    }




}

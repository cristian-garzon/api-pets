package com.curso.crud.kotlin.Configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig {
    @Bean
    fun api(): Docket = Docket(DocumentationType.SWAGGER_2)
        .apiInfo(getInfo())
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build()
    private fun getInfo(): ApiInfo = ApiInfoBuilder()
        .title("first project in kotlin")
        .description("this is the first training in spring boot using kotlin :D")
        .termsOfServiceUrl("https://www.spring.io")
        .contact(Contact("cristian garzon", "https://www.linkedin.com/in/cristian-garzon-0b1b451a8/"
            ,"cristiancamilogarzon2@gmail.com"))
        .version("1.0.0")
        .build()
}
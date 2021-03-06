package com.java.techhub.kafka.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringfoxConfig {
    @Bean
    public Docket apiDocs() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("Local Kafka Application")
                .build();

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class  ))
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .apiInfo(apiInfo)
                .useDefaultResponseMessages(false);
    }

    @Bean
    public UiConfiguration uiConfig() {
        return UiConfigurationBuilder
                .builder()
                .deepLinking(true)
                .displayOperationId(false)
                .defaultModelsExpandDepth(1)
                .defaultModelExpandDepth(1)
                .defaultModelRendering(ModelRendering.EXAMPLE)
                .displayRequestDuration(false)
                .docExpansion(DocExpansion.NONE)
                .filter(false)
                .maxDisplayedTags(null)
                .operationsSorter(OperationsSorter.ALPHA)
                .showExtensions(false)
                .tagsSorter(TagsSorter.ALPHA)
                .validatorUrl(null)
                .build();
    }
}


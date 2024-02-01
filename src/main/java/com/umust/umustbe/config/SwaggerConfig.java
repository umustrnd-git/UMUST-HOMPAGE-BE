package com.umust.umustbe.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "UMUST API 명세서",
                description = "UMUST 홈페이지 BE API 명세서",
                version = "v1"))
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi getArticleApi() {
        // "/v1/**" 경로에 매칭되는 API를 그룹화하여 문서화
        String[] paths = {"/api/articles/**"};

        return GroupedOpenApi.builder()
                .group("Article")  // 그룹 이름을 설정
                .pathsToMatch(paths)     // 그룹에 속하는 경로 패턴을 지정
                .build();
    }

    @Bean
    public GroupedOpenApi getThesisApi() {
        // "/v1/**" 경로에 매칭되는 API를 그룹화하여 문서화
        String[] paths = {"/api/thesis/**"};

        return GroupedOpenApi.builder()
                .group("Thesis")  // 그룹 이름을 설정
                .pathsToMatch(paths)     // 그룹에 속하는 경로 패턴을 지정
                .build();
    }

    @Bean
    public GroupedOpenApi getFileApi() {
        // "/v1/**" 경로에 매칭되는 API를 그룹화하여 문서화
        String[] paths = {"/api/files/**"};

        return GroupedOpenApi.builder()
                .group("Files")  // 그룹 이름을 설정
                .pathsToMatch(paths)     // 그룹에 속하는 경로 패턴을 지정
                .build();
    }

}

package io.swagger;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * mockMvcのレスポンスのUTF-8、Date,OffsetDateTimeのフォーマット対応
 * 
 * テストクラスの方は@AutoConfigureMockMvcを付け、@autowiredでMockMvcをDIすること。
 * 
 */
@Configuration

public class SpringConfig implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.stream()
            .filter(converter -> converter instanceof MappingJackson2HttpMessageConverter)
            .findFirst()
            .ifPresent(converter -> ((MappingJackson2HttpMessageConverter) converter).setDefaultCharset(UTF_8));
    }

}
package io.swagger.config;

import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * application.propertiesのspring.jackson.date-format等が効かない場合に直接設定する。
 *
 */
@Configuration
@EnableWebMvc
public class ConfigApp  implements WebMvcConfigurer{
  
  @Value("yyyy-MM-dd'T'hh:MM:ss.SSSZ'HOGE'")
  private String pattern;
  
  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
    final ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    objectMapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
    objectMapper.setSerializationInclusion(Include.NON_NULL);
    objectMapper.setDateFormat(new SimpleDateFormat(pattern));
    
    converter.setObjectMapper(objectMapper);
    converters.add(converter);
    WebMvcConfigurer.super.configureMessageConverters(converters);
  }
  

}

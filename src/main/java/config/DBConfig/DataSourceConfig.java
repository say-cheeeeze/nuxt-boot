package config.DBConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * DBConfig 내용
 * @Configuration
 * - 어노테이션 기반 환경 구성을 돕는다.
 * - 이 어노테이션을 붙이고 클래스 내에 하나 이상의 @Bean 메소드를 구현하면
 * 스프링 컨테이너가 Bean 정의를 생성하고 런타임 시 그 Bean 들의 요청을 처리할 것을 선언한다.
 *
 * @ConfigurationProperties
 * application.properties 의 key 를 같은 값으로 시작하게 prefix 를 선언해두면
 * 이를 묶어서 Bean 으로 등록할 수 있다. ( spring.datasource 처럼 )
 * 즉 spring.datasource 가 접두어로 붙어있는 application.properties 를 참조할 수 있다.
 */
@Configuration
public class DataSourceConfig {
		
		@ConfigurationProperties( prefix = "spring.datasource")
		@Bean
		public DataSource dataSource() {
				return DataSourceBuilder.create().build();
		}
}

package kr.or.connect.daoexam.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
// import 여러 설정 지정해서 설정 가능(유지보수)

@Configuration
@Import(DBConfig.class)
public class ApplicationConfig {

}

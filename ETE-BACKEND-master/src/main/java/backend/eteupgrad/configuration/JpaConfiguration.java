package backend.eteupgrad.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManagerFactory;

@Configuration
public class JpaConfiguration {
	@Bean
	public EntityManagerFactory entityManagerFactory(){
		LocalContainerEntityManagerFactoryBean emfb= new LocalContainerEntityManagerFactoryBean();
		emfb.setPersistenceXmlLocation("classpath:META-INF/persistence.xml");
		emfb.afterPropertiesSet();
		return  emfb.getObject();
	}
}

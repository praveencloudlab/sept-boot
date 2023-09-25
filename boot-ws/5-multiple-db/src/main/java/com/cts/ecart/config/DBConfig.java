package com.cts.ecart.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
  basePackages = "com.cts.ecart.repository.db1",
  entityManagerFactoryRef = "db1EntityManager",
  transactionManagerRef = "db1TransactionManager"
)

public class DBConfig {
	
	public DBConfig() {
		System.out.println(">> DB1 Configuration...");
	}
	
	  @Primary
	  @Bean(name = "db1DataSource")
	  @ConfigurationProperties(prefix = "spring.datasource.db1")
	  public DataSource dataSource() {
	    return DataSourceBuilder.create().build();
	  }
	  
	  
	  @Primary
	  @Bean(name = "db1EntityManager")
	  public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder) {
	    return builder
	        .dataSource(dataSource())
	        .packages("com.cts.ecart.entity.db1")
	        .persistenceUnit("db1")
	        .build();
	  }
	  
	  @Primary
	  @Bean(name = "db1TransactionManager")
	  public PlatformTransactionManager transactionManager(EntityManagerFactoryBuilder builder) {
	    return new JpaTransactionManager(entityManagerFactory(builder).getObject());
	  }

}

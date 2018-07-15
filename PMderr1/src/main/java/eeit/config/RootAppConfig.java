package eeit.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableTransactionManagement
public class RootAppConfig {
	
	@Bean //使用Spring 的Bean 方法  把DataSource 建出來
	public DataSource dataSource() {
		ComboPooledDataSource ds = new ComboPooledDataSource();//使用c3p0的方法 取得DataSource
		// 用ComboPooledDataSource裡的方法 setUser()設定SQL帳號的名稱
		ds.setUser("sa");
		// 用ComboPooledDataSource裡的方法setPsddword()設定SQL密碼
		ds.setPassword("sa123456");
		
		// 用ComboPooledDataSource裡的方法setDriverClass()設定SQLDriver or MySQLDriver
		try {
			ds.setDriverClass("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		
		// 用ComboPooledDataSource裡的方法setJdbcUrl設定Url字串  jdbc:sqlserver://localhost:1433;databaseName=PMderrDB
		ds.setJdbcUrl("jdbc:sqlserver://192.168.23.78:1433;databaseName=PMderrDB");
		//
		ds.setInitialPoolSize(4);
		//在連結池中保留的最大連線數 
		ds.setMaxPoolSize(8);
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(dataSource());//在DataSource 裡  呼叫dataSource()方法
		factory.setPackagesToScan(new String[] {
					"eeit.model"
				});
		factory.setHibernateProperties(additionalProperties());
		return factory;
	}
	
	@Bean(name="transactionManager")
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
         HibernateTransactionManager txManager = new HibernateTransactionManager();
         txManager.setSessionFactory(sessionFactory);
         return txManager;
      }	
	
	private Properties additionalProperties()  {
		Properties properties=new Properties();
		properties.put("hibernate.dialect", org.hibernate.dialect.SQLServer2012Dialect.class);
		properties.put("hibernate.show_sql", Boolean.TRUE);
		properties.put("hibernate.format_sql", Boolean.TRUE);
		properties.put("default_batch_fetch_size", 10);
		properties.put("hibernate.hbm2ddl.auto", "update");
		return properties;
	}
}

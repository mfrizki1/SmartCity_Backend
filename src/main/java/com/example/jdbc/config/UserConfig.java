/*
 * package com.example.jdbc.config;
 * 
 * import javax.sql.DataSource;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.autoconfigure.EnableAutoConfiguration; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter;
 * 
 * //import com.example.jdbc.model.User; //import
 * com.example.jdbc.service.UserService;
 * 
 * 
 * @Configuration
 * 
 * @EnableAutoConfiguration public class UserConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Autowired DataSource datasource;
 * 
 * @Autowired public void configAuthentication(AuthenticationManagerBuilder
 * auth) throws Exception { auth.jdbcAuthentication().dataSource(datasource)
 * .usersByUsernameQuery("select * from users where city_id = @cityId and user_id = @userId and password = @password"
 * )
 * .authoritiesByUsernameQuery("select username, role from user_roles where username=?"
 * ); }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception { //
 * http.authorizeRequests().antMatchers("/",
 * "/home").permitAll().antMatchers("/admin").hasRole("ADMIN") //
 * .anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll
 * ().and().logout() // .permitAll(); //
 * http.exceptionHandling().accessDeniedPage("/403"); }
 * 
 * 
 * 
 * }
 */
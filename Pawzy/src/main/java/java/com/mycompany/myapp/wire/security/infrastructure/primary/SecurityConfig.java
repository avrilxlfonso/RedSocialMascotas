package com.mycompany.myapp.wire.security.infrastructure.primary;


import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf().disable()
      .authorizeRequests()
      .antMatchers("/api/authenticate", "/api/register").permitAll()
      .anyRequest().authenticated();
  }
}

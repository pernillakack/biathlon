package perni.com.biathlon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

import static perni.com.biathlon.models.Roles.ADMIN;
import static perni.com.biathlon.models.Roles.USER;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final PasswordConfig passwordConfig;
    private final UserDetailsService userEntityDetailsService;

    public SecurityConfig(PasswordConfig passwordConfig, UserDetailsService userEntityDetailsService) {
        this.passwordConfig = passwordConfig;
        this.userEntityDetailsService = userEntityDetailsService;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/", "/register", "/login", "/athlete").permitAll()
                        .requestMatchers("/user").hasAnyRole(ADMIN.name(), USER.name())
                        .anyRequest().authenticated()

                )
                .formLogin(formLogin -> formLogin
                        .loginPage("/login")
                        .usernameParameter("email")
                        .defaultSuccessUrl("/user")
                )
                .authenticationProvider(daoAuthenticationProvider())
                .build();
    }
    public DaoAuthenticationProvider daoAuthenticationProvider(){
        DaoAuthenticationProvider daoProvider = new DaoAuthenticationProvider();

        daoProvider.setPasswordEncoder(passwordConfig.bCryptPasswordEncoder());
        daoProvider.setUserDetailsService(userEntityDetailsService);

        return daoProvider;
    }

}

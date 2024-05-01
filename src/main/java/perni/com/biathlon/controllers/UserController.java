package perni.com.biathlon.controllers;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import perni.com.biathlon.config.PasswordConfig;
import perni.com.biathlon.models.Roles;
import perni.com.biathlon.models.UserEntity;
import perni.com.biathlon.repositories.UserRepository;

@Controller
public class UserController {
    private final org.slf4j.Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);
    private final UserRepository userRepository;
    private final PasswordConfig passwordConfig;

    public UserController(UserRepository userRepository, PasswordConfig passwordConfig) {
        this.userRepository = userRepository;
        this.passwordConfig = passwordConfig;
    }

    @GetMapping("/register")
    public String registreringSida(UserEntity userEntity, Model model) {
        model.addAttribute("roles", Roles.values());
        return "register";
    }

    @PostMapping("/register")
    public String registreraAnvandare(@Valid UserEntity userEntity, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            logger.info("Mottagen registrering: {}", userEntity);
            System.out.println(userEntity);
            return "register";
        }
        userEntity.setPassword(passwordConfig.bCryptPasswordEncoder().encode(userEntity.getPassword()));
        userEntity.setAccountEnabled(true);
        userEntity.setAccountNonLocked(true);
        userEntity.setAccountNonExpired(true);
        userEntity.setCredentialsNonExpired(true);
        userEntity.getAuthorities();

        userRepository.save(userEntity);
        logger.info("Mottagen registrering: {}", userEntity);
        System.out.println(userEntity);
        return "redirect:/user";
    }

    @GetMapping("/user")
    public String userPage(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        UserEntity currentUser = userRepository.findByEmail(email);
        model.addAttribute("email", email);
        return "user";
    }


}

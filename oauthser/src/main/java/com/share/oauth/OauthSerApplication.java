package com.share.oauth;

import com.share.oauth.repository.support.WiselyRepositoryImpl;
import com.share.oauth.security.SecurityUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EnableJpaRepositories(repositoryBaseClass = WiselyRepositoryImpl.class)
public class OauthSerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthSerApplication.class, args);
    }

    @Bean(name = "auditorAware")
    public AuditorAware<String> auditorAware() {
        return ()-> SecurityUtils.getCurrentUserUsername();
    }

//    @RequestMapping(value = { "/user" }, produces = "application/json")
//    public Map<String, Object> user(OAuth2Authentication user) {
//        Map<String, Object> userInfo = new HashMap<>();
//        userInfo.put("user", user.getUserAuthentication().getPrincipal());
//        userInfo.put("authorities", AuthorityUtils.authorityListToSet(user.getUserAuthentication().getAuthorities()));
//        return userInfo;
//    }
//
//
//    @GetMapping(value = "/current")
//    public Principal getUser(Principal principal) {
//        return principal;
//    }


}

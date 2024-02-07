package com.token.RpgToken.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
public class OAuth2Config extends AuthorizationServerConfigurerAdapter {
    private final PasswordEncoder passwordEncoder;

    public OAuth2Config() {
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("cliente1")
                .secret(passwordEncoder.encode("senhaCliente1"))
                .authorizedGrantTypes("authorization_code", "refresh_token", "password")
                .scopes("read", "write")
                .redirectUris("http://localhost:8080/callback")
                .and()
                .withClient("cliente2")
                .secret(passwordEncoder.encode("senhaCliente2"))
                .authorizedGrantTypes("authorization_code", "client_credentials")
                .scopes("read");
    }
}

package com.FHub.Forum.Hub.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.FHub.Forum.Hub.domain.Usuario;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

@Service
public class TokenService {
    @Value("${jwt.secret}")
    private String secret;
    public String gerarToken(Usuario usuario){
        Algorithm algorithm = Algorithm.HMAC256(secret);
        return JWT.create()
                .withIssuer("forumhub")
                .withSubject(usuario.getLogin())
                .withExpiresAt(new Date(System.currentTimeMillis()+3600000))
                .sign(algorithm);
    }
}
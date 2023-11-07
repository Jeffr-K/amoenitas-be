package com.annonymous.ttaleum.modules.user.common;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Service
@PropertySource("classpath:application-local.yml")
public class TokenProvider {
  private final String secretKey;
  private final long expirationHours;
  private final String issuer;

  public TokenProvider(
    @Value("${secret-key}") String secretKey,
    @Value("${expiration-hours}") long expirationHours,
    @Value("${issuer}") String issuer
  ) {
    this.secretKey = secretKey;
    this.expirationHours = expirationHours;
    this.issuer = issuer;
  }

  public String generateAccessToken(String userSpecification) {
    return Jwts.builder()
      .signWith(new SecretKeySpec(secretKey.getBytes(), SignatureAlgorithm.HS512.getJcaName()))
      .setSubject(userSpecification)
      .setIssuer(issuer)
      .setIssuedAt(Timestamp.valueOf(LocalDateTime.now()))
      .setExpiration(Date.from(Instant.now().plus(expirationHours, ChronoUnit.HOURS)))
      .compact();
  }

  public String validateAccessTokenAndGetSubject(String token) {
    return Jwts.parserBuilder()
      .setSigningKey(secretKey.getBytes())
      .build()
      .parseClaimsJws(token)
      .getBody()
      .getSubject();
  }
}

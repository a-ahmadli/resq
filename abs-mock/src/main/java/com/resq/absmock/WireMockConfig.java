package com.resq.absmock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WireMockConfig {

  @Bean(initMethod = "start", destroyMethod = "stop")
  public WireMockServer wireMockServer() {
    return new WireMockServer(
        WireMockConfiguration.options().port(8081).usingFilesUnderClasspath("wiremock"));
  }
}

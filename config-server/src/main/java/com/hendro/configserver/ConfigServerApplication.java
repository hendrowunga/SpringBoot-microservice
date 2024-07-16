package com.hendro.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}

/*
  - @EnableConfigServer : Ini menandakan bahwa aplikasi ini adalah config Server.
 						  Config server digunkan untuk menyimpan dan mengelola konfigurasi terpusat untuk aplikasi lain.

  - @SpringBootAplication : Anotasi ini menandakan bahwa ini adalah kelas utama dari apliasi Spring boot.
  						 Ini menggabunkan beberapa anotasi lain seperti "@Configuration","@EnableAutoConfiguration",dan "@ComponentScan"
  - public static void main(String[] args): Method ini adalah titik masuk utama aplikasi Java.
  									Ketika aplikasi dijalankan, method ini akan memulai Spring application context dan menjalankan aplikasi Spring Boot.
 */
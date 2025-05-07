package com.corto.application.data.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    @Bean
    public CommandLineRunner createDatabase() {
        return args -> {
            String url = "jdbc:postgresql://localhost:5432/";
            String username = "postgres";
            String password = "postgres"; // Asegúrate de usar la contraseña correcta

            try (Connection connection = DriverManager.getConnection(url, username, password);
                 Statement statement = connection.createStatement()) {
                
                // Verificar si la base de datos existe
                try {
                    // Intentar crear la base de datos
                    statement.executeUpdate("CREATE DATABASE \"corto-ha23039\"");
                    System.out.println("Base de datos creada exitosamente");
                } catch (SQLException e) {
                    // Si la base de datos ya existe, mostrar mensaje
                    if (e.getMessage().contains("ya existe")) {
                        System.out.println("La base de datos ya existe, continuando...");
                    } else {
                        // Si es otro error, lanzarlo
                        throw e;
                    }
                }
            } catch (SQLException e) {
                System.err.println("Error al crear la base de datos: " + e.getMessage());
                e.printStackTrace();
                // No lanzar la excepción para que la aplicación continúe
            }
        };
    }
}
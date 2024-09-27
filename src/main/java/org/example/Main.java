package org.example;

import org.example.dao.UserDAO;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practica JDBC Tradicional.");

        // Crear instancia
        UserDAO userDAO = new UserDAO();

        /* Crear usuario
        User newUser = new User("JohnDoe", "johndoe@example.com");
        userDAO.createUser(newUser);
        */

        // Leer usuario
        int id = 7;
        System.out.println("Consulta registro " + id);
        User user = userDAO.getUserById(id);
        if(user != null){
            System.out.println(String.format("Usuario recuperado %s ", user));
        } else {
            System.out.println(String.format("Usuario %s no encontrado.", id));
        }

        /* Actualizar usuario
        user.setUsername("JaneDoe");
        user.setEmail("janedoe@example.com");
        userDAO.updateUser(user);
        */

        // Eliminar usuario
        // userDAO.deleteUser(1);
    }
}
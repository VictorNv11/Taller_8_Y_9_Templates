package co.edu.sena.project2687350.model.repository;

import co.edu.sena.project2687350.model.User;

import java.sql.*;

public class TestUserRepositoryImpl {

    public static void main(String[] args) throws SQLException {
    Repository<User> repository = new UserRepositoryImpl();

        System.out.println("============SaveObj Insert============");
        User userInsert = new User();
        userInsert.setUser_firstname("Andres");
        userInsert.setUser_lastname("Perez");
        userInsert.setUser_email("ANDPer.225@gmail.com");
        userInsert.setUser_password("AndPrez5421");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("esteban");
        userInsert.setUser_lastname("castañeda");
        userInsert.setUser_email("estbCas12@gmail.com");
        userInsert.setUser_password("estBCas5420");
        repository.saveObj(userInsert);

        System.out.println("============listAllObj============");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("============byIdObj============");
        System.out.println(repository.byIdObj(1));
        System.out.println();

            System.out.println("============saveObj============");
        User userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_firstname("carlos");
        userUpdate.setUser_lastname("castro");
        userUpdate.setUser_email("carCast22@gmail.com");
        userUpdate.setUser_password("cast40Car22");
        repository.saveObj(userUpdate);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();


        System.out.println("============deleteObj============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);

    }
}

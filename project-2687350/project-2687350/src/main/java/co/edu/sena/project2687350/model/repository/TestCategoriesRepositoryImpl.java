package co.edu.sena.project2687350.model.repository;

import co.edu.sena.project2687350.model.Category;

import java.sql.SQLException;

public class  TestCategoriesRepositoryImpl {

    public static void main(String[] args) throws SQLException {
        Repository <Category> repository = new CategoriesRepositoryImpl();

        System.out.println("============SaveObj Insert============");
        Category categoryInsert = new Category();
        categoryInsert.setCategory_name ("Felipe");
        repository.saveObj(categoryInsert);
        categoryInsert.setCategory_name ("Daniel");
        repository.saveObj(categoryInsert);

        System.out.println("============listAllObj============");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("============byIdObj============");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("============saveObj============");
        Category categoryUpdate = new Category();
        categoryUpdate.setCategory_id (2);
        categoryUpdate.setCategory_name ("Carlos");
        repository.saveObj(categoryUpdate);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("============deleteObj============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);

    }
}

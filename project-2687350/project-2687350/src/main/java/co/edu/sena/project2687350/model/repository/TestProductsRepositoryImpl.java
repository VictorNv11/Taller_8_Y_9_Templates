package co.edu.sena.project2687350.model.repository;

import co.edu.sena.project2687350.model.Product;

import java.sql.SQLException;

public class TestProductsRepositoryImpl {

    public static void main(String[] args) throws SQLException {
    Repository<Product> repository = new ProductsRepositoryImpl();

        System.out.println("============SaveObj Insert============");
        Product productInsert = new Product();
        productInsert.setProduct_name ("Crema");
        productInsert.setProduct_value ("20000");
        productInsert.setCategory_id (1);
        repository.saveObj(productInsert);
        productInsert.setProduct_name ("Jabon");
        productInsert.setProduct_value ("15000");
        productInsert.setCategory_id (1);
        repository.saveObj(productInsert);

        System.out.println("============listAllObj============");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("============byIdObj============");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("============saveObj============");
        Product productUpdate = new Product();
        productUpdate.setProduct_id(2);
        productUpdate.setProduct_name ("Pastillas");
        productUpdate.setProduct_value ("2000");
        productUpdate.setCategory_id (1);
        repository.saveObj(productUpdate);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("============deleteObj============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);

    }
}

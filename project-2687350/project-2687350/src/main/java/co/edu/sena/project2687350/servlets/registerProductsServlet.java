package co.edu.sena.project2687350.servlets;

import co.edu.sena.project2687350.model.Product;
import co.edu.sena.project2687350.model.repository.ProductsRepositoryImpl;
import co.edu.sena.project2687350.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet ("/prductos")
public class registerProductsServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
    }
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String product_name = request.getParameter("product_name");
        String product_value = request.getParameter("product_value");
        Integer category_id = Integer.parseInt(request.getParameter("category_id"));

        Product product = new Product(product_name, product_value,category_id);

        Repository <Product> repository = new ProductsRepositoryImpl();
        int fila = 0;

        try {
            fila = repository.saveObj(product);
        }
        catch (SQLException e ){
            e.printStackTrace();
        }
        if (fila==0){
            System.out.println("Error");
        }
        else{
            System.out.println("Se ha registrado");
        }
    }
}

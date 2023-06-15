package co.edu.sena.project2687350.servlets;

import co.edu.sena.project2687350.model.Category;
import co.edu.sena.project2687350.model.User;
import co.edu.sena.project2687350.model.repository.CategoriesRepositoryImpl;
import co.edu.sena.project2687350.model.repository.Repository;
import co.edu.sena.project2687350.model.repository.UserRepositoryImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet ("/categorias")
public class registerCategoryServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String category_name = req.getParameter("category_name");

        Category category = new Category (category_name);

        Repository<Category> repository = new CategoriesRepositoryImpl();
        int fila = 0;

        try{
            fila= repository.saveObj(category);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        if (fila==0){
            System.out.println("Error");
        }
        else {
            System.out.println("La categoria se ha registrado");
        }
    }
}

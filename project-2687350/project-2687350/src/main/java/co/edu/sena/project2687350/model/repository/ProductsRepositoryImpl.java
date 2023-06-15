package co.edu.sena.project2687350.model.repository;

import co.edu.sena.project2687350.model.Product;
import co.edu.sena.project2687350.util.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductsRepositoryImpl implements Repository<Product> {

    private String sql =null;
    @Override
    public List<Product> listAllObj() throws SQLException {
        sql = "select u.product_id, u.product_name, u.product_value, u.category_id from products_tbl u order by u.product_name";
        List<Product> products = new ArrayList<>();
        try (Connection conn = ConnectionPool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Product u = createObj(rs);
                products.add(u);
            }
        }
        return products;
    }

    @Override
    public Product byIdObj(Integer id) throws SQLException {
        sql= "select u.product_id, u.product_name, u.product_value, u.category_id from products_tbl u where u.product_id = ?";

        Product product =null;
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps =conn.prepareStatement(sql)){
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()){
                if (rs.next()){
                    product = createObj(rs);
                }
            }
        }
        return product;
    }

    @Override
    public Integer saveObj(Product product) throws SQLException {
        int rowsAffected = 0;
        if (product.getProduct_id() != null && product.getProduct_id() > 0) {
            sql = "update products_tbl set product_name = ?, product_value = ?,category_id = ? " +
                   "where product_id = ? ";
        } else {
            sql = "insert into products_tbl (product_name, product_value, category_id)" +
                   "values (upper(?), upper(?), ?)";
        }
        try (Connection conn = ConnectionPool.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)){
        ps.setString(1, product.getProduct_name());
        ps.setString(2, product.getProduct_value());
        ps.setInt(3, product.getCategory_id());
        if (product.getProduct_id()!=null && product.getProduct_id() >0){
            ps.setInt(4, product.getProduct_id());
        }
        rowsAffected = ps.executeUpdate();
        }
        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql="delete from products_tbl where product_id = ?";
        try ( Connection conn = ConnectionPool.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    @Override
    public Product createObj (ResultSet rs) throws SQLException{
        Product product = new Product();
        product.setProduct_id(rs.getInt("product_id"));
        product.setProduct_name(rs.getString("product_name"));
        product.setProduct_value(rs.getString("product_value"));
        product.setCategory_id(rs.getInt("category_id"));
        return product;

    }
}

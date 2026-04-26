package com.dao;

import java.sql.*;
import java.util.*;

import com.model.Product;

public class ProductDAO {

    // CONNECTION
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/productdb",
            "root",
            "raksha@01"
        );
    }

    //  INSERT PRODUCT
    public static int addProduct(Product p) throws Exception {

        Connection con = getConnection();

        String sql = "INSERT INTO Products VALUES (?,?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, p.getProductId());
        ps.setString(2, p.getProductName());
        ps.setString(3, p.getCategory());
        ps.setDouble(4, p.getPrice());
        ps.setInt(5, p.getQuantity());

        int status = ps.executeUpdate();

        con.close(); //  important

        return status;
    }

    // UPDATE PRODUCT
    public static int updateProduct(Product p) throws Exception {

        Connection con = getConnection();

        String sql = "UPDATE Products SET ProductName=?, Category=?, Price=?, Quantity=? WHERE ProductID=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, p.getProductName());
        ps.setString(2, p.getCategory());
        ps.setDouble(3, p.getPrice());
        ps.setInt(4, p.getQuantity());
        ps.setInt(5, p.getProductId());

        int status = ps.executeUpdate();

        con.close();

        return status;
    }

    // DELETE PRODUCT
    public static int deleteProduct(int id) throws Exception {

        Connection con = getConnection();

        String sql = "DELETE FROM Products WHERE ProductID=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        int status = ps.executeUpdate();

        con.close();

        return status;
    }

    //  DISPLAY ALL PRODUCTS
    public static List<Product> getAllProducts() throws Exception {

        Connection con = getConnection();

        String sql = "SELECT * FROM Products";

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        List<Product> list = new ArrayList<>();

        while(rs.next()) {

            Product p = new Product();

            p.setProductId(rs.getInt("ProductID"));
            p.setProductName(rs.getString("ProductName"));
            p.setCategory(rs.getString("Category"));
            p.setPrice(rs.getDouble("Price"));
            p.setQuantity(rs.getInt("Quantity"));

            list.add(p);
        }

        con.close();

        return list;
    }

    // FILTERED REPORT
    public static List<Product> getFilteredProducts(String category, double price) throws Exception {

        Connection con = getConnection();

        String sql = "SELECT * FROM Products WHERE 1=1";

        if(category != null && !category.trim().isEmpty()) {
            sql += " AND Category = ?";
        }

        if(price > 0) {
            sql += " AND Price > ?";
        }

        PreparedStatement ps = con.prepareStatement(sql);

        int i = 1;

        if(category != null && !category.trim().isEmpty()) {
            ps.setString(i++, category);
        }

        if(price > 0) {
            ps.setDouble(i++, price);
        }

        ResultSet rs = ps.executeQuery();

        List<Product> list = new ArrayList<>();

        while(rs.next()) {

            Product p = new Product();

            p.setProductId(rs.getInt("ProductID"));
            p.setProductName(rs.getString("ProductName"));
            p.setCategory(rs.getString("Category"));
            p.setPrice(rs.getDouble("Price"));
            p.setQuantity(rs.getInt("Quantity"));

            list.add(p);
        }

        con.close();

        return list;
    }

    // NEW: TOP N PRODUCTS (IMPORTANT FEATURE)
    public static List<Product> getTopProducts(int limit) throws Exception {

        Connection con = getConnection();

        String sql = "SELECT * FROM Products ORDER BY Quantity DESC LIMIT ?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, limit);

        ResultSet rs = ps.executeQuery();

        List<Product> list = new ArrayList<>();

        while(rs.next()) {

            Product p = new Product();

            p.setProductId(rs.getInt("ProductID"));
            p.setProductName(rs.getString("ProductName"));
            p.setCategory(rs.getString("Category"));
            p.setPrice(rs.getDouble("Price"));
            p.setQuantity(rs.getInt("Quantity"));

            list.add(p);
        }

        con.close();

        return list;
    }
}
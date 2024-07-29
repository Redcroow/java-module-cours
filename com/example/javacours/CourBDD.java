package com.example.javacours;

import java.sql.*;

public class CourBDD {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database", "root" , "my-secret-pw");
//            Statement statement = connection.createStatement();

//            ResultSet resultSet = statement.executeQuery("SELECT * FROM product");
//
//            while (resultSet.next()) {
//                String name = resultSet.getString("product_name");
//                float price = resultSet.getFloat("product_price");
//                System.out.println(name + "vendu à : " + price );
//            }

//            String req = "DELETE FROM product WHERE product_quantity = 90";
//            statement.executeUpdate(req);
//            System.out.println("Produits supprimé");

            PreparedStatement statement = connection.prepareStatement("UPDATE product SET product_name = ? WHERE product_name = ?");
            statement.setString(1, "Ordinateur protable MSI");
            statement.setString(2, "Product 1");
            statement.executeUpdate();



            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC non trouvé : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
    }
}

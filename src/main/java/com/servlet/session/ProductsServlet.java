package com.servlet.session;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.RequestDispatcher;
import database.DBConnector;

public class ProductsServlet extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        ResultSet resultSet = null;
        Statement statement = null;

        try {
            Connection conn = new DBConnector().getConn();
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT ImagePath FROM Products");
            while(resultSet.next()) {
            } String imagePath = resultSet.getString("ImagePath");
                System.out.println("image path: " + imagePath);
                req.setAttribute("ImagePath", imagePath);
                RequestDispatcher dispatcher = req.getRequestDispatcher("Products.jsp");

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
        }

    }


}





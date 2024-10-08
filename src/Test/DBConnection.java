package Test;

import OnlineCourior.Courier;
import OnlineCourior.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {

        Connection connect() {
            // Connect to the database
            String url = "jdbc:mysql://localhost:3306/courier_db";
            String user = "root";
            String password = "password";
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(url, user, password);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return conn;
        }

        public boolean loginUser(String username, String password) {
            String sql = "SELECT * FROM users WHERE username=? AND password=?";
            try (Connection conn = this.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                ResultSet rs = pstmt.executeQuery();
                return rs.next();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }

        public void registerUser(User user) {
            String sql = "INSERT INTO users (username, password, email, address) VALUES (?, ?, ?, ?)";
            try (Connection conn = this.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, user.getUsername());
                pstmt.setString(2, user.getPassword());
                pstmt.setString(3, user.getEmail());
                pstmt.setString(4, user.getAddress());
                pstmt.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void bookCourier(Courier courier) {
            String sql = "INSERT INTO couriers (sender_id, pickup_address, delivery_address, package_details, status, price) VALUES (?, ?, ?, ?, ?, ?)";
            try (Connection conn = this.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, courier.getSenderId());
                pstmt.setString(2, courier.getPickupAddress());
                pstmt.setString(3, courier.getDeliveryAddress());
                pstmt.setString(4, courier.getPackageDetails());
                pstmt.setString(5, "Pending");
                pstmt.setDouble(6, courier.getPrice());
                pstmt.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



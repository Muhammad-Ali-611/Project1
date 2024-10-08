package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TrackCourier {

        public void trackCourier(int courierId) {
            String sql = "SELECT * FROM tracking WHERE courier_id=?";
            try (Connection conn = new DBConnection().connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, courierId);
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    System.out.println("Location: " + rs.getString("current_location"));
                    System.out.println("Status: " + rs.getString("status"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



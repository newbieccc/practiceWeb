package dao;

import DB.DBConnection;
import dto.InsertDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDao {

    public int insert(InsertDto insertDto) {
        Connection con = null;
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO insertInto(text, textLine)" + " VALUES (?, ?)";
        int result = 0;

        try {
            con = DBConnection.dbconn();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, insertDto.getTitle());
            pstmt.setString(2, insertDto.getTextLine());

            result = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }


}

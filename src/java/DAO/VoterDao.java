package DAO;

import Model.Voter;
import Utils.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;

public class VoterDao {

    public static Voter login(String username, String password) throws NamingException, SQLException {
        Connection con1 = Utils.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Voter voter = new Voter();

        String sql = "SELECT * FROM voters WHERE username=? and password=?";
        pstm = con1.prepareStatement(sql);
        pstm.setString(1, username);
        pstm.setString(2, password);

        rs = pstm.executeQuery();

        while (rs.next()) {
            voter.setName(rs.getString(1));
            voter.setId_cand(rs.getInt(3));
        }
        return voter;

    }
}

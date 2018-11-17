/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utils.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.NamingException;

/**
 *
 * @author Herc
 */
public class CandidateDao {

    public static ArrayList<String> name() throws NamingException, SQLException {
        Connection con1 = Utils.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<String> arr_cand = new ArrayList();

        String sql = "SELECT * FROM candidates;";
        pstm = con1.prepareStatement(sql);
        rs = pstm.executeQuery();

        while (rs.next()) {
            arr_cand.add(rs.getString(3));
        }
        return arr_cand;

    }
}

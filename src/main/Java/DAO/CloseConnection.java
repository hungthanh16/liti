package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CloseConnection {
    public CloseConnection ()
    {

    }
    public void dongKetNoi(Connection con, PreparedStatement pr) {
        try {
            if (con != null) {
                con.close();
            }
            if (pr != null) {
                pr.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dongKetNoi(Connection con, PreparedStatement pr, ResultSet rs) {
        try {
            if (con != null) {
                con.close();
            }
            if (pr != null) {
                pr.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dongKetNoi(Connection con, PreparedStatement pr1, PreparedStatement pr2)
    {
        try {
            if (pr2 != null) {
                pr2.close();
            }
            if (pr1 != null) {
                pr1.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dongKetNoi(Connection con, PreparedStatement pr1, PreparedStatement pr2,ResultSet rs)
    {
        try {
            if (pr2 != null) {
                pr2.close();
            }
            if (pr1 != null) {
                pr1.close();
            }
            if (con != null) {
                con.close();
            }
            if(rs!=null)
            {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package DAO.user;

import DAO.GetConnection;
import Mapper.ModelMapper;
import Model.Account;
import Model.Parents;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InformationParentDAO extends GetConnection {
    public Parents xuatThongTinPhuHuynh(String tendangnhap)
    {
        Connection con=getConnection();
        String sql="select * from phuhuynh where TenDangNhap=?";
        PreparedStatement pr=null;
        ResultSet rs=null;
        Parents pa=null;
        if(con!=null)
        {
            try {
                pr=con.prepareStatement(sql);
                pr.setString(1,tendangnhap);
                rs=pr.executeQuery();
                if(rs.next())
                {
                    pa= ModelMapper.mapResultSetToObject(rs,Parents.class);
                }
                return pa;
            }catch (SQLException | IllegalAccessException | InstantiationException e){
                e.printStackTrace();
                return null;
            }
            finally {
                try {
                    if(con!=null)
                    {
                        con.close();
                    }
                    if(pr!=null)
                    {
                        pr.close();
                    }
                    if(rs!=null)
                    {
                        pr.close();
                    }
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public Boolean suaThongTinPhuHuynh(String tendangnhap, Parents phuhuynh)
    {
        Connection con=getConnection();
        String sql="update phuhuynh set Ho=?,Ten=?,GioiTinh=?,NgaySinh=? where TenDangNhap=?";
        PreparedStatement pr=null;
        if(con!=null)
        {
            try {
                pr=con.prepareStatement(sql);
                pr.setString(1,phuhuynh.getHo());
                pr.setString(2,phuhuynh.getTen());
                pr.setString(3,phuhuynh.getGioitinh());
                pr.setString(4,phuhuynh.getNgaysinh());
                pr.setString(5,tendangnhap);
                pr.executeUpdate();
                return true;
            }catch (SQLException e)
            {
                e.printStackTrace();
                return false;
            }finally {
                try {
                    if(con!=null)
                    {
                        con.close();
                    }
                    if(pr!=null)
                    {
                        pr.close();
                    }
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}

package DAO.user;

import DAO.GetConnection;
import Mapper.ModelMapper;
import Model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO extends GetConnection {

   public Account dangNhap(Account a)
   {
       Connection con=getConnection();
       String sql="select * from TaiKhoanPhuHuynh where TenDangNhap=? and MatKhau=?";
       PreparedStatement pr=null;
       ResultSet rs=null;
       Account pa=null;
       if(con!=null)
       {
           try {
               pr=con.prepareStatement(sql);
               pr.setString(1,a.getTendangnhap());
               pr.setString(2,a.getMatkhau());
               rs=pr.executeQuery();
               if(rs.next())
               {
                   pa= ModelMapper.mapResultSetToObject(rs,Account.class);
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

   public String layTenDangNhap (Account a)
   {
       Connection con=getConnection();
       String sql="select TenDangNhap from taikhoanphuhuynh where TenDangNhap=? and MatKhau=?";
       PreparedStatement pr=null;
       ResultSet rs=null;
       if(con!=null)
       {
           try {
               pr=con.prepareStatement(sql);
               pr.setString(1,a.getTendangnhap());
               pr.setString(2,a.getMatkhau());
               rs=pr.executeQuery();
               if(rs.next())
               {
                   return rs.getString("TenDangNhap");
                }

           }catch (SQLException e){
                e.printStackTrace();
                return null;
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



}

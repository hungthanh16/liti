package DAO.user;

import DAO.GetConnection;
import Mapper.ModelMapper;
import Model.Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InfomationStudentsDAO extends GetConnection {
    public List<Students> thongtin(String tendangnhap) {
        Connection con = getConnection();
        String sql = "select * from hocsinh where tendangnhap=?";
        PreparedStatement pr = null;
        ResultSet rs = null;
        List<Students> list = new ArrayList<>();
        if (con != null) {
            try {
                pr = con.prepareStatement(sql);
                pr.setString(1, tendangnhap);
                rs = pr.executeQuery();
                while (rs.next()) {
                    Students a = new Students();
                    a = ModelMapper.mapResultSetToObject(rs, Students.class);
                    list.add(a);
                }
                return list;

            } catch (SQLException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
                return null;
            } finally {
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
        }
        return null;
    }

    public Students thongTinDuaVaoId(int id , String tendangnhap)
    {
        Connection con = getConnection();
        String sql = "select * from hocsinh where idhocsinh=? and tendangnhap=?";
        PreparedStatement pr = null;
        ResultSet rs = null;
        if(con!=null)
        {
            try {
                pr=con.prepareStatement(sql);
                pr.setInt(1,id);
                pr.setString(2,tendangnhap);
                rs=pr.executeQuery();
                if(rs.next())
                {
                    return (ModelMapper.mapResultSetToObject(rs,Students.class));
                }
            }catch (SQLException | IllegalAccessException | InstantiationException e)
            {
                e.printStackTrace();
                return null;
            }finally {
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

        }
        return null;
    }

        public Students sua(int id, Students a)
        {
            Connection con=getConnection();
            String sql="update hocsinh set ho=?,ten=?,gioitinh=?,ngaysinh=?,truong=?,lop=? where idhocsinh=?";
            PreparedStatement pr=null;
            if(con!=null) {
                try {
                    pr=con.prepareStatement(sql);
                    pr.setString(1,a.getHo());
                    pr.setString(2,a.getTen());
                    pr.setString(3,a.getGioitinh());
                    pr.setString(4,a.getNgaysinh());
                    pr.setString(5,a.getTruong());
                    pr.setString(6,a.getLop());
                    pr.setInt(7,id);

                    if(pr.executeUpdate()>0)
                    {
                        return a;
                    }else
                    {
                        return null;
                    }
                } catch (SQLException e){
                       e.printStackTrace();
                       return null;
                }finally {
                    try {
                        if (con != null)
                        {
                            con.close();
                        }
                        if(pr!=null)
                        {
                            pr.close();
                        }
                    }
                    catch (SQLException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
            return null;
            }
        }





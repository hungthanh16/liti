package DAO.user;

import DAO.CloseConnection;
import DAO.GetConnection;
import Mapper.ModelMapper;

import Model.Contract;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContractDAO extends GetConnection{
    CloseConnection close=new CloseConnection();
    public Contract themHopDong(Contract a) throws ParseException{
        Connection con = getConnection();
        String sql = "insert into hopdong(idHocSinh,NgayTaoHopDong,NgayBatDau,NgayKetThuc,NgayCapNhatTrangThai,idTramDon,idTruong,idTrangThai) values(?,?,?,?,?,?,?,?)";
        PreparedStatement pr = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        if(con!=null)
        {
            try {
                Date ngayThang = sdf.parse(a.getNgaytaohopdong());
                java.sql.Date ngayThangTaoHopDongSQL = new java.sql.Date(ngayThang.getTime());
                ngayThang = sdf.parse(a.getNgaybatdauhopdong());
                java.sql.Date ngayThangBatDauHopDongSQL = new java.sql.Date(ngayThang.getTime());
                ngayThang = sdf.parse(a.getNgayketthuchopdong());
                java.sql.Date ngayThangKetThucHopDongSQL = new java.sql.Date(ngayThang.getTime());
                ngayThang = sdf.parse(a.getNgaycapnhattrangthai());
                java.sql.Date ngayCapnhattrangthaiSQL = new java.sql.Date(ngayThang.getTime());
                pr=con.prepareStatement(sql);
                pr.setInt(1,a.getIdhocsinh());
                pr.setDate(2,ngayThangTaoHopDongSQL);
                pr.setDate(3,ngayThangBatDauHopDongSQL);
                pr.setDate(4,ngayThangKetThucHopDongSQL);
                pr.setDate(5,ngayCapnhattrangthaiSQL);
                pr.setInt(6,a.getIdtramdon());
                pr.setInt(7,a.getIdtruong());
                pr.setInt(8,0);

                if(pr.executeUpdate() > 0)
                {
                    return a;
                }
                else{
                    return null;
                }
            }catch (SQLException e)
            {
                e.printStackTrace();
                return null;
            }finally {
                close.dongKetNoi(con,pr);
            }
        }
        return null;
    }

    public boolean capnhattrangthai(int idTrangThai, String ngaycapnhat, int idHopDong) throws ParseException{
        Connection con = getConnection();
        String sql = "update hopdong set NgayCapNhatTrangThai=?, idTrangThai=? where idHopDong=?";
        PreparedStatement pr = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        if(con!=null)
        {
            try {
                Date ngayThang = sdf.parse(ngaycapnhat);
                java.sql.Date ngayCapnhattrangthaiSQL = new java.sql.Date(ngayThang.getTime());
                pr=con.prepareStatement(sql);
                pr.setDate(1,ngayCapnhattrangthaiSQL);
                pr.setInt(2,idTrangThai);
                pr.setInt(3, idHopDong);
                if(pr.executeUpdate() > 0)
                {
                    return true;
                }
                else{
                    return false;
                }
            }catch (SQLException e)
            {
                e.printStackTrace();
                return false;
            }finally {
                close.dongKetNoi(con,pr);
            }
        }
        return false;
    }

    public Contract laythongtinhopdong(int idHocSinh) throws ParseException{
        Connection con=getConnection();
        String sql="select * from hopdong where idHocSinh=?";
        PreparedStatement pr=null;
        ResultSet rs=null;
        Contract pa=null;
        if(con!=null)
        {
            try {
                pr=con.prepareStatement(sql);
                pr.setInt(1,idHocSinh);
                rs=pr.executeQuery();
                if(rs.next())
                {
                    pa= ModelMapper.mapResultSetToObject(rs,Contract.class);
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
}

package DAO.user;
import DAO.CloseConnection;
import DAO.GetConnection;
import Mapper.ModelMapper;
import Model.Contract;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
public class InformationContractDAO extends GetConnection{
    CloseConnection close=new CloseConnection();
    public List<Contract> xemHopDong(String tendangnhap) throws ParseException{
        Connection con = getConnection();
        String sql = "select hd.idHopDong, hs.Ho, hs.Ten, hs.NgaySinh, hs.GioiTinh, hs.Truong, hs.Lop, hd.NgayTaoHopDong, hd.NgayBatDau, hd.NgayKetThuc, hd.NgayCapNhatTrangThai, tthd.TenTrangThai from hopdong as hd, hocsinh as hs, trangthaihopdong as tthd where hd.idHocSinh = hs.idHocSinh and tthd.idTrangThai=hd.idTrangThai and hs.TenDangNhap = ?";
        PreparedStatement pr = null;
        ResultSet rs = null;
        List<Contract> list = new ArrayList<>();
        if (con != null) {
            try {
                pr = con.prepareStatement(sql);
                pr.setString(1, tendangnhap);
                rs = pr.executeQuery();
                while (rs.next()) {
                    Contract a = new Contract();
                    a = ModelMapper.mapResultSetToObject(rs, Contract.class);
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
}

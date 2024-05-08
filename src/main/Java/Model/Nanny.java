package Model;

public class Nanny {
    private int idbaomau;
    private String ho;
    private String ten;
    private String gioitinh;
    private String ngaysinh;
    private String cccd;
    private String email;
    private String sdt;

    public Nanny(){}

    public Nanny(int idbaomau, String ho, String ten, String gioitinh, String ngaysinh, String cccd, String email, String sdt) {
        this.idbaomau = idbaomau;
        this.ho = ho;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.cccd = cccd;
        this.email = email;
        this.sdt = sdt;
    }

    public int getIdbaomau() {
        return idbaomau;
    }

    public void setIdbaomau(int idbaomau) {
        this.idbaomau = idbaomau;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}

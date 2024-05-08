package Model;

public class Driver {
    private int idtaixe;
    private String ho;
    private String ten;
    private String gioitinh;
    private String ngaysinh;
    private String cccd;
    private String email;
    private String sdt;

    public Driver(){}

    public Driver(int idtaixe, String ho, String ten, String gioitinh, String ngaysinh, String cccd, String email, String sdt) {
        this.idtaixe = idtaixe;
        this.ho = ho;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.cccd = cccd;
        this.email = email;
        this.sdt = sdt;
    }

    public int getIdtaixe() {
        return idtaixe;
    }

    public void setIdtaixe(int idtaixe) {
        this.idtaixe = idtaixe;
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

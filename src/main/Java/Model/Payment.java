package Model;

public class Payment {
    private int idthanhtoan;
    private int idhopdong;
    private String NgayThanhToan;
    private int SoTienCanThanhToan;
    private String phuongthucthanhtoan;

    public Payment(int idthanhtoan, int idhopdong, String ngayThanhToan, int soTienCanThanhToan, String phuongthucthanhtoan) {
        this.idthanhtoan = idthanhtoan;
        this.idhopdong = idhopdong;
        NgayThanhToan = ngayThanhToan;
        SoTienCanThanhToan = soTienCanThanhToan;
        this.phuongthucthanhtoan = phuongthucthanhtoan;
    }

    public Payment(){}

    public int getIdthanhtoan() {
        return idthanhtoan;
    }

    public void setIdthanhtoan(int idthanhtoan) {
        this.idthanhtoan = idthanhtoan;
    }

    public int getIdhopdong() {
        return idhopdong;
    }

    public void setIdhopdong(int idhopdong) {
        this.idhopdong = idhopdong;
    }

    public String getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        NgayThanhToan = ngayThanhToan;
    }

    public int getSoTienCanThanhToan() {
        return SoTienCanThanhToan;
    }

    public void setSoTienCanThanhToan(int soTienCanThanhToan) {
        SoTienCanThanhToan = soTienCanThanhToan;
    }

    public String getPhuongthucthanhtoan() {
        return phuongthucthanhtoan;
    }

    public void setPhuongthucthanhtoan(String phuongthucthanhtoan) {
        this.phuongthucthanhtoan = phuongthucthanhtoan;
    }
}

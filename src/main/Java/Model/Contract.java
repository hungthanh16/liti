package Model;

public class Contract {
    private int idhopdong;
    private int idhocsinh;
    private String ngaytaohopdong;
    private String ngaybatdauhopdong;
    private String ngayketthuchopdong;
    private String ngaycapnhattrangthai;
    private int idtramdon;
    private int idtruong;
    private int idtrangthai;

    public Contract(){}

    public Contract(int idhopdong, int idhocsinh, String ngaytaohopdong, String ngaybatdauhopdong, String ngayketthuchopdong, String ngaycapnhattrangthai, int idtramdon, int idtruong, int idtrangthai) {
        this.idhopdong = idhopdong;
        this.idhocsinh = idhocsinh;
        this.ngaytaohopdong = ngaytaohopdong;
        this.ngaybatdauhopdong = ngaybatdauhopdong;
        this.ngayketthuchopdong = ngayketthuchopdong;
        this.ngaycapnhattrangthai = ngaycapnhattrangthai;
        this.idtramdon = idtramdon;
        this.idtruong = idtruong;
        this.idtrangthai = idtrangthai;
    }

    public int getIdhopdong() {
        return idhopdong;
    }

    public void setIdhopdong(int idhopdong) {
        this.idhopdong = idhopdong;
    }

    public int getIdhocsinh() {
        return idhocsinh;
    }

    public void setIdhocsinh(int idhocsinh) {
        this.idhocsinh = idhocsinh;
    }

    public String getNgaytaohopdong() {
        return ngaytaohopdong;
    }

    public void setNgaytaohopdong(String ngaytaohopdong) {
        this.ngaytaohopdong = ngaytaohopdong;
    }

    public String getNgaybatdauhopdong() {
        return ngaybatdauhopdong;
    }

    public void setNgaybatdauhopdong(String ngaybatdauhopdong) {
        this.ngaybatdauhopdong = ngaybatdauhopdong;
    }

    public String getNgayketthuchopdong() {
        return ngayketthuchopdong;
    }

    public void setNgayketthuchopdong(String ngayketthuchopdong) {
        this.ngayketthuchopdong = ngayketthuchopdong;
    }

    public String getNgaycapnhattrangthai() {
        return ngaycapnhattrangthai;
    }

    public void setNgaycapnhattrangthai(String ngaycapnhattrangthai) {
        this.ngaycapnhattrangthai = ngaycapnhattrangthai;
    }

    public int getIdtramdon() {
        return idtramdon;
    }

    public void setIdtramdon(int idtramdon) {
        this.idtramdon = idtramdon;
    }

    public int getIdtruong() {
        return idtruong;
    }

    public void setIdtruong(int idtruong) {
        this.idtruong = idtruong;
    }

    public int getIdtrangthai() {
        return idtrangthai;
    }

    public void setIdtrangthai(int idtrangthai) {
        this.idtrangthai = idtrangthai;
    }
}

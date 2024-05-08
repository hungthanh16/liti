package Model;

public class StudentAssignment {
    private int idphancong;
    private  int idchitiet;
    private  int idchuyen;
    private String ngayduadon;

    public StudentAssignment(){}

    public int getIdphancong() {
        return idphancong;
    }

    public void setIdphancong(int idphancong) {
        this.idphancong = idphancong;
    }

    public int getIdchitiet() {
        return idchitiet;
    }

    public void setIdchitiet(int idchitiet) {
        this.idchitiet = idchitiet;
    }

    public int getIdchuyen() {
        return idchuyen;
    }

    public void setIdchuyen(int idchuyen) {
        this.idchuyen = idchuyen;
    }

    public String getNgayduadon() {
        return ngayduadon;
    }

    public void setNgayduadon(String ngayduadon) {
        this.ngayduadon = ngayduadon;
    }
}

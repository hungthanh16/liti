package Model;

public class AttendanceTaking {
    private int iddiemdanh;
    private int idophancong;
    private String thoigian;
    private short idtinhtrangdiemdanh;

    public AttendanceTaking(){}

    public int getIddiemdanh() {
        return iddiemdanh;
    }

    public void setIddiemdanh(int iddiemdanh) {
        this.iddiemdanh = iddiemdanh;
    }

    public int getIdophancong() {
        return idophancong;
    }

    public void setIdohpancong(int idophancong) {
        this.idophancong = idophancong;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public short getIdtinhtrangdiemdanh() {
        return idtinhtrangdiemdanh;
    }

    public void setIdtinhtrangdiemdanh(short idtinhtrangdiemdanh) {
        this.idtinhtrangdiemdanh = idtinhtrangdiemdanh;
    }
}

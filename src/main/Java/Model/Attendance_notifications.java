package Model;

public class Attendance_notifications {
    private int idthongbao;
    private int iddiemdanh;

    public Attendance_notifications(int idthongbao, int iddiemdanh) {
        this.idthongbao = idthongbao;
        this.iddiemdanh = iddiemdanh;
    }

    public Attendance_notifications() {
    }

    public int getIdthongbao() {
        return idthongbao;
    }

    public void setIdthongbao(int idthongbao) {
        this.idthongbao = idthongbao;
    }

    public int getIddiemdanh() {
        return iddiemdanh;
    }

    public void setIddiemdanh(int iddiemdanh) {
        this.iddiemdanh = iddiemdanh;
    }
}

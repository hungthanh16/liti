package Model;

public class Contract_Notifications {
    private int idthongbao;
    private int idhopdong;

    public Contract_Notifications() {
    }

    public int getIdthongbao() {
        return idthongbao;
    }

    public void setIdthongbao(int idthongbao) {
        this.idthongbao = idthongbao;
    }

    public int getIdhopdong() {
        return idhopdong;
    }

    public void setIdhopdong(int idhopdong) {
        this.idhopdong = idhopdong;
    }

    public Contract_Notifications(int idthongbao, int idhopdong) {
        this.idthongbao = idthongbao;
        this.idhopdong = idhopdong;
    }
}

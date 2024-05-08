package Model;

public class Notification {
    private int idthongbao;
    private String tenthongbao;
    private int idloaithongbao;

    public Notification() {
    }

    public Notification(int idthongbao, String tenthongbao, int idloaithongbao) {
        this.idthongbao = idthongbao;
        this.tenthongbao = tenthongbao;
        this.idloaithongbao = idloaithongbao;
    }

    public int getIdthongbao() {
        return idthongbao;
    }

    public void setIdthongbao(int idthongbao) {
        this.idthongbao = idthongbao;
    }

    public String getTenthongbao() {
        return tenthongbao;
    }

    public void setTenthongbao(String tenthongbao) {
        this.tenthongbao = tenthongbao;
    }

    public int getIdloaithongbao() {
        return idloaithongbao;
    }

    public void setIdloaithongbao(int idloaithongbao) {
        this.idloaithongbao = idloaithongbao;
    }
}

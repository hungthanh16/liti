package Model;

public class DetailsContract {
    private int idchitiet;
    private int thutrongtuan;
    private String buoi;
    private int idhopdong;

    public DetailsContract(){
    }

    public DetailsContract(int idchitiet, int thutrongtuan, String buoi, int idhopdong) {
        this.idchitiet = idchitiet;
        this.thutrongtuan = thutrongtuan;
        this.buoi = buoi;
        this.idhopdong = idhopdong;
    }

    public int getIdchitiet() {
        return idchitiet;
    }

    public void setIdchitiet(int idchitiet) {
        this.idchitiet = idchitiet;
    }

    public int getThutrongtuan() {
        return thutrongtuan;
    }

    public void setThutrongtuan(int thutrongtuan) {
        this.thutrongtuan = thutrongtuan;
    }

    public String getBuoi() {
        return buoi;
    }

    public void setBuoi(String buoi) {
        this.buoi = buoi;
    }

    public int getIdhopdong() {
        return idhopdong;
    }

    public void setIdhopdong(int idhopdong) {
        this.idhopdong = idhopdong;
    }
}

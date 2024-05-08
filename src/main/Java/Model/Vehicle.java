package Model;

public class Vehicle {
    private int idee;
    private String BienSoXe;
    private short SoGhe;

    public Vehicle(){}

    public int getIdee() {
        return idee;
    }

    public void setIdee(int idee) {
        this.idee = idee;
    }

    public String getBienSoXe() {
        return BienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        BienSoXe = bienSoXe;
    }

    public short getSoGhe() {
        return SoGhe;
    }

    public void setSoGhe(short soGhe) {
        SoGhe = soGhe;
    }
}

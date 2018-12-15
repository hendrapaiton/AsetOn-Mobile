package id.web.aseton.mobile.Model;

import com.google.gson.annotations.SerializedName;

public class Barang {

    @SerializedName("idBarang")
    private Long idBarang;
    @SerializedName("kodeBarang")
    private String kodeBarang;
    @SerializedName("namaBarang")
    private String namaBarang;

    public Barang() {}

    public Barang(Long idBarang, String kodeBarang, String namaBarang) {
        this.idBarang = idBarang;
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }

    public Long getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(Long idBarang) {
        this.idBarang = idBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

}

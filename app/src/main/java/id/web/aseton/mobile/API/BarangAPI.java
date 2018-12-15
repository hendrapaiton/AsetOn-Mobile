package id.web.aseton.mobile.API;

import id.web.aseton.mobile.Model.Barang;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BarangAPI {

    @GET("/api/barang/{id}")
    public Call<Barang> cekBarang(@Path("id") long id);

    @GET("/api/barang/")
    public Call<Barang> ambilBarang();

}

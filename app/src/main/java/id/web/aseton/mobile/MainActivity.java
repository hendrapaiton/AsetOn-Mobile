package id.web.aseton.mobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import id.web.aseton.mobile.Model.Barang;
import id.web.aseton.mobile.Service.BarangService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);

        BarangService.getInstance()
                .barangAPI()
                .cekBarang((long) 1)
                .enqueue(new Callback<Barang>() {
                    @Override
                    public void onResponse(Call<Barang> call, Response<Barang> response) {
                        Barang barang = response.body();
                        textView.append(barang.getKodeBarang() + ", " + barang.getNamaBarang());
                    }
                    @Override
                    public void onFailure(Call<Barang> call, Throwable t) {
                        textView.append("Error occured while getting request");
                        t.printStackTrace();
                    }
                });

    }
}

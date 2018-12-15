package id.web.aseton.mobile.Service;

import id.web.aseton.mobile.API.BarangAPI;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BarangService {

    private static BarangService mInstance;
    private static final String BASE_URL = "https://aseton.herokuapp.com/";
    private Retrofit mRetrofit;

    public BarangService() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder client = new OkHttpClient.Builder()
                .addInterceptor(interceptor);

        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client.build())
                .build();
    }

    public static BarangService getInstance() {
        if (mInstance == null) {
            mInstance = new BarangService();
        }
        return mInstance;
    }

    public BarangAPI barangAPI() {
        return mRetrofit.create(BarangAPI.class);
    }

}

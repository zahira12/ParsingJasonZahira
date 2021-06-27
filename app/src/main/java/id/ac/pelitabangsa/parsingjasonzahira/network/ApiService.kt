package id.ac.pelitabangsa.parsingjasonzahira.network

import id.ac.pelitabangsa.parsingjasonzahira.model.ResponseUser
import okhttp3.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    //Menampilkan user dengan query
    @GET("api/users")
    fun getListUsers(@Query("page")page: String): retrofit2.Call<ResponseUser>

}
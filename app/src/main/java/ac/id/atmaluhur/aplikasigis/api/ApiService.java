package ac.id.atmaluhur.aplikasigis.api;

import ac.id.atmaluhur.aplikasigis.model.ListLocationModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("JsonDisplayMarker.php")
    Call<ListLocationModel> getAllLocation();
}

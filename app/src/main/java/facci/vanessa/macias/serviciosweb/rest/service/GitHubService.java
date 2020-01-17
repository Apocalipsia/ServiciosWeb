package facci.vanessa.macias.serviciosweb.rest.service;

import java.util.List;

import facci.vanessa.macias.serviciosweb.rest.contants.ApiConstants;
import facci.vanessa.macias.serviciosweb.rest.model.Owner;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {

    @GET(ApiConstants.GITHUB_USER_ENDPOINT)
    Call<Owner> getOwner(@Path("owner") String owner);

    @GET(ApiConstants.GITHUB_FOLLOWERS_ENDPOINT)
    Call<List<Owner>> getOwnerFollowers(@Path("owner") String owner);

}

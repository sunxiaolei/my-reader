package sunxl8.my_reader.net.maoyanmovie;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;
import sunxl8.my_reader.net.maoyanmovie.dto.CommentListDto;
import sunxl8.my_reader.net.maoyanmovie.dto.MainListDto;
import sunxl8.my_reader.net.maoyanmovie.dto.MovieDetailDto;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public interface MaoyanMovieApi {

    @GET("movie/list.json")
    Observable<MainListDto> getMainList(@QueryMap Map<String, String> params);

    @GET("movie/{id}.json")
    Observable<MovieDetailDto> getMovieDetail(@Path("id") int id);

    @GET("comments.json?movieid=246363&limit=5&offset=5")
    Observable<CommentListDto> getCommentList(@QueryMap Map<String,String> params);

}

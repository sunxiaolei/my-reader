package sunxl8.my_reader.net.doubanmoment;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
import sunxl8.my_reader.net.doubanmoment.dto.ColumnPostDto;
import sunxl8.my_reader.net.doubanmoment.dto.ColumnsDto;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public interface DoubanMomentApi {

    /**
     * 栏目总览
     *
     * @return
     */
    @GET("columns")
    Observable<ColumnsDto> getColumns();

    @GET("column/{columnId}/posts")
    Observable<ColumnPostDto> getColumnPost(@Path("columnId") int id, @Query("count") int count);
}

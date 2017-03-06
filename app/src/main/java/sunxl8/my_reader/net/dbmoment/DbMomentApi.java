package sunxl8.my_reader.net.dbmoment;

import retrofit2.http.GET;
import rx.Observable;
import sunxl8.my_reader.net.dbmoment.dto.ColumnsDto;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public interface DbMomentApi {

    @GET("columns")
    Observable<ColumnsDto> getColumns();
}

package sunxl8.my_reader.net.dbmoment;

import rx.Observable;
import sunxl8.my_reader.net.NetworkConstant;
import sunxl8.my_reader.net.NetworkManager;
import sunxl8.my_reader.net.SchedulersCompat;
import sunxl8.my_reader.net.dbmoment.dto.ColumnPostDto;
import sunxl8.my_reader.net.dbmoment.dto.ColumnsDto;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class DbMomentRequest {

    public static Observable<ColumnsDto> getColumns() {
        return NetworkManager.getCommonClient(NetworkConstant.HOST_DB_MOMENT)
                .create(DbMomentApi.class)
                .getColumns()
                .compose(SchedulersCompat.applyIoSchedulers());
    }

    public static Observable<ColumnPostDto> getColumnPost(int id, int count) {
        return NetworkManager.getCommonClient(NetworkConstant.HOST_DB_MOMENT)
                .create(DbMomentApi.class)
                .getColumnPost(id, count)
                .compose(SchedulersCompat.applyIoSchedulers());
    }
}

package sunxl8.my_reader.net.doubanmoment;

import rx.Observable;
import sunxl8.my_reader.net.NetworkConstant;
import sunxl8.my_reader.net.NetworkManager;
import sunxl8.my_reader.net.SchedulersCompat;
import sunxl8.my_reader.net.doubanmoment.dto.ColumnPostDto;
import sunxl8.my_reader.net.doubanmoment.dto.ColumnsDto;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class DoubanMomentRequest {

    public static Observable<ColumnsDto> getColumns() {
        return NetworkManager.getCommonClient(NetworkConstant.HOST_DOUBAN_MOMENT)
                .create(DoubanMomentApi.class)
                .getColumns()
                .compose(SchedulersCompat.applyIoSchedulers());
    }

    public static Observable<ColumnPostDto> getColumnPost(int id, int count) {
        return NetworkManager.getCommonClient(NetworkConstant.HOST_DOUBAN_MOMENT)
                .create(DoubanMomentApi.class)
                .getColumnPost(id, count)
                .compose(SchedulersCompat.applyIoSchedulers());
    }
}

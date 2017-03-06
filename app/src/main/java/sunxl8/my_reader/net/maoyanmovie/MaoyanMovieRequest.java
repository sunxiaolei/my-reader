package sunxl8.my_reader.net.maoyanmovie;

import java.util.Map;

import rx.Observable;
import sunxl8.my_reader.net.NetworkConstant;
import sunxl8.my_reader.net.NetworkManager;
import sunxl8.my_reader.net.SchedulersCompat;
import sunxl8.my_reader.net.maoyanmovie.dto.MainListDto;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class MaoyanMovieRequest {

    public static Observable<MainListDto> getMainList(Map<String, String> params) {
        return NetworkManager.getCommonClient(NetworkConstant.HOST_MAOYAN_MOVIE)
                .create(MaoyanMovieApi.class)
                .getMainList(params)
                .compose(SchedulersCompat.applyIoSchedulers());
    }
}

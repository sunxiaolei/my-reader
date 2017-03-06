package sunxl8.my_reader.ui.maoyan.main;

import java.util.Map;

import sunxl8.my_reader.base.IPresenter;
import sunxl8.my_reader.base.IView;
import sunxl8.my_reader.net.maoyanmovie.dto.MainListDto;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public interface MaoyanMovieContract {

    interface View extends IView {
        void setMainList(MainListDto dto);
    }

    interface Presenter extends IPresenter<View> {
        void getMainList(Map<String,String> params);
    }
}

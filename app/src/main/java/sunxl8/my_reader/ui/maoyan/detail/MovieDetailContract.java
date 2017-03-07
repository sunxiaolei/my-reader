package sunxl8.my_reader.ui.maoyan.detail;

import sunxl8.my_reader.base.IPresenter;
import sunxl8.my_reader.base.IView;
import sunxl8.my_reader.net.maoyanmovie.dto.MovieDetailDto;

/**
 * Created by sunxl8 on 2017/3/7.
 */

public interface MovieDetailContract {

    interface View extends IView {
        void setMovieDetail(MovieDetailDto dto);
    }

    interface Presenter extends IPresenter<View> {
        void getMovieDetail(int id);
    }
}

package sunxl8.my_reader.ui.dbmoment.columns;

import sunxl8.my_reader.base.IPresenter;
import sunxl8.my_reader.base.IView;
import sunxl8.my_reader.net.doubanmoment.dto.ColumnPostDto;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public interface ColumnPostContract {

    interface View extends IView {
        void setColumnPost(ColumnPostDto dto);
    }

    interface Presenter extends IPresenter<View> {
        void getColumnPost(int id);
    }
}

package sunxl8.my_reader.ui.dbmoment.main;

import sunxl8.my_reader.base.IPresenter;
import sunxl8.my_reader.base.IView;
import sunxl8.my_reader.net.doubanmoment.dto.ColumnsDto;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public interface DbMomentContract {

    interface View extends IView {
        void setColumns(ColumnsDto columns);
    }

    interface Presenter extends IPresenter<View> {
        void getColumns();
    }
}

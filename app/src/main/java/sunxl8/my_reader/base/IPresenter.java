package sunxl8.my_reader.base;

/**
 * Created by sunxl8 on 2017/2/10.
 */

public interface IPresenter<T extends IView> {
    void attachView(T view);
    void detachView();
}

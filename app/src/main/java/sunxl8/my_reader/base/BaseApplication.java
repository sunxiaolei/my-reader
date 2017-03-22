package sunxl8.my_reader.base;

import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import com.tencent.bugly.Bugly;
import com.tencent.bugly.crashreport.CrashReport;

import sunxl8.myutils.Utils;

/**
 * Created by sunxl8 on 2016/12/21.
 */

public class BaseApplication extends Application {

    private static Context mContext;

    public static String account;

    public static final boolean ENCRYPTED = true;

//    public DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        Bugly.init(getApplicationContext(), "6894b38956", false);
        Utils.init(this);
        Logger.init("my-reader")
                .methodCount(3)
                .hideThreadInfo()
                .logLevel(LogLevel.FULL)
                .methodOffset(2);
        Fresco.initialize(this);
        initActivityLifecycle();
        initDataBase();
    }

    public static Context getContext() {
        return mContext;
    }

    private void initActivityLifecycle() {
        BaseActivityLifecycleCallbacks callbacks = new BaseActivityLifecycleCallbacks();
        this.registerActivityLifecycleCallbacks(callbacks);
        callbacks.setCallback(new BaseActivityLifecycleCallbacks.Callback() {
            @Override
            public void backToForeground() {

            }

            @Override
            public void foreToBackground() {

            }
        });
    }

    private void initDataBase() {
//        File path = new File(Environment.getExternalStorageDirectory(), "/MyReader/DataBase/" + "mr.db");
//        path.getParentFile().mkdirs();
//        GreenDaoOpenHelper helper = null;
//        if (path.getParentFile().exists()) {
//            helper = new GreenDaoOpenHelper(this, path.getAbsolutePath(), null);
//        } else {
//            helper = new GreenDaoOpenHelper(this, "yd-db", null);
//        }
//        DaoMaster daoMaster = new DaoMaster(helper.getWritableDatabase());
//        daoSession = daoMaster.newSession();
//        DbManager.init(this);
    }

//    public DaoSession getDaoSession() {
//        return daoSession;
//    }
}

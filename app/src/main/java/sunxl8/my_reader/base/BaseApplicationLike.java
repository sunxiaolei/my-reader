package sunxl8.my_reader.base;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.multidex.MultiDex;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.tinker.loader.app.DefaultApplicationLike;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

import sunxl8.myutils.Utils;

/**
 * Created by sunxl8 on 2016/12/21.
 */

public class BaseApplicationLike extends DefaultApplicationLike {

    private static Context mContext;

    public static String account;

    public static final boolean ENCRYPTED = true;

    public BaseApplicationLike(Application application, int tinkerFlags,
                               boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime,
                               long applicationStartMillisTime, Intent tinkerResultIntent) {
        super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent);
    }

//    public DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplication();
        Bugly.init(getApplication(), "6894b38956", true);
        Utils.init(getApplication());
        Logger.init("my-reader")
                .methodCount(3)
                .hideThreadInfo()
                .logLevel(LogLevel.FULL)
                .methodOffset(2);
        Fresco.initialize(getApplication());
        initActivityLifecycle();
        initDataBase();
    }

    public static Context getContext() {
        return mContext;
    }

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    public void onBaseContextAttached(Context base) {
        super.onBaseContextAttached(base);
        // you must install multiDex whatever tinker is installed!
        MultiDex.install(base);
        // 安装tinker
        // TinkerManager.installTinker(this); 替换成下面Bugly提供的方法
        Beta.installTinker(this);
    }

    private void initActivityLifecycle() {
        BaseActivityLifecycleCallbacks callbacks = new BaseActivityLifecycleCallbacks();
        getApplication().registerActivityLifecycleCallbacks(callbacks);
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

package sunxl8.my_reader.utils;

import android.content.Context;
import android.os.Environment;

import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;

import java.io.File;

/**
 * Created by sunxl8 on 2017/3/14.
 */

public class MyGlideModule extends OkHttpGlideModule {

    int diskSize = 1024 * 1024 * 100;

    @Override
    public void applyOptions(final Context context, GlideBuilder builder) {
        MemorySizeCalculator memorySizeCalculator = new MemorySizeCalculator(context);
        builder.setDiskCache(() -> {
            File cacheLocation = new File(Environment.getExternalStorageDirectory() + "/MyReader/Cache");
            cacheLocation.getParentFile().mkdir();
            return DiskLruCacheWrapper.get(cacheLocation, diskSize);
        });
        builder.setMemoryCache(new LruResourceCache((int) (1.2 * memorySizeCalculator.getMemoryCacheSize())));
        builder.setBitmapPool(new LruBitmapPool((int) (1.2 * memorySizeCalculator.getBitmapPoolSize())));
        builder.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888);
    }

}

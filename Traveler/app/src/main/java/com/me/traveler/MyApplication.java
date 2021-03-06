package com.me.traveler;

import android.app.Application;
import android.os.Environment;

import com.facebook.stetho.Stetho;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;

import java.io.File;

/**
 * Created by Administrator on 2016/2/26.
 */
public class MyApplication extends Application {

    private static MyApplication app;
    private ImageLoader mImageLoader;
    private DisplayImageOptions mOptions;

    private static final int CACHE_SIZE = 200*200*1024;
    private static final int CACHE_FILE_COUNt = 300;

    @Override
    public void onCreate(){
        super.onCreate();

        app = this;
        Stetho.initializeWithDefaults(this);
        initImageLoader();
    }

    public static MyApplication getApp(){
        return app;
    }

    /**
     * 初始化 ImageLoader
     */
    private void initImageLoader() {
        mImageLoader = ImageLoader.getInstance();
        // 用于缓存的内存大小
        int cacheSize = (int) Runtime.getRuntime().maxMemory() / 8;

        // 缓存路径
        String cachePath = null;

        // 判断存储卡的状态
        if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){

            cachePath = getApplicationContext().getExternalCacheDir().getPath();

        }else {

            cachePath = getApplicationContext().getCacheDir().getPath();

        }

        // 用存储缓存图片的文件夹
        File cacheFileDir = new File(cachePath,"/traveler/images");

        cacheFileDir.mkdirs();

        // 配置UniversalImageLoader
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration
                .Builder(getApplicationContext())
                .memoryCacheSize(cacheSize)
                .diskCache(new UnlimitedDiskCache(cacheFileDir))
                .diskCacheSize(CACHE_SIZE)
                .diskCacheFileCount(CACHE_FILE_COUNt)
                .build();

        // 初始化 配置 ImageLoader
        ImageLoader.getInstance().init(configuration);

        mOptions = new DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .imageScaleType(ImageScaleType.IN_SAMPLE_POWER_OF_2)
                .showImageOnLoading(R.mipmap.no_picture)
                .showImageOnFail(R.mipmap.no_picture)
                .showImageForEmptyUri(R.mipmap.head)
                .build();
    }

    public ImageLoader getmImageLoader(){
        return this.mImageLoader;
    }
    public DisplayImageOptions getmOptions(){
        return this.mOptions;
    }
}

package com.gudong.appkit;

import com.gudong.appkit.utils.logger.LogLevel;
import com.gudong.appkit.utils.logger.Logger;

/**
 * Created by mao on 8/16/15.
 */
public class ReleaseApp extends App {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.init("AppPlusLog").setLogLevel(LogLevel.NONE);
    }
}

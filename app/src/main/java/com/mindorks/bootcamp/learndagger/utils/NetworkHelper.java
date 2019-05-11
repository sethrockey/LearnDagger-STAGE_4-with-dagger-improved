package com.mindorks.bootcamp.learndagger.utils;

import android.content.Context;

import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Provides;

@Singleton
public class NetworkHelper {
    private Context context;

    @Inject
    public NetworkHelper(@ApplicationContext Context context) {
        this.context = context;
    }

    public boolean isNetworkConnected(){
        return false;

    }
}

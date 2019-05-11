package com.mindorks.bootcamp.learndagger.di.module;

import com.mindorks.bootcamp.learndagger.di.qualifier.FragmentContext;
import com.mindorks.bootcamp.learndagger.ui.HomeFragment;

import dagger.Module;
import dagger.Provides;
@Module
public class FragmentModule {
    private HomeFragment fragment;

    public FragmentModule(HomeFragment fragment) {
        this.fragment = fragment;
    }
}

package com.outerspace.daggermuffin.module;

import com.outerspace.daggermuffin.model.Muffin;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MuffinModule {

    @Provides @Singleton
    Muffin provideMuffinPojo() {
        Muffin muffin = new Muffin();
        muffin.muffinFlavor = "no flavor";
        return muffin;
    }

}

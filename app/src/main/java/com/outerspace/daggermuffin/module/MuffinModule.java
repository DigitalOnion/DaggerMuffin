package com.outerspace.daggermuffin.module;

import com.outerspace.daggermuffin.model.MuffinPojo;
import com.outerspace.daggermuffin.model.MuffinPojo_Factory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MuffinModule {

    @Provides @Singleton
    MuffinPojo provideMuffinPojo() {
        MuffinPojo muffin = new MuffinPojo();
        muffin.muffinFlavor = "no flavor";
        return muffin;
    }

}

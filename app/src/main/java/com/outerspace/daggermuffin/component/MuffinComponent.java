package com.outerspace.daggermuffin.component;

import com.outerspace.daggermuffin.MainActivity;
import com.outerspace.daggermuffin.SecondActivity;
import com.outerspace.daggermuffin.model.MuffinPojo;
import com.outerspace.daggermuffin.module.MuffinModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MuffinModule.class})
public interface MuffinComponent {

    public MuffinPojo provideMuffinPojo();

    public void inject(MainActivity mainActivity);
    public void inject(SecondActivity secondActivity);

}

package com.outerspace.daggermuffin.model;

import javax.inject.Inject;

public class MuffinWithTopping extends Muffin {

    @Inject
    public MuffinWithTopping() {}

    public String muffinTopping;
}

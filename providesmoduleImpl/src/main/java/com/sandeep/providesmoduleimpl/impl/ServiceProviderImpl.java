package com.sandeep.providesmoduleimpl.impl;

import com.sandeep.providesmodule.ServiceProviderInterface;

public class ServiceProviderImpl implements ServiceProviderInterface {
    @Override
    public void printServiceName() {
        System.out.println("Provider 1 implementation");
    }
}

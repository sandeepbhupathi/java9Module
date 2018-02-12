module com.sandeep.providesmoduleimpl.impl {
    requires com.sandeep.providesmodule;
    provides com.sandeep.providesmodule.ServiceProviderInterface with com.sandeep.providesmoduleimpl.impl.ServiceProviderImpl;
}
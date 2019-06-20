package com.alibaba.dubbo.registry;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class RegistryFactory$Adaptive implements RegistryFactory {
    public Registry getRegistry(com.alibaba.dubbo.common.URL arg0) {
        if (arg0 == null) throw new IllegalArgumentException("url == null");
        com.alibaba.dubbo.common.URL url = arg0;
        String extName = ( url.getProtocol() == null ? "dubbo" : url.getProtocol() );
        if(extName == null) throw new IllegalStateException("Fail to get extension(com.alibaba.dubbo.registry.RegistryFactory) name from url(" + url.toString() + ") use keys([protocol])");
        RegistryFactory extension = (RegistryFactory)ExtensionLoader.getExtensionLoader(RegistryFactory.class).getExtension(extName);
        return extension.getRegistry(arg0);
    }
}
package ai.yunxi.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * TODO
 *
 * @author:Five-云析学院
 * @since:2019年05月27日 22:24
 */
public class Demo {
    public static void main(String[] args) {
        ExtensionLoader<Filter> extensionLoader = ExtensionLoader.getExtensionLoader(Filter.class);
        Filter url = extensionLoader.getExtension("method");
        url.invoke();
    }
}

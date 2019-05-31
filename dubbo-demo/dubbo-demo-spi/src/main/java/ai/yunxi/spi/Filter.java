package ai.yunxi.spi;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("method")
public interface Filter {
    public void invoke();
}

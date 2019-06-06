package ai.yunxi.spi;

/**
 * TODO
 *
 * @author:Five-云析学院
 * @since:2019年05月17日 16:22
 */
public class MethodFilter implements Filter {

    public void setFilter(Filter filter){
        System.out.println("set Filter");
    }

    public void invoke() {
        System.out.println("is Method Filter.");
    }
}

/**
* 趋势投资 SpringCloud 教程 为 how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

package cn.how2j.trend.util;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
 
@Component
public class SpringContextUtil implements ApplicationContextAware {
     
    private SpringContextUtil() {
         System.out.println("SpringContextUtil()");
    }
     
    private static ApplicationContext applicationContext;
     
    @Override
    public void setApplicationContext(ApplicationContext applicationContext){
    	System.out.println("applicationContext:"+applicationContext);
        SpringContextUtil.applicationContext = applicationContext;
    }
     
    public static <T> T getBean(Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }
 
}
/**
* 趋势投资 SpringCloud 教程 为 how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

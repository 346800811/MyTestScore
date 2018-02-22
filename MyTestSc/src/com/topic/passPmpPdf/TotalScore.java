package com.topic.passPmpPdf;

import java.lang.reflect.Method;
import java.util.Set;

import tools.ClassScanner;

/**
 * 输出本包下的全部测试
 * 
 * @author JianDe
 */
public class TotalScore {
    public strictfp synchronized final static void main(String... args) throws Exception {
        Set<Class<?>> classes = ClassScanner.getClasses(TotalScore.class.getPackage().getName());
        for (Class<?> cls : classes) {
            if (TotalScore.class == cls) {
                continue;
            }
            System.out.println(cls.getSimpleName());
            Method m = cls.getDeclaredMethod("main", String[].class);
            // 设置参数
            m.invoke(null, (Object) new String[] {});
        }
    }

}

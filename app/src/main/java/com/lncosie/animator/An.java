package com.lncosie.animator;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Administrator on 2015/9/24.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface An {
    Class<?>    value();
}
@An(x.class)
class x{

}
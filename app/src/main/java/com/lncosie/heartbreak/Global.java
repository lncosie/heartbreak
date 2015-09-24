package com.lncosie.heartbreak;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by Administrator on 2015/9/18.
 */
public class Global {
    static Bus bus;

    public static Bus bus(){
        if(bus==null)
            bus=new Bus(ThreadEnforcer.MAIN);
        return bus;
    }
}

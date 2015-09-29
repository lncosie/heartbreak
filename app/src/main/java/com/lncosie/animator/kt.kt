package com.lncosie.animator

import android.app.Activity
import android.app.Fragment
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlin.properties.Delegates

class DataRri{
    lateinit val title:String;
}

class MV{

    Bind(1,"text",DataRri::class)
    fun bind(){

    }
    fun bind(id:Int,property:String,provider:Any,uri:String?)
    {
        val target:View?=null
        val value:java.lang.reflect.Field?=null;
        val t:TextView;
//        t.handler
//        provider.onFire(uri,uri=value)
//        target.set(uri)
//        target.onSet(value=provider.update(uri,data,key?))
    }
}


fun Fragment.findViewById(id:Int):View{
    return this.activity.findViewById(id)
}

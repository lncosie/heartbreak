package com.lncosie.animator

import kotlin.reflect.KClass

annotation class BindItem(val layout:Int,val value: KClass<*>)
annotation class Bind(val layout:Int,val property:String,val value: KClass<*>)
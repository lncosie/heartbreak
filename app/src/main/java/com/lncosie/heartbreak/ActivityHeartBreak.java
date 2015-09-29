package com.lncosie.heartbreak;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;

import java.util.stream.*;

public class ActivityHeartBreak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_break);
        String name=getIntent().getStringExtra("fragment");
        Fragment    fragment=null;

        if(name==null)
        {
            fragment=new ActivityHeartBreakFragment();
            getFragmentManager().beginTransaction().add(R.id.fragment,fragment).commit();
            return;
        }
        Class  aClass = null;
        try {
            aClass = Class.forName(name);
            fragment= (Fragment) aClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }finally {

        }
        getFragmentManager().beginTransaction().add(R.id.fragment,fragment).commit();
    }
    void useGuagua()
    {
        Multimap<Long,Long> multimap=LinkedListMultimap.create();
    }

}

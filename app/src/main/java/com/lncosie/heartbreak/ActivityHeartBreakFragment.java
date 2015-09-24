package com.lncosie.heartbreak;


import android.content.Intent;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageButton;
import android.widget.Toolbar;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;


/**
 * A placeholder fragment containing a simple view.
 */
@EFragment(R.layout.fragment_heart_break)
public class ActivityHeartBreakFragment extends Fragment {

    @ViewById(R.id.toolbar_system)
    Toolbar toolbar;
    @ViewById(R.id.share_key)
    ImageButton share_key;
    @ItemClick(R.id.action_settings)
    void share_key(View v)
    {
        Intent intent=new Intent(this.getActivity(),ActivityHeartBreak.class);
        intent.putExtra("fragment",FragmentSetting.class.getName());
        this.startActivity(intent);
    }
    public ActivityHeartBreakFragment() {
    }
    @AfterInject
    void init()
    {
        toolbar.inflateMenu(R.menu.menu_activity_heart_break);
        toolbar.setLogo(getResources().getDrawable(R.drawable.abc_ic_voice_search_api_mtrl_alpha));
        toolbar.setTitle(R.string.action_settings);
    }


}

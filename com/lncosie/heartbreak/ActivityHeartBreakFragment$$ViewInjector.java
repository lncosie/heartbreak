// Generated code from Butter Knife. Do not modify!
package com.lncosie.heartbreak;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class ActivityHeartBreakFragment$$ViewInjector<T extends com.lncosie.heartbreak.ActivityHeartBreakFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492970, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131492970, "field 'toolbar'");
  }

  @Override public void reset(T target) {
    target.toolbar = null;
  }
}

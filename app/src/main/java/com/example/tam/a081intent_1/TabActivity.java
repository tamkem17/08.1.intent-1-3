package com.example.tam.a081intent_1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;

/**
 * Created by tam on 7/24/2017.
 */

public class TabActivity extends android.app.TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Resources resources = getResources();
        TabHost host = getTabHost();

        //Tab 1
        Intent intent1 = new Intent(this, SumActivity.class);
        Drawable tabIcon = resources.getDrawable(R.drawable.caculate);
        TabHost.TabSpec tab1Spec = host.newTabSpec("Tab One")
                .setIndicator("tab one", tabIcon)
                .setContent(intent1);
        host.addTab(tab1Spec);

        //Tab 2
        Intent intent2 = new Intent(this, SumActivity.class);
        Bundle Bundle1 = MainActivity.IntegerBundle.randomInteger();
        intent2.putExtras(Bundle1);
        Drawable tabIcon2 = resources.getDrawable(R.drawable.caculate);
        TabHost.TabSpec tab2Spec = host.newTabSpec("Tab tow")
                .setIndicator("tab two", tabIcon2)
                .setContent(intent2);
        host.addTab(tab2Spec);

        //Tab 3
        Uri uri = Uri.parse("sum://example.com/add");
        Intent intent3 = new Intent(Intent.ACTION_VIEW, uri);
        Drawable tabIcon3 = resources.getDrawable(R.drawable.caculate);
        TabHost.TabSpec tab3Spec = host.newTabSpec("Tab three")
                .setIndicator("tab three", tabIcon3)
                .setContent(intent3);
        host.addTab(tab3Spec);

        //Tab 4
        Uri uriTwentyYear = Uri.parse("loan://coreservlets.com/calc");
        Intent intent4 = new Intent(Intent.ACTION_VIEW, uriTwentyYear);
        Bundle Bundle4 = MainActivity.IntegerBundle.randomInteger();
        intent2.putExtras(Bundle4);
        tabIcon = resources.getDrawable(R.drawable.caculate);
        TabHost.TabSpec tab4Spec = host.newTabSpec("Tab four")
                .setIndicator("tab four", tabIcon)
                .setContent(intent2);
        host.addTab(tab4Spec);

    }
}

package com.Kuesty.activities;

import com.Kuesty.R;
import com.Kuesty.fragments.LeftMenuFragment;
import com.Kuesty.fragments.RightMenuFragment;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends SlidingFragmentActivity {

    private SherlockFragment mFrag;
    public static SlidingMenu sm;
    private SherlockFragment mFrag2, projectListFrag;

    private static MainActivity _instance;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Android.support.v7.app.ActionBar actionBar =getSupportActionBar()

        //ActionBar actionBar = getSupportActionBar();
        //actionBar.setTitle(R.string.kuesty);
        //actionBar.setDisplayHomeAsUpEnabled(true);
        //actionBar.setIcon(R.drawable.icon_small);

        sm = getSlidingMenu();
        sm.setMode(SlidingMenu.LEFT_RIGHT);
        sm.setShadowWidthRes(R.dimen.shadow_width);
        sm.setShadowDrawable(R.drawable.shadow);
        sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        sm.setFadeDegree(0.35f);
        sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

        _instance = this;

        setSlidingActionBarEnabled(false);

        setContentView(R.layout.activity_main);

        setBehindContentView(R.layout.leftmenu_frame);

        if (savedInstanceState == null) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.leftmenu_frame, new LeftMenuFragment())
                    .commit();

            getSlidingMenu().setSecondaryMenu(R.layout.rightmenu_frame);
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.rightmenu_frame, new RightMenuFragment())
                    .commit();



        } else {
            mFrag = (SherlockFragment) getSupportFragmentManager().findFragmentById(R.id.leftmenu_frame);
            mFrag2 = (SherlockFragment) getSupportFragmentManager().findFragmentById(R.id.rightmenu_frame);
            // projectListFrag = (SherlockFragment) getSupportFragmentManager().findFragmentById(R.id.projectlist_frame);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getSupportMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.notification:
                Log.i("notification pressed", "yeap");
                return true;
            case android.R.id.home:
                toggle();
                return true;
        }
        return super.onOptionsItemSelected(item);

    }
}

package com.Kuesty.activities;

import com.Kuesty.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

public class SplashActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_splash);
		
		ImageView imageSplash = (ImageView) findViewById(R.id.imageSplash);
		int pos = (int)(Math.random()*9) +1;
		Log.i("random pos", String.valueOf(pos));
		switch(pos) {

			default: imageSplash.setImageResource(R.drawable.splashbakcground); break;
		}
		
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				initApp();
			}
		}, 3500);
		
	}
	
	private void initApp() {
		Intent intent = new Intent(SplashActivity.this, MainActivity.class);
		startActivity(intent);
		SplashActivity.this.finish();
	}
}

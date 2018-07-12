package com.example.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d("MainActivity","James add in MainActivity.onClick .It's before button");
		Button forceOffline = (Button) findViewById(R.id.force_offline);
		forceOffline.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent("com.example.broadcastbestpractice.FORCE_OFFLINE ");
				Log.d("MainActivity","James add in MainActivity.onClick .It's shows FORCE_OFFLINE");
				sendBroadcast(intent);
				Log.d("MainActivity","James add in MainActivity.onClick .It's after send FORCE_OFFLINE");
			}
		});
	}
}
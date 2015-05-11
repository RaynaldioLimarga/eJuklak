package com.unpar.e_juklak;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class HomeActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		Button read = (Button) findViewById(R.id.button1);
		Button settings = (Button) findViewById(R.id.button2);
		Button aboutUs = (Button) findViewById(R.id.button3);
		Button exit = (Button) findViewById(R.id.button4);
		aboutUs.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent aboutUs = new Intent(HomeActivity.this, AboutUs.class);
				startActivity(aboutUs);
				
			}
		});
		settings.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent settings = new Intent(HomeActivity.this, Settings.class);
				startActivity(settings);
				
			}
		});
		exit.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				finish();
	            System.exit(0);				
			}
			
		});
		read.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),WebviewActivity.class);
				startActivityForResult(intent,0);
				
			}
			
		});
		
	}

}

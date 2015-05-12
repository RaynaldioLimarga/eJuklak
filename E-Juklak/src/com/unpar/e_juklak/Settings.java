package com.unpar.e_juklak;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;

public class Settings extends Activity {
	Switch switchNight;
	Spinner spinner;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		addItem();
	}
	
	public void addItem(){
		spinner = (Spinner) findViewById(R.id.spinnerSize);
		List<String> list = new ArrayList<String>();
		list.add("Small");
		list.add("Medium");
		list.add("Big");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(dataAdapter);
		spinner.setSelection(Persistence.fontSize);
		switchNight = (Switch) findViewById(R.id.switchNight);
		switchNight.setChecked(Persistence.nightMode);
		Button save = (Button)findViewById(R.id.buttonSave);
		save.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Persistence.nightMode = switchNight.isChecked();
				Persistence.fontSize = spinner.getSelectedItemPosition();
				finish();
			}
		});
		
	}
	
}

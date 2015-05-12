package com.unpar.e_juklak;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Settings extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		addItem();
	}
	Spinner spinner;
	public void addItem(){
		System.out.println("kacau");
		spinner = (Spinner) findViewById(R.id.spinnerFont);
		List<String> list = new ArrayList<String>();
		System.out.println("kecil");
		list.add("Small");
		list.add("Medium");
		list.add("Big");
		System.out.println("besar");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(dataAdapter);
		
	}
	
}

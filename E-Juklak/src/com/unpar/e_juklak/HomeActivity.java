package com.unpar.e_juklak;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//MenuInflater inflater = getMenuInflater();
		//inflater.inflate(R.menu.main_activity_search, menu);
		//SearchManager searchManager = 
			//	(SearchManager) getSystemService(Context.SEARCH_SERVICE);
			//MenuItem searchActionBarItem = menu.findItem(R.id.searc);
			//searchView.setSearchableInfo(
	//				searchManager.getSearchableInfo(getComponentName());
		//searchView.setIconifiedByDefault(true);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		return super.onOptionsItemSelected(item);
	}
	
	public void onClickListener(View view){
		if(view.getId() == R.id.btnStartJuklak) {
			Intent i = new Intent(this,WebviewActivity.class);
			startActivity(i);
		}
	}
}

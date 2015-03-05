package com.unpar.e_juklak;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class WebviewActivity extends Activity implements
		NavigationDrawerFragment.NavigationDrawerCallbacks {

	private WebView webView;
	/**
	 * Fragment managing the behaviors, interactions and presentation of the
	 * navigation drawer.
	 */
	private NavigationDrawerFragment mNavigationDrawerFragment;

	/**
	 * Used to store the last screen title. For use in
	 * {@link #restoreActionBar()}.
	 */
	private CharSequence mTitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);

		this.webView = (WebView) findViewById(R.id.WebViewJuklak);
		webView.loadUrl("file:///android_asset/bab1.html");
		
		mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager()
				.findFragmentById(R.id.navigation_drawer);
		mTitle = getTitle();

		// Set up the drawer.
		mNavigationDrawerFragment.setUp(R.id.navigation_drawer,
				(DrawerLayout) findViewById(R.id.drawer_layout));
	}

	@Override
	public void onNavigationDrawerItemSelected(int position) {
		if (webView != null) {
			if (position == 0) {
				webView.loadUrl("file:///android_asset/bab1.html");
			} else if (position == 1) {
				webView.loadUrl("file:///android_asset/bab2.html");
			} else if (position == 2) {
				webView.loadUrl("file:///android_asset/bab3.html");
			} else if (position == 3) {
				webView.loadUrl("file:///android_asset/bab4.html");
			}
		}
	}

	public void onSectionAttached(int number) {
		switch (number) {
		case 1:
			mTitle = getString(R.string.bab_1);
			break;
		case 2:
			mTitle = getString(R.string.bab_2);
			break;
		case 3:
			mTitle = getString(R.string.bab_1);
			break;
		case 4:
			mTitle = getString(R.string.bab_1);
			break;
		}

	}

	public void restoreActionBar() {
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		actionBar.setDisplayShowTitleEnabled(true);
		actionBar.setTitle(mTitle);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		if (!mNavigationDrawerFragment.isDrawerOpen()) {
			restoreActionBar();
			return true;
		}
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.

		return super.onOptionsItemSelected(item);
	}

}

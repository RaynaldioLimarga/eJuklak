package com.unpar.e_juklak.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

import com.unpar.e_juklak.MainActivity;
import com.unpar.e_juklak.PageTwo;
import com.unpar.e_juklak.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class WebViewFragment extends Fragment implements OnClickListener {
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	private static final String ARG_SECTION_NUMBER = "section_number";
	private WebView mWebView;
	/**
	 * Returns a new instance of this fragment for the given section number.
	 */
	private void setListener(View view){}
	public static WebViewFragment newInstance(int sectionNumber) {
		WebViewFragment fragment = new WebViewFragment();
		Bundle args = new Bundle();
		args.putInt(ARG_SECTION_NUMBER, sectionNumber);
		fragment.setArguments(args);
		
		return fragment;
		
	}

	public WebViewFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_webview, container,
				false);
		setListener(rootView);
		
		mWebView = (WebView) rootView.findViewById(R.id.webView1);
		
		String data = "<!DOCTYPE html>";
		data += "<head><title>Hello World</title></head>";
		data += "<body>Welcome to the WebView</body>";
		data += "</html>";
		// args: data, mimeType, encoding
		mWebView.loadData(data, "text/html", "UTF-8");
		
		return rootView;
		
	}
	

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		((MainActivity) activity).onSectionAttached(getArguments().getInt(
				ARG_SECTION_NUMBER));
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(getActivity(), PageTwo.class);
		startActivity(intent);
	}
}


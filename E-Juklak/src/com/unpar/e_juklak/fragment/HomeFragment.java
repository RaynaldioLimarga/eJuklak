package com.unpar.e_juklak.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.unpar.e_juklak.MainActivity;
import com.unpar.e_juklak.PageTwo;
import com.unpar.e_juklak.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class HomeFragment extends Fragment implements OnClickListener {
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	private static final String ARG_SECTION_NUMBER = "section_number";

	/**
	 * Returns a new instance of this fragment for the given section number.
	 */
	private void setListener(View view){
		Button btnShowPage2 = (Button) view.findViewById(R.id.btnShowPage2);
		btnShowPage2.setOnClickListener(this);
	}
	public static HomeFragment newInstance(int sectionNumber) {
		HomeFragment fragment = new HomeFragment();
		Bundle args = new Bundle();
		args.putInt(ARG_SECTION_NUMBER, sectionNumber);
		fragment.setArguments(args);
		
		return fragment;
		
	}

	public HomeFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_home, container,
				false);
		setListener(rootView);
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


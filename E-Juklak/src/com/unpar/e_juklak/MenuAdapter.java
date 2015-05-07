package com.unpar.e_juklak;

import java.util.ArrayList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MenuAdapter extends BaseExpandableListAdapter {

	ArrayList<Group> daftarIsi;
	Context isi;
	
	public MenuAdapter(Context isi,ArrayList<Group> daftarIsi){
		this.isi = isi;
		this.daftarIsi = daftarIsi;
	}
	@Override
	
	public Object getChild(int parentPosition, int childPosition){
		return daftarIsi.get(parentPosition).getChildren(childPosition);
	}

	@Override
	//public long getChildId(int groupPosition, int childPosition) {
	//	return 0;
	//}
	public long getChildId(int parentPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public View getChildView(int parentPosition, int childPosition, boolean arg2, View arg3,
			ViewGroup arg4) {
		TextView tv = new TextView(isi);
		
		tv.setText(daftarIsi.get(parentPosition).getChildren(childPosition));
		tv.setPadding(30, 10, 0, 10);
		return tv;
	}

	@Override
	public int getChildrenCount(int parentPosition) {	
		return daftarIsi.get(parentPosition).size();
	}
	
	@Override
	public Object getGroup(int parentPosition) {		
		return daftarIsi.get(parentPosition).getParent();
	}
	@Override
	public int getGroupCount() {
		//return groups.size();
		return daftarIsi.size();
	}


	@Override
	public long getGroupId(int parentPosition) {
		return parentPosition;
	}

	@Override
	public View getGroupView(int parentIndex, boolean arg1, View arg2, ViewGroup arg3) {
		TextView tv = new TextView(isi);
		tv.setText(daftarIsi.get(parentIndex).getParent());
		tv.setPadding(50, 10, 0, 10);
		tv.setTextSize(20);
		return tv;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public boolean isChildSelectable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return true;
	}
}

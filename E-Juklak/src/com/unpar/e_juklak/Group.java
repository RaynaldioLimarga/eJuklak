package com.unpar.e_juklak;

import java.util.ArrayList;

public class Group {


	ArrayList<String> list;
	
	public Group(String parent){
		list =  new ArrayList<String>();
		list.add(parent);
	}
	public void addChild(String item){
		list.add(item);
	}
	public String getChildren(int index){
		return list.get(index);
	}
	public String getParent(){
		return list.get(0);
	}
	public int size(){
		return list.size();
	}
}
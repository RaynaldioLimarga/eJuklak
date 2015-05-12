package com.unpar.e_juklak;

import java.util.ArrayList;
/**
 * Kelas untuk merepresentasikan sebuah bab
 * @author Steven
 *
 */
public class Group {


	ArrayList<String> list;
	/**
	 * Constructor 
	 * @param parent
	 */
	public Group(String parent){
		list =  new ArrayList<String>();
		list.add(parent);
	}
	/**
	 * Menambahkan sub bab
	 * @param item
	 */
	public void addChild(String item){
		list.add(item);
	}
	/**
	 * Mendapatkan sub bab
	 * @param index
	 * @return
	 */
	public String getChildren(int index){
		return list.get(index);
	}
	/**
	 * Mendapatkan bab
	 * @return
	 */
	public String getParent(){
		return list.get(0);
	}
	/**
	 * Mendapatkan jumlah sub bab dan bab
	 * @return
	 */
	public int size(){
		return list.size();
	}
}
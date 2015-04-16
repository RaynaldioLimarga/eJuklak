package com.unpar.e_juklak;

import java.util.ArrayList;
import java.util.List;

public class Group {

	public String id;
	public String string;
	public final List<String> children = new ArrayList<String>();

	public Group(String id, String string) {
		this.id = id;
		this.string = string;
	}
}

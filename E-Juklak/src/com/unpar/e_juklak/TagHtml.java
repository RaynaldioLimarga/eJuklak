package com.unpar.e_juklak;


import java.io.InputStream;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import android.content.Context;

public class TagHtml {
	
	Context ctx;
	Document doc;
	Elements links;
	
	public TagHtml(Context ctx,String assetFiles){
		InputStream is=null;
		this.ctx = ctx;
		
		try {
			is=ctx.getAssets().open(assetFiles);
			//System.out.println(is.available());
		    doc = Jsoup.parse(is, "UTF-8", "http://example.com/");
		} catch (Exception e) {
		    System.out.println("error");
		} 

	}
	
	public String[] getElement(String tag){
		links = doc.select(tag);
	
		String[] res = new String[links.size()];
		for(int i = 0; i<res.length; i++){
			res[i] = links.get(i).toString().split(">")[1].split("<")[0];
			
		}
		return res;
	}
	public String[] getId(String tag){
		links = doc.select(tag);
		String[] res = new String[links.size()];
		for(int i = 0; i<res.length; i++){
			res[i] = links.get(i).id();
			
		}
		return res;
	}
}

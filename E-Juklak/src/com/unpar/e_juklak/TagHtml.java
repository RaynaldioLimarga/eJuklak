package com.unpar.e_juklak;


import java.io.InputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import android.content.Context;
/**
 * Kelas untuk mengolah HTML
 * @author Steven
 *
 */
public class TagHtml {
	
	Context ctx;
	Document doc;
	Elements links;
	/**
	 * Constructor
	 * @param ctx
	 * @param assetFiles
	 */
	public TagHtml(Context ctx,String assetFiles){
		InputStream is=null;
		this.ctx = ctx;
		
		try {
			is=ctx.getAssets().open(assetFiles);
		    doc = Jsoup.parse(is, "UTF-8", "http://example.com/");
		} catch (Exception e) {
		    System.out.println("error");
		} 

	}
	/**
	 * Mendapatkan semua element dari tag tertentu
	 * @param tag
	 * @return
	 */
	public String[] getElement(String tag){
		links = doc.select(tag);
		String[] res = new String[links.size()];
		for(int i = 0; i<res.length; i++){
			res[i] = links.get(i).text();
		}
		return res;
	}
	/**
	 * Mendapatkan semua id dari sebuah tag tertentu
	 * @param tag
	 * @return
	 */
	public String[] getId(String tag){
		links = doc.select(tag);
		String[] res = new String[links.size()];
		for(int i = 0; i<res.length; i++){
			res[i] = links.get(i).id();
			
		}
		return res;
	}
	/**
	 * Mendapatkan isi satu html
	 * @return
	 */
	public String getHTML(){
		return doc.html();		
	}
}

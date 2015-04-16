package com.unpar.e_juklak;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import android.app.Activity;
import android.util.Log;

public class TagHtml {
	
	private Activity activity;
	
	public TagHtml(Activity activity) {
		this.activity = activity;
	}
	
	
	public String bacaTag(String assetname) throws FileNotFoundException, IOException{
        String line ="";
        
        BufferedReader br = null;
        	br = new BufferedReader(new InputStreamReader(activity.getAssets().open(assetname)));
        String content = new String();
        while((line = br.readLine())!=null){
            content+=line;
        }
        br.close();
        return content;
        
    }
	
	
	public Elements[] bacaTitle(String assetname) throws FileNotFoundException, IOException{
		Document doc = Jsoup.parse(bacaTag(assetname));
        Elements titleTag = doc.select("h1, h2, h3");
        return new Elements[] {titleTag.select("h1"), titleTag.select("h2"), titleTag.select("h3")};
		
	}
}

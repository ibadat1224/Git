package picturegallery;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PictureGallery {

	private String imageDirStr = "images/";
	private String pageTitle = "My Image Gallery";
	private String titleBackground = "_banner.jpg";
	private int imagesRow;
	private String pageInit;
	private String pageEnd;

	public PictureGallery(String imageDirStr, String pageTitle, String titleBackground, int imagesRow) {
		super();
		this.imageDirStr = imageDirStr;
		this.pageTitle = pageTitle;
		this.titleBackground = titleBackground;
		this.imagesRow = imagesRow;
	}

	private void initPage(){
		this.pageInit=
		"<!DOCTYPE html>\n"+
		"<html>\n"+
			"<head>\n"+
				"<title>Picture Gallery</title>\n"+
			"</head>\n"+
			"<body>\n"+
				"<center>\n"+
					"<div style="text-align: center;\n"+
								" vertical-align: middle\n"+
								" line-height: 100px;\n"+
								 "width: 90%;\n"+
								" background-image:url('"+ imageDrtStr + titleBackgroun "');\n"+
		      			"<center style="color:#ffffff; font-size: 35px">\n"+
		        			"My Image Gallery\n"+
		      		"	</center>\n"+
		    		"</div>\n"+
		    	"<br>\n"+
			"<table style="width:90%; font-family:'Verdana'; font-size: 10px ">\n";
	}

	public void buildPage(){
		initPage();
		
		StringBuilder webPage= new StringBuilder();
		webPage.append(pageInit);
		webPage.append(pageEnd);
		
		try(BufferedWriter bw= new BufferedWriter(new FileWriter("index.html"))){
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
			public static void main(String[] args){
				
			}
		
	}

}

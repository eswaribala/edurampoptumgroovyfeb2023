package com.optum.day3project.parsers

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
//web scraping

def url = "http://rates.goldenchennai.com/";
def document = Jsoup.connect(url).get();
def goldDetails = document.select('#zh')
def caratDetails= goldDetails.first().text()
println caratDetails
ArrayList<String> downServers = new ArrayList<>();
Element table = document.select("table").get(0); //select the first table.
Elements rows = table.select("tr");
println "WebScraping with Groovy \n"
println "Today's Gold Rate (in Chennai/India)"

for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
	Element row = rows.get(i);
	Elements cols = row.select("td");
   
    for(int j=0;j<cols.size();j++) {
		print cols[j].text()
	}	
	println "\n"
}


println "Thanks to Groovy and Jsoup"
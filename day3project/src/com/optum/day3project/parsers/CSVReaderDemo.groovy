package com.optum.day3project.parsers

import com.optum.day3project.models.PGPProduct
import groovy.xml.*
class CSVReaderDemo {
	static main(args) {
		//read from csv
		def products=new ArrayList()
		
		def count=0
		new File("src/com/optum/day3project/parsers/pgpdec.csv").withReader { reader ->;
			reader.eachLine { line ->
			
				count++
				if(count>2)
				{	
				String[] lineArr=line.split(",");
				
				products.add(new PGPProduct(lineArr[0],lineArr[1],lineArr[2]))
				}				
			}	
		}
		/*
		for(PGPProduct product:products) {
			println product.productName
		}
		*/
		
		//write to xml
		def writer = new StringWriter()
		def xml = new groovy.xml.MarkupBuilder(writer)
		// Xml declaration
		xml.mkp.xmlDeclaration(version: "1.0", encoding: "utf-8")
		// Start writing the document
		xml.Products {
			setOmitEmptyAttributes(true)
			setOmitNullAttributes(true)
			// Add an xml comment.
			mkp.comment "Available products"
			products.each {
				def that = it
				Product() {
					ProductName(that.productName)
					ProductImage(that.productImage)
					Price(that.Price)
				}
			}
		}
		// Write Xml to console.
		println writer.toString()
		
	}
}



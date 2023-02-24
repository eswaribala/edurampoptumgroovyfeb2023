package com.optum.day1project.utilities

def xmlFile = getClass().getResourceAsStream("articles.xml")
import groovy.xml.DOMBuilder;
import groovy.xml.dom.DOMCategory;

// Convert the input XML file content to a string
def input = new File('articles.xml').text

// Parse the input string using DOMBuilder
def doc = DOMBuilder.parse(new StringReader(input))

// Access the root element, which is meals
def meals = doc.documentElement

// Use DOMCategory to update values
use(DOMCategory) {
    // Get the breakfast category
    def breakfast = meals.category[0]
    // Update the breakfast category time
    breakfast['@time'] = '7am'
}

// Save the output to a file
new File('out.xml').write(meals as String)
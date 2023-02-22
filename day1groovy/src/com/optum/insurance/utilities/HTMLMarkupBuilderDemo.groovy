package com.optum.insurance.utilities

import groovy.xml.MarkupBuilder

def page =new MarkupBuilder();
page.root {
    html( ) {
        head{ title{

        } }
        body( bgColor:'blue', ol{

        } )
    }
}

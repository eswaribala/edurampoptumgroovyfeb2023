package com.optum.insurance.utilities

import groovy.xml.MarkupBuilder

def writer = new StringWriter()
def page = new MarkupBuilder(writer)
page.html {
    head {
        title: "Creating Optum Global Insurance"
        //script: "alert('hello');"
    }
    body(id: "gins") {
        h2 id: "book-mark",  "Claim Management System"
        p {
            mkp.yield "Mixing text with"
            strong "strong"
            mkp.yield " elements."
        }
        a href: "http://vebdental-care.com/", "Veb Dental Care"
        div{
            p 'Solution Architecture'
        }
        ol{
            for(count in 1..5) {
                li "Project $count"
            }

        }
    }
}
println writer
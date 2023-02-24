package com.optum.day1project.utilities

import groovy.xml.*

def myxml = '''
    <feed xmlns="http://www.w3.org/2005/Atom" xmlns:m="http://schemas.microsoft.com/ado/2007/08/dataservices/metadata" xmlns:d="http://schemas.microsoft.com/ado/2007/08/dataservices">
        <entry>
            <content type="application/xml">
                <m:properties>
                    <d:key>JobApplication/applicationId=94319</d:key>
                    <d:status>OK</d:status>
                    <d:editStatus>UPDATED</d:editStatus>
                    <d:message>Application has been updated successfully</d:message>
                    <d:index m:type="Edm.Int32">0</d:index>
                    <d:httpCode m:type="Edm.Int32">204</d:httpCode>
                    <d:inlineResults m:type="Bag(SFOData.UpsertResult)"></d:inlineResults>
                </m:properties>
            </content>
        </entry>
    </feed>
'''


def xml = new XmlSlurper().parseText(myxml)

println "key: ${xml.entry.content.properties.key}"
println "status: ${xml.entry.content.properties.status}"
println "editStatus: ${xml.entry.content.properties.editStatus}"
println "message: ${xml.entry.content.properties.message}"
println "index: ${xml.entry.content.properties.index}"
println "httpCode: ${xml.entry.content.properties.httpCode}"
println "inlineResults: ${xml.entry.content.properties.inlineResults}"
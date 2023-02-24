# grails-liveform-example

```groovy
package grails.liveform.example

class Person {

	String firstName
	String surName
	String address
	
    static constraints = {
    }
}
```

given above class and default grails generate controllers + views.

[This was what has been changed to make it in to a live form](https://github.com/vahidhedayati/grails-liveform-example/commit/c038b6eb3261a73b4aff9da0b67ce6db1644aeef)

### [Walkthrough video](https://www.youtube.com/watch?v=Dt8FznQSnhM)

Controller addition:

```groovy

static allowedMethods = [save: "POST", update: "PUT", myUpdate: "POST",  delete: "DELETE"]
+	
+	// dynamic call made via jquery inside _edit.gsp
+	def myform(Integer max) {
+		params.max = Math.min(max ?: 10, 100)
+		def personInstanceList=Person.list(params)
+		println "-- $params"
+		render template: params.template, model:[personInstanceList:personInstanceList, personInstanceCount: Person.count()]
+	}
+	
+	@Transactional
+	def myUpdate(Person personInstance) {
+		println "-- ${params} @@@ $personInstance"
+		//=Person.get(params.id)
+		if (personInstance == null) {
+			render "error record found"
+			return
+		}
+
+		if (personInstance.hasErrors()) {
+			render "error record not saved"
+			return
+		}
+
+		personInstance.save flush:true
+		render "person saved"
+	}
+	
```
new gsps:
```
grails-app/views/person/_editMe.gsp
grails-app/views/person/_list.gsp
grails-app/views/person/_myform.gsp
```

Where _list was the content inside index.gsp 

Where _editMe is the same as list but changed to have actions and other jquery get methods to load myForm

Where myForm is the actual form content i.e. list but as form input 


updated gsp:
```
grails-app/views/person/index.gsp
```


Done if you can follow the changes and if you like copy the 

grails-app/domain
grails-app/controllers
grails-app/views

To you own basic vanilla app and start - then you can trace what I did to make it all work.



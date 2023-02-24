<%@ page import="grails.liveform.example.Person" %>



<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'address', 'error')} required">
	<label for="address">
		<g:message code="person.address.label" default="Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="address" required="" value="${personInstance?.address}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="person.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${personInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'surName', 'error')} required">
	<label for="surName">
		<g:message code="person.surName.label" default="Sur Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="surName" required="" value="${personInstance?.surName}"/>

</div>



<%@ page import="grails.liveform.example.Person" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'person.label', default: 'Person')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
	<g:javascript>
		
	function loadPage(page) { 
	
		$.get('<g:createLink controller="person"  action="myform" />?template='+page,function(data){
			$('#modifiedIndex').hide().html(data).fadeIn('slow');
		});
	}
	</g:javascript>
	
		<a href="#list-person" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-person" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			
				<input type="submit" value="edit" onclick="loadPage('editMe');">
				<input type="submit" value="list" onclick="loadPage('list');">
			
			<!-- actual content now moved to _list.gsp -->
			<div id="modifiedIndex">
			
				<g:javascript>
					loadPage('list');
				</g:javascript>
				
			</div>
			
			
			<div class="pagination">
				<g:paginate total="${personInstanceCount ?: 0}" />
			</div>
		</div>
		

		
	</body>
</html>

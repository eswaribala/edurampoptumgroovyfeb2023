
			<g:javascript>
	
	

	
	// function is called by _myform.gsp 
	function loadInteractiveFom() {
	 	$.get('<g:createLink controller="person"  action="myform" params="${[template:'myform']}"/>',function(data){
			$('#interactiveForm').hide().html(data).fadeIn('slow');
		});
	}
	
	
	// this relies in name being in application.properties
	//var baseapp="${meta(name:'app.name')}";
	//example on how to apply variables
	//var id="${id}";
	//var something="${something}";
	//$.get("/"+baseapp+"/person/myform?id="+id+"&something="+something,function(data){
	//	$('#interactiveForm').hide().html(data).fadeIn('slow');
	//});
		
	</g:javascript>
	
	
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="address" title="${message(code: 'person.address.label', default: 'Address')}" />
					
						<g:sortableColumn property="firstName" title="${message(code: 'person.firstName.label', default: 'First Name')}" />
					
						<g:sortableColumn property="surName" title="${message(code: 'person.surName.label', default: 'Sur Name')}" />
						<th>ACTIONS</th>
					</tr>
				</thead>
				
				<tbody>
				<!--  this DIVID is reloaded upon submit action being called -->
				<!--  calls _myform.gsp through a controller action that is called -->
				<!--  via the jquery call below. -->
				<div id="interactiveForm" style="position: absolute; padding-top: 50px;">
				
				<g:javascript>
					loadInteractiveFom();
				</g:javascript>
				
				</div>
				
				<!--  what remoteForm posts back to -->
				<div id="formResult">
				</div>
				</tbody>
				
			</table>
		
		



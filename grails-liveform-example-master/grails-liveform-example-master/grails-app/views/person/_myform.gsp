				<g:each in="${personInstanceList}" status="i" var="personInstance">
					<g:formRemote 
	name="urlParams"  
	class="form-horizontal" 
	url="[controller:'person', action:'myUpdate']"
    update="formResult" 
    onComplete="loadInteractiveFom()" 
    >
					<input type="hidden" name="id" value="${personInstance.id}">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">	
							<td><input type="text" name="address" value="${fieldValue(bean: personInstance, field: "address")}"></td>
						<td><input type="text" name="firstName" value="${fieldValue(bean: personInstance, field: "firstName")}"></td>
						<td><input type="text" name="surName" value="${fieldValue(bean: personInstance, field: "surName")}"></td>
						<td><input type="submit" value="update"></td>
				
					</tr>
					</g:formRemote>
				</g:each>
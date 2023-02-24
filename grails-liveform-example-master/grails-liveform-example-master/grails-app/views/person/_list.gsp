<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="address" title="${message(code: 'person.address.label', default: 'Address')}" />
					
						<g:sortableColumn property="firstName" title="${message(code: 'person.firstName.label', default: 'First Name')}" />
					
						<g:sortableColumn property="surName" title="${message(code: 'person.surName.label', default: 'Sur Name')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${personInstanceList}" status="i" var="personInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${personInstance.id}">${fieldValue(bean: personInstance, field: "address")}</g:link></td>
					
						<td>${fieldValue(bean: personInstance, field: "firstName")}</td>
					
						<td>${fieldValue(bean: personInstance, field: "surName")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
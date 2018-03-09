<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html  >
<html>

	<head>
		<title>Catalogue</title>
		<link rel="stylesheet" type="text/css" href="http://www.localhost:8080/CatalogueMVC/src/main/resources/css/style.css">
	</head>
	
	<body>
		<div id="formProduit"></div>
		 	<f:form modelAttribute="produit" method="post" action="saveProduit">
		 		<table>
		 			<tr>
		 				<td>Référence:</td>
		 				<td><f:input path="reference"/></td>
		 			</tr>
		 				<tr>
		 				<td>Désignation:</td>
		 				<td><f:input path="designation"/></td>
		 			</tr>
		 			<tr>
		 				<td>Prix:</td>
		 				<td><f:input path="prix"/></td>
		 			</tr>
		 			<tr>
		 				<td>Quantité:</td>
		 				<td><f:input path="quantite"/></td>
		 			</tr>
		 			<tr>
		 				<td><input type="submit" value="Save"></td>
		 			</tr>
		 		</table>
		 	</f:form>
		<div id="listProduits">
			<table class="table1">
				<tr>
					<th>REF</th><th>DESIGNATION</th><th>PRIX</th><th>QUANTITE</th>
				</tr>
			
			    <c:forEach items="${produits}" var="p">
					<tr>
						<td>${p.reference}</td>
						<td>${p.designation}</td>
						<td>${p.prix}</td>
						<td>${p.quantite}</td>
					</tr>			
			    </c:forEach>
			</table >
		</div>
	</body>
	
</html>
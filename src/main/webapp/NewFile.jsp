<%@ import="web.creditModel" %>
<%
creditModel model=(creditModel)req.getAttribute(creditModel);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<form action="calculermensualite.do" method="post">
<table>
<tr>

<td> montant:</td>
<td> <input type="text" name="montant" value="<%=model.getMontant()%>"/></td>
<td>DH</td>

</tr>
<tr>

<td> taux:</td>
<td> <input type="text" name="taux" value="<%=model.getMontant()%>"/></td>
<td>%</td>

</tr>
<tr>

<td> duree:</td>
<td> <input type="text" name="duree" value="<%=model.getMontant()%>"/></td>
<td>mois</td>

</tr>
</table>
<button type="submit">calculer</button>
</form>
</div>

<div>
 Mensualite=<%=model.getMensualite()%>
</div>
</body>
</html>
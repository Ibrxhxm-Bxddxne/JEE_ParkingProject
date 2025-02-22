<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Gestion du Parking</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style01.css" />
</head>
<body>
    <h1>Calcul du Tarif de Stationnement</h1>
    
    <%-- Afficher un message d'erreur si présent --%>
    <% if (request.getAttribute("erreur") != null) { %>
        <p style="color: red;"><%= request.getAttribute("erreur") %></p>
    <% } %>

    <form action="calculer" method="post">
        <label>Durée (en heures) :</label>
        <input type="number" name="duree" value="<%= (request.getAttribute("duree") != null) ? request.getAttribute("duree") : "" %>" required><br>

        <label>Période :</label>
        <select name="periode">
            <option value="jour" <%= "jour".equals(request.getAttribute("periode")) ? "selected" : "" %>>Jour</option>
            <option value="nuit" <%= "nuit".equals(request.getAttribute("periode")) ? "selected" : "" %>>Nuit</option>
        </select><br>

        <label>Taux d'abonnement (%) :</label>
        <input type="number" name="taux" step="0.1" value="<%= (request.getAttribute("taux") != null) ? request.getAttribute("taux") : "" %>"><br>

        <input type="submit" value="Calculer">
    </form>

    <%-- Afficher le montant si présent --%>
    <% if (request.getAttribute("montant") != null) { %>
        <h2>Montant total à payer : <%= request.getAttribute("montant") %> dhs</h2>
    <% } %>
</body>
</html>

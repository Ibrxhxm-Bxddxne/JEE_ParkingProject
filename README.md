#Structure du code
###JSP (JavaServer Pages) - formulaire.jsp :
But : Cette page présente un formulaire HTML pour que l'utilisateur puisse saisir la durée de stationnement, la période (jour ou nuit), et un taux d'abonnement. Elle affiche également les résultats du calcul ou des erreurs éventuelles.
Composants :
Formulaire HTML : Ce formulaire utilise la méthode POST pour envoyer les données vers le servlet (ParkingServlet).
Affichage d'erreurs : Si une erreur survient (par exemple, si des valeurs invalides sont envoyées), un message d'erreur est affiché en rouge.
Affichage des résultats : Après le calcul, si le montant total est calculé, il est affiché sous le formulaire.
Données pré-remplies : Si l'utilisateur revient sur la page après avoir envoyé des données, les champs sont pré-remplis avec les valeurs précédemment saisies.

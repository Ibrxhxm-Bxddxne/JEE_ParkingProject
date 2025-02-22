# Structure du code
## JSP (JavaServer Pages) - formulaire.jsp :

But : Cette page présente un formulaire HTML pour que l'utilisateur puisse saisir la durée de stationnement, la période (jour ou nuit), et un taux d'abonnement. Elle affiche également les résultats du calcul ou des erreurs éventuelles.
Composants :
Formulaire HTML : Ce formulaire utilise la méthode POST pour envoyer les données vers le servlet (ParkingServlet).
Affichage d'erreurs : Si une erreur survient (par exemple, si des valeurs invalides sont envoyées), un message d'erreur est affiché en rouge.
Affichage des résultats : Après le calcul, si le montant total est calculé, il est affiché sous le formulaire.
Données pré-remplies : Si l'utilisateur revient sur la page après avoir envoyé des données, les champs sont pré-remplis avec les valeurs précédemment saisies.

##Servlet - ParkingServlet :

But : Ce servlet prend en charge le traitement des données envoyées par le formulaire et calcule le tarif de stationnement en fonction des informations fournies par l'utilisateur.
Traitement :
Récupération des paramètres : Les valeurs du formulaire (durée, période, taux d'abonnement) sont extraites à partir de la requête HTTP.
Calcul du montant : Un objet de la classe Parking est créé avec les paramètres, puis la méthode calculerMontant() est appelée pour déterminer le montant total à payer.
Gestion des erreurs : En cas d'exception (par exemple, si l'utilisateur saisit des valeurs non valides), un message d'erreur est ajouté à la requête.
Redirection vers la JSP : Les résultats (ou l'erreur) sont ensuite stockés comme attributs de la requête, et l'utilisateur est redirigé vers la page JSP pour afficher les résultats.

# Fonctionnement du processus
Page JSP : L'utilisateur entre les informations nécessaires dans un formulaire : durée, période et taux d'abonnement.
Envoi des données : Ces informations sont envoyées au servlet ParkingServlet via la méthode POST.
Traitement dans le servlet : Le servlet récupère les données, crée un objet Parking, calcule le montant total avec calculerMontant(), et stocke les résultats (ou les erreurs) dans l'objet request.
Affichage des résultats : Le servlet redirige ensuite la requête vers la même JSP, qui affiche soit le montant à payer, soit un message d'erreur si des données invalides ont été saisies.
# Résumé du Flux
L'utilisateur entre des informations dans le formulaire.
Les données sont envoyées au servlet via POST.
Le servlet effectue le calcul et retourne les résultats à la page JSP pour affichage.

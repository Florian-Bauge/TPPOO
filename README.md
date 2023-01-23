# TPPOO
Tp POO Ensim

Spring Web : Permet de créer une application web

Spring Data JPA : Permet d'acceder au données de l'application plus facilement

Validation: Permet de valider les données rentrer par l'utilisateur

H2 Database: Permet de créer une BDD rapide et légère en Java

Spring Boot DevTools : Optmise le serveur automatiquement

Thymeleaf : n template engine (moteur de rendu de document) écrit en Java conçu pour produire des vues Web

<H1>Questions : </H1>
Étape 13 :
1 - @GetMapping("/greeting")

2-  return "greeting";

3 - On l'envoie avec la fonction  model.addAttribute("nomTemplate", nameGET); qui affecte à la variable "nomTemplate" nameGet et qui l'envoie au fichier html.

<h2> Étape 17</h2>
La tabLe adresse est créée dans la BDD 
<h2> Étape 18</h2>

Hibernate facilite la persistence et la recherche de données dans une base de données en réalisant lui-même la création des objets et les traitements de remplissage de ceux-ci en accédant à la base de données. La quantité de code ainsi épargnée est très importante d'autant que ce code est généralement fastidieux et redondant.
<h2> Étape 20</h2>
Oui, je vois le contenue dans la table
<h2> Étape 22</h2>
permet d'activer l'injection automatique de dépendance
<h2> Étape 30</h2>
Pour ajouter bootstrap,j'ai ajouté ces 2 lignes dans le html : <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
Je l'ai mise dans le général, pour que celle-ci soit activer sur toutes les pages.
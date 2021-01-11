<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	 <!--StyleSheet-->
	 <link rel="stylesheet" href="styles/style.css">
	 <link rel="stylesheet" href="styles/navbar.css">
	 <link rel="stylesheet" href="styles/login.css">
	 
	 
	 <!--Font Awesome CDN-->
	 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA==" crossorigin="anonymous" />
     <!--Script-->
     <script src="script.js" defer></script>
     <title>Eni-Ench�res | Connexion</title>
</head>

<body>
 	<!-- Navbar -->
 	<%@ include file = "navbar.jsp" %>

	<!--Logging form-->
	
      <section class="login-form">
      <form class="login" action="<%=request.getContextPath() %>/ServletLogin" method="post"> <!-- change methode to POST to get results on server, i used GET to show the result in html file-->
        <div class="input-field">
          <label for="id">Identifiant: </label>
          <input class="input" name="id" id="id" placeholder="Identifiant">
        </div>

        <div class="input-field">
          <label for="mdp">Mot De Passe: </label>
          <input class="input" name="mdp" id="mdp" type="password" placeholder="Mot De Passe"required>
        </div>
        
        <div>
          <label class="ssdm" for="Ssdm">Se souvenir de moi</label>
          <input name="Ssdm" id="Ssdm" type="checkbox" >
        </div>

        <div class="mdpo">
          <a href="#">Mot de passe oubli�?</a>
        </div>

        <div>
          <button class="btn-login" type="submit">Connexion</button> </a>
        </div>

        <div>
          <a href ='PageCreerCompte.html'><button class="btn-login" type="button"> 
            Cr�er un compte
          </button></a>
        </div>
      </form>
    </section>
</body>
</html>
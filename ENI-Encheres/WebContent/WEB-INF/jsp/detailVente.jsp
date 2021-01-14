<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <html lang="fr">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--StyleSheet-->
        <link rel="stylesheet" href="style.css">
        <!--Font Awesome CDN-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA==" crossorigin="anonymous" />
        <!--Script-->
        <script src="script.js" defer></script>
        <title>Eni-Enchères | Connexion</title>
        
    </head>
  <body>
  <!-- Navbar -->
 	<%@ include file = "navbar.jsp" %>
   <!--Head-->
    <div class="head">
      <h1>Détail Vente</h1>
    </div>

    <div class="container-vente">

        <div class="card-img-container">
            <img src="img/tournevis.jpeg" alt="">
        </div>
        <table>
            <tr>
                <td class="td1"><p class="value-td1">Description:</p></td>
                <td class="td2"><p class="value-td2">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Reiciendis natus recusandae dolore molestiae fuga ipsam aperiam animi quis, ipsa, fugiat in saepe quae voluptates, numquam eveniet cum voluptatibus veritatis illum laborum reprehenderit? Quis ullam, voluptatibus voluptas rerum odio, eius voluptate inventore culpa molestias a earum sequi veniam quam? Pariatur, esse.</p></td>
            </tr>
            <tr>
                <td class="td1"><p class="value-td1">Meilleure offre:</p></td>
                <td class="td2"><p class="value-td2">210 pts par bob</p></td>
            </tr>
            <tr>
                <td class="td1"><p class="value-td1">Mise à prix:</p></td>
                <td class="td2"><p class="value-td2">185 points</p></td>
            </tr>    
            <tr>
                <td class="td1"><p class="value-td1">Fin de l'enchère:</p></td>
                <td class="td2"><p class="value-td2">09/10/2018</p></td>
            </tr>
            <tr>
                <td class="td1"><p class="value-td1">Retrait:</p></td>
                <td class="td2"><p class="value-td2">10 allée des alouettes 44800 Saint Alouettes 44800 Saint Herblain</p></td>
            </tr>
            <tr>
                <td class="td1"><p class="value-td1">Vendeur:</p></td>
                <td class="td2"><p class="value-td2">jojo44</p></td>
            </tr> 
        </table>

        <div class="input-field">
            <label for="mPrix">Ma Proposition :</label>
            <input class="input" type="number" name="mPrix" id="mPrix" 
            step="5" max= "10000" required>
        </div>

      <div>
        <button class="btn-login" type="submit">Connexion</button> </a>
      </div>

      <a href ='PageConnexion.html'><button class="btn" type="button"> <!--change that with index.html file location-->
        Back
      </button>
      </a>
    </div>
  </body>
</html>

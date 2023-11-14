import bibliotheque.Bibliotheque
import bibliotheque.Livre

object Main {
  def main(args: Array[String]): Unit = {
    val bibliotheque = new Bibliotheque

    val livre1 = new Livre(titre = "Book 1", auteur = "Abraham Licoln", anneeDePublication = 1960)
    val livre2 = new Livre(titre = "Book 2", auteur = "Tom Peterson", anneeDePublication = 1920)
    val livre3 = new Livre(titre = "Book 3", auteur = "Gari Peterson", anneeDePublication = 1970)
    val livre4 = new Livre(titre = "Book 4", auteur = "Tom Pat", anneeDePublication = 1980)

    bibliotheque.ajouterLivre(livre = livre1)
    println()
    bibliotheque.ajouterLivre(livre = livre2)
    println()
    bibliotheque.ajouterLivre(livre = livre3)
    println()
    bibliotheque.ajouterLivre(livre = livre4)

    println()
    // Emprunter livre
    bibliotheque.empunterLivre(titre = "Book 1")
    println()

    // Rendre livre
    bibliotheque.rendreLivre(titre = "Book 1")
    println()

    // rechercher par auteur
    println("Research by auteur...")
    val livres = bibliotheque.rechercherParAuteur(auteur = "Gari Peterson")
    println("Tese are/this is the books from Abraham Licoln")
    println(livres.mkString("\n"))
    println()

    println("Research by titre...")
    // rechercher par titre
    val livresTitre = bibliotheque.rechercherParTitre(titre = "Book 4")
    livresTitre match {
      case Some(livre) => println(s"Book found: $livre")
      case None => println(s"None Book found")
    }
  }
}
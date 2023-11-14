package bibliotheque
import scala.collection.mutable.ListBuffer

class Bibliotheque {
  var livres: ListBuffer[Livre] = ListBuffer()

  def getLivres(): ListBuffer[Livre] = {
    return livres
  }

  def ajouterLivre(livre: Livre): Unit = {
    livres += livre
    print(s"The book ${livre.titre} has been added succesfully.")
  }

  def empunterLivre(titre: String): Unit = {
    val livreSelected = livres.find(_.titre.equals(titre))
    livreSelected match {
      case Some(livre) => livre.emprunter()
      case None => println(s"The book \"$titre\" doesn't exist in the Library")
    }
  }

  def rendreLivre(titre: String): Unit = {
    val livreSelected = livres.find(_.titre.equals(titre))
    livreSelected match {
      case Some(livre) => livre.rendre()
      case None => println(s"The book \"$titre\" doesn't exist in the Library")
    }
  }

  def rechercherParTitre(titre: String): Option[Livre] = {
    livres.find(_.titre==titre)
  }

  def rechercherParAuteur(auteur: String): Option[Livre] = {
    livres.find(_.auteur.equals(auteur))
  }

  override def toString: String = {
    livres.mkString("\n")
  }
}

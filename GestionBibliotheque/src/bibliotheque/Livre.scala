package bibliotheque

class Livre(val titre: String, val auteur: String, val anneeDePublication: Int) {

  private var estEmprunte: Boolean = true

  def emprunter(): Unit = {
    if(!estEmprunte){
      estEmprunte = true
    } else {
      println("This book is already borrowed>.")
    }
  }

  def rendre(): Unit = {
    if(estEmprunte){
      estEmprunte = false
    } else {
      println("This book is returned")
    }
  }

  override def toString: String = {
    s"Title: $titre, Auteur: $auteur, Annee de publication : $anneeDePublication, Emprunte: $estEmprunte"
  }
}

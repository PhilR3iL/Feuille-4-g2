package exo1;

public class Rectangle{
  private double largeur;
  private double longueur;
  public Rectangle(double largeur, double longueur){
    this.largeur = largeur;
    this.longueur = longueur;
  }

  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Rectangle = \n");
    sb.append("largeur = ").append(largeur).append('\n');
    sb.append("longueur = ").append(longueur).append('\n');
    return sb.toString();
    // return "Rectangle = \nlargeur = " + largeur + ...
  }

  @Override
  public boolean equals(Object other){
    if(this == other)
      return true;
    if (other == null)
      return false;
    if (!(other instanceof Rectangle))
      return false;
    Rectangle rect2 = (Rectangle) other;
    return (largeur == rect2.largeur && longueur == rect2.longueur);
  }
}
package exo1;

public class RectangleColore extends Rectangle {
  private String couleur;

  public RectangleColore(double largeur, double longueur, String couleur) {
    super(largeur, longueur);
    this.couleur = couleur;
  }

  @Override
  public String toString() {
    return super.toString() + "\ncouleur=" + couleur;
  }

  @Override
  public boolean equals(Object other){
    boolean result = super.semiEquals(other);
    if(result){
      if(other instanceof RectangleColore){
        RectangleColore patrick = (RectangleColore) other;
        if(patrick.couleur != null){
          result = patrick.couleur.equals(couleur);
        }else{
          result = (patrick.couleur == couleur);
        }
      }else{
        result = false;
      }
    }
    return result;
  }

  @Override
  public int hashCode(){
    final int prime = 31;
    int result = 1;
    long temp;
    temp = couleur.hashCode();
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }
  
}
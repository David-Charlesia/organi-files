public class FichiersOrga
{
  private String nom; //nom du fichier
  private String ch; //chemin absolu du fichier

  public FichiersOrga()
  {
    this.nom="unknow";
    this.ch="unknow";
  }

  public FichiersOrga(String nom,String ch)
  {
    this.nom=nom;
    this.ch=ch;
  }

  public FichiersOrga(FichiersOrga f)
  {
    this.nom=f.get_nom();
    this.ch=f.get_ch();
  }

  public String get_nom(){return this.nom;}

  public String get_ch(){return this.ch;}

  public void set_nom(String nom){this.nom=nom;}

  public void set_ch(String ch){this.ch=ch;}

  public String toString()
  {
    return "Le fichier a pour nom : "+this.nom+", son chemin d'acces est : "+this.ch+".";
  }

  public static void main(String[] args)
  {
    FichiersOrga f1=new FichiersOrga();
    FichiersOrga f2=new FichiersOrga("Test","C/...");
    FichiersOrga f3=new FichiersOrga(f2);

    System.out.println("Constructeur vide            --> "+f1.toString());
    System.out.println("Constructeur avec parametres --> "+f2.toString());
    System.out.println("Constructeur par copie       --> "+f3.toString());
  }
}

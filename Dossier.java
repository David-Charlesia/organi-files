import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Dossier
{
  private ArrayList<FichiersOrga> fichiers;

  private File dossier;

  public Dossier(String ch)
  {
    this.fichiers=new ArrayList<FichiersOrga>();
    this.dossier=new File(ch);
  }

  public void parcours()
  {
    ArrayList<String> dossier_temp=this.dossier.list();
    Iterator<String> ite=dossier_temp.iterator();

    String nom;

    while(ite.hasNext())
    {
      nom=ite.next();
      
    }
  }
}

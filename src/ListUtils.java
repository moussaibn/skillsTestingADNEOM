import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    /**
     *
     * @param liste : represente la liste fournie en entrée que l'on doit subdivisé
     * @param taille : taille maximale des des souslistes
     * @return  liste de sous liste, où chaque sous liste a au maximum « taille » éléments.
     * @throws lance une erreur arithmetic lorqu'on tente de subdiviser en des tableau de 4
     */
    public static List<List<Integer>> partition(List<Integer> liste, int taille) throws ArithmeticException{
        List<List<Integer>> partitionedList = new ArrayList<>();
        int i=0;
        if(taille == 0)
            throw new ArithmeticException();

        while(i <liste.size()){
            if((liste.size()-i) / taille >= 1)
                partitionedList.add(liste.subList(i,i+taille));
            else
                partitionedList.add(liste.subList(i,liste.size()));
            i+=taille;
        }
        return partitionedList;
    }
}

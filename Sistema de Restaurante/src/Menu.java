import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Item> itens;

    public Menu(){
        this.itens = new ArrayList<>();

    }
    public void inserir(Item item){
        this.itens.add(item);

    }
    public void remover(Item item){
        this.remover(item);
    }

}

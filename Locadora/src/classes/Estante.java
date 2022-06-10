package classes;

public class Estante {
    private int capMaxima;
    private Item[] itensEstante;


    public Estante(int capacidadeMaxima) {
        setCapMaxima(capacidadeMaxima);
        setItensEstante(new Item[capacidadeMaxima]);
    }
    public boolean estanteCheia(){
        return getCapMaxima()==quantidadeItens();
    }
    public int quantidadeItens(){
        int quantidade=0;
        for (Item item:getItensEstante()){
            if (item!=null){
                quantidade+=1;
            }
        }
        return quantidade;
    }
    public Item buscarItem(String titulo){
        for (Item item:getItensEstante()){
            if (item!=null){
                if (item.getTitulo().equals(titulo)){
                    return item;
                }
            }
        }
        return null;
    }
    public boolean adicionarItem(Item item){
        if (!estanteCheia()){
            for (int i=0;i<getCapMaxima();i++){
                if (getItensEstante()[i]==null){
                    getItensEstante()[i]=item;
                    return true;
                }
            }
        }
        return false;
    }
    public Item removerItem(int posicao){
        Item item=getItensEstante()[posicao];
        getItensEstante()[posicao]=null;
        return item;
    }
    //GETTERS E SETTERS
    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public Item[] getItensEstante() {
        return itensEstante;
    }

    public void setItensEstante(Item[] itensEstante) {
        this.itensEstante = itensEstante;
    }
}

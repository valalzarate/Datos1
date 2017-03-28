package Clases;

public class Orden {

    private int idOrden;
    
    private int timer;
    
    public String plato;
    public Orden link;
    
    public Orden(){
    plato="";
    link=null;
    
    }
    
    public Orden(String plat){
    plato=plat;
    link=null;
    }
}

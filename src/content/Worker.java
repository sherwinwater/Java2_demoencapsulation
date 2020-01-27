package content;

public class Worker {

    private String name = "Fred";
    private int number;

    public String getName() {
        return this.name;
    }
    
    public Worker(){
        this(100);
    }
    public Worker(int number){
        this.number = number;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
}

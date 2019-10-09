import java.util.ArrayList;
import java.util.List;

public class Queue {
    public List array;
    private int size;
    private  boolean hasParameters;

    public Queue(int size) {
        this.array = new ArrayList();
        this.size = size;
        this.hasParameters = true;
    }

    public Queue(){
        this.array = new ArrayList();
        this.hasParameters = false;
    }

    public void push(int number){
        array.add(number);
    }

    public void pop(){
        array.remove(array.get(0));
    }

    public void printIsFullOrEmpty (List array, int length){
        if(hasParameters)
            System.out.println(" is never full");
        else if(array.isEmpty())
            System.out.println(" is empty");
        else if (length > array.size())
            System.out.println(" is not full");
        else
            System.out.println(" is full");
    }

    public boolean IsFull (List array, int length){
        if (length == array.size())
            return true;
        if(!hasParameters)
            System.out.println("This queue is never full");
        return false;
    }
    public boolean IsEmpty (List array){
        return array.isEmpty();
    }
}

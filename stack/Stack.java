
public class Stack {

    private String[] data;
    private int MAX;
    private int top;

    public Stack(int size) {
        MAX = size;
        data = new String[MAX];
        top = -1;
    }

    public boolean push(String value) {
        boolean result = false;
        top++;
        if (top < MAX) {
            data[top] = value;
            result = true;
        }else{
            top--;
        }
        return result;
    }

    public String pop() {
        String result = null;
        if (top >= 0) {
            result = data[top];
            top--;
        }
        return result;
    }

    public String peek() {
        String result = null;
        if (top >= 0) {
            result = data[top];
        }
        return result;
    }

    public boolean isEmpty() {
        boolean result = false;
        if (top < 0) {
            result = true;
        }
        return result;
    }

    public boolean isFull() {
        boolean result = false;
        if (top >= MAX - 1) {
            result = true;
        }
        return result;
    }
    
    public void cetak(){
        System.out.print("[ ");
        if(!isEmpty()){
            for(int i=0;i<=top;i++){
                System.out.print(data[i]+", ");
            }
        }
        System.out.println(" ]");
    }
}

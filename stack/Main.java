
public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(8);
        boolean dResult = stack.isFull();
        System.out.println("Result: "+dResult);
        
        dResult = stack.isEmpty();
        System.out.println("Result: "+dResult);
        
        dResult = stack.push("ALGORITHM");
        System.out.println("Result: "+dResult);
        stack.cetak();
        
        dResult = stack.push("ALGEBRA");
        System.out.println("Result: "+dResult);
        stack.cetak();
        
        dResult = stack.push("CALCULUS");
        System.out.println("Result: "+dResult);
        stack.cetak();
        
        dResult = stack.push("DATA STUCTURE");
        System.out.println("Result: "+dResult);
        stack.cetak();
        
        String sResult = stack.pop();
        System.out.println("Result: "+sResult);
        stack.cetak();
        
        sResult = stack.peek();
        System.out.println("Result: "+sResult);
        stack.cetak();
        
        dResult = stack.push("DATA STUCTURE");
        System.out.println("Result: "+dResult);
        stack.cetak();
        
        dResult = stack.push("GRAPH THEORY");
        System.out.println("Result: "+dResult);
        stack.cetak();
        
        dResult = stack.push("REAL ANALYSIS");
        System.out.println("Result: "+dResult);
        stack.cetak();
        
        dResult = stack.isEmpty();
        System.out.println("Result: "+dResult);
        
        dResult = stack.isFull();
        System.out.println("Result: "+dResult);
        
        dResult = stack.push("WEB PROGRAMMING");
        System.out.println("Result: "+dResult);
        stack.cetak();
        
        dResult = stack.push("AUTOMATA");
        System.out.println("Result: "+dResult);
        stack.cetak();
        
        dResult = stack.push("LINEAR ALGEBRA");
        System.out.println("Result: "+dResult);
        stack.cetak();
        
        dResult = stack.isEmpty();
        System.out.println("Result: "+dResult);
        
        dResult = stack.isFull();
        System.out.println("Result: "+dResult);

    }
}

package project;

public class Assign001 {
    public void assign1() {
        double valueD = 0.1;
        int valueI = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("valueI: " + valueI++);
            System.out.println("valueD: " + valueD++);
        }
        
        System.out.println("result");
        System.out.println("valueI: " + valueI);
        System.out.println("valueD: " + valueD);
    }
    
    public void assign2() {
        for(int i=0;i<4;i++){
            for(int j=0;j<3-i;j++){
                System.out.print(" "); 
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*"); 
            }
            System.out.println("");
        }
    }
}
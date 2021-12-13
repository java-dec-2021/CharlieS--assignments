import java.util.ArrayList;

public class BasicJava {
    public static void main(String[] args){
    
    }
    //Print 1-255
    public void OneTo255(){
        for(int i=0; i <= 255; i++)
            System.out.println(i);
    }
    //Print odd numbers between 1-255
    public void OddNumbers(){
        for(int i=0; i <= 255; i++){
            if(i % 2 != 0)
                System.out.println(i);
        }
    }
    //Sum to 255
    public int Sum255(int[] total){
        int sum = 0;
        for(int i = 0; i <= 255; i++){
            sum += total[i];
        }
        return sum;
    }
    //Iterate through array [1, 3, 5, 7, 9, 13]
    public void IterateArray(int[] arr) {
        for(int val: arr)
            System.out.println(val);
    }

    //Find Max in an array
    public int FindMax(int[] arr){
        int currentMax = Integer.MIN_VALUE;
        for(int val:arr){
            if(val > currentMax)
                currentMax = val;
        }
        return currentMax;
    }
    //Array with odd numbers 1 to 255
    public ArrayList<Integer> OddNumberArray(){
        ArrayList<Integer> number = new ArrayList<Integer>();
        for(int i = 0; i <= 255; i++){
            if(i % 2 != 0)
                number.add(i);
        }
        return number;
    }
}


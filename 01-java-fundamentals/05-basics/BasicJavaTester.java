public class BasicJavaTester {
    public static void main(String[] args){
        
        BasicJava test= new BasicJava();
        //1-255
        test.OneTo255();
        //255 odds
        test.OddNumbers();
        //Iterate Array
        int[] nums = {1, 3, 5, 7, 9, 13};
        test.IterateArray(nums);
        //Max Array
        int[] max = {1, 3, 5, 7, 9, 13};
        System.out.println("Max in array is:" + " " + test.FindMax(max));
        //Odd255Array
        System.out.println(test.OddNumberArray());
    }
    
}

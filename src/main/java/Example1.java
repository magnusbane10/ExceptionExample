public class Example1 {
    public static void main(String[] args)  {

       int[] myArray = {3, 4, 2};
        try {
            printarrayElement(myArray, 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end of program");
    }

    private static void printarrayElement(int[] intArray, int index) throws Exception{
        if (index<0 || index >=intArray.length){
            throw new Exception("Incorrect argument!");
        }
        System.out.println(intArray[index]);
    }
}


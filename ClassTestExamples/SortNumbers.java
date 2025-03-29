package ClassTestExamples;

public class SortNumbers {
    public static void main(String[] args) {
       int[] inputArray = new int[]{5,4,3}; //creating array with the values hardcoded
       int temp; //creating new variable
        for(int i=0;i<inputArray.length;i++)
        {
            for(int j=i+1;j<inputArray.length;j++)
            {
                if(inputArray[i]>inputArray[j])
                {
                    //swap
                    temp=inputArray[i];
                    inputArray[i]=inputArray[j];
                    inputArray[j]=temp;
                }
            }
        }
        for(int k=0;k<inputArray.length;k++){
            System.out.println(inputArray[k]);
        }
    }
}

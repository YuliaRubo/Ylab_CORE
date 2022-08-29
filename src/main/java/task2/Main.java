package task2;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] getSortNumber(int[]meArray){
        for(int i=0; i<meArray.length; i++){
            for(int j=i+1; j< meArray.length-1; j++){
                if(meArray[i]>meArray[j]){
                    int temp=meArray[i];
                    meArray[i]=meArray[j];
                    meArray[j]=temp;
                }
            }
        }
        return  meArray;
    }

}

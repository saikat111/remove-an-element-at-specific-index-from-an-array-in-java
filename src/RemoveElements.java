import java.util.Arrays;
class RemoveElements {
    public static void main(String args[]){
        int[] givenArray = {1,2,3,4};
        int indexNumber = 1;
        System.out.println(Arrays.toString(removeIndex(givenArray, indexNumber)));
    }
    static int[] removeIndex(int[] arr, int index){
        if(arr == null || index < 0 || index > arr.length){
            return arr;
        }
        int[] anotherArray = new int[arr.length-1];
        for(int i = 0, k = 0; i < arr.length; i++ ){
            if(i == index){
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }
}


public class sorting {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        // // Bubble sort 
        // int arr[]={7,8,3,1,2};
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-i-1;j++){
        //         if(arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }
        // printArray(arr);

        // selection sort
        // int arr[] ={7,8,3,1,2};
        // for(int i=0;i<arr.length-1;i++){
        //     int smallest = i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[smallest]>arr[j]){
        //             smallest=j;
        //         }
        //     }   
        //     int temp = arr[smallest];
        //     arr[smallest]=arr[i];
        //     arr[i]=temp;
        // }
        // printArray(arr);

        // finding the second largest element in an array 
        int arr[]={1,2,4,7,7,5};
        // int largest =arr[0];
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]>largest){
        //         largest = arr[i];
        //     }
        // }
        // System.out.println(largest);  // i got the largest element !
        // // now finding the second largest element ;
        // int secondl=-1;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>secondl && arr[i]!=largest){
        //         secondl = arr[i];
        //     }
        // }
        // System.out.println(secondl);

        // optimal solution 
        int largest =arr[0];
        int slargest = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(slargest);
    }
}

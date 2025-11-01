package LeetCodePractice.Sorting;

import java.util.Arrays;

class LC_912_Sort_an_Array {
    public static int[] sortArray(int[] nums) {
     
       if(nums==null || nums.length<=1){
        return nums;
       }

      sortArray(nums,0,nums.length-1);

       return nums;
    }
    private static void  sortArray(int [] nums ,int start,int end){

        if(start>=end){
            return;
        }

    int mid = start+(end-start)/2;

        sortArray(nums,start,mid);

         sortArray(nums,mid+1,end);

         merge(nums,start,mid,end);

    }

    private static int [] merge(int [] nums,int start,int mid,int end){

        int i = start;
        int j=mid+1;

        int k =0;

        int [] temp = new int [end - start + 1];

        while(i<=mid && j<=end){
            if(nums[i]<nums[j]){
                temp[k++]=nums[i++];
            }else{
                temp[k++]=nums[j++];
            }
        }

        while(i<=mid){
            temp[k++]=nums[i++];
        }
          while(j<=end){
            temp[k++]=nums[j++];
        }

        for(int p=0;p<temp.length;p++){
            nums[start+p]=temp[p];
        }

        return nums;
    }
    
    public static void main(String[] args) {
        int arr[] = {34, 76, 223, 12, 11, 89, 65, 45};

        System.out.println("Before sorting array:");
        System.out.println(Arrays.toString(arr));

        sortArray(arr, 0, arr.length - 1);

        System.out.println("After sorting array:");
        System.out.println(Arrays.toString(arr));
    }
}
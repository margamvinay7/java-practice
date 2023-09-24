class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int i=0,j=0;
        int[] result=new int[2];
        while(i<nums.length){
    
            if(i==j){

            }
            else if(((nums[i]+nums[j])==target)){
        
                System.out.println("entered");
                result[0]=i;
                result[1]=j;
                break;
            }

            j++;
            if(j==nums.length){
                i++;
                j=0;
            }
        }
    
       return result;
    }

}

public class TwoSum {

public static void main(String[] args){

int arr[]={2,7,11,15};
int target=9;
int arr1[]={3,2,4};
int target1=6;
int arr2[]={3,3};
int target2=6;
Solution sum= new Solution();
 int[] sum1=sum.twoSum(arr,target);
 int[] sum2=sum.twoSum(arr1,target1);
 int[] sum3=sum.twoSum(arr2,target2);

 System.out.println(sum1[0]+" "+sum1[1]);
 System.out.println(sum2[0]+" "+sum2[1]);
 System.out.println(sum3[0]+" "+sum3[1]);


    }
    
}


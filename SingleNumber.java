/*  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 You must implement a solution with a linear runtime complexity and use only constant extra space.*/


 
public class SingleNumber {
public static void main(String[] args)
{
int[] nums={4,1,2,1,2};
System.out.println(singleNumber(nums));
}

public static int singleNumber(int nums[]){

int value=0;
for(int i=0;i<nums.length;i++){
    value=value^nums[i];
} return value;
}
}
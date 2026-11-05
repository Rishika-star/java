public class SubArray{
    public static void sub(int[] nums){
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] main){
        int[] nums={2,4,6};
        sub(nums);
    }
}

/*OUTER LOOP- i
1.Starting index decide karta hai.
int start = i;

MIDDLE LOOP-j
2.Ending index decide karta hai.
int end = j;

MIDDLE LOOP-k
3.Start se end tak elements print karta hai.

 
 Array: [2, 4, 6]
When i = 0, start = 0
j	Subarray
0	2
1	2 4
2	2 4 6


When i = 1, start = 1
j	Subarray
1	4
2	4 6


When i = 2, start = 2
j	Subarray
2	6
 
 */
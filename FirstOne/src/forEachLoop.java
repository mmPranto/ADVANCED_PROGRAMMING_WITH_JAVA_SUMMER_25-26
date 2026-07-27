public class forEachLoop {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        //traditional for loop
//        for(int i=0;i<nums.length;i++){
//            sum+=nums[i];
//        }
//        System.out.println("Traditional For Loop: " + sum);

        //For-Each version

        for(var x:nums){
            System.out.println("Value is : "+x);
            sum+=x;
        }
        System.out.println("Summation Result is : "+sum);
    }
}

public class ForEach2 {
    public static void main() {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int sum=0;

        for(var x:nums){
            System.out.println("value is : "+x);
            sum+=x;
            if(x==5)
                break;
        }
        System.out.println("First five value summation is : "+sum);
    }
}

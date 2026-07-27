public class ForEach3 {
    public static void main(String[] args){
        int sum=0;
        int[][] nums= new int[3][5];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=(i+1)*(j+1);
            }
        }

        for(int[] x:nums){
            for(int y:x){
                System.out.println("Value is :" + y);
                sum+=y;
            }
        }
        System.out.println("Summation Result is : "+sum);
    }
}

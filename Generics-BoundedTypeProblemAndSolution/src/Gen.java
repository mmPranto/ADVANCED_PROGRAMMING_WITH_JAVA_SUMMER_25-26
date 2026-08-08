public class Gen<T> {
    T[] nums;

    Gen(T[] nums){
        this.nums=nums;
    }

    double avg(){
        double sum=0.0;
        for(int i=0;i< nums.length;i++){
            sum = sum + nums[i];
        }
        return sum/ nums.length;
    }
}

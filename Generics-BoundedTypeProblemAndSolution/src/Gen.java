public class Gen<T extends Number> {
    T[] nums;

    Gen(T[] nums){
        this.nums=nums;
    }

    double avg(){
        double sum=0.0;
        for(int i=0;i< nums.length;i++){
            sum = sum + nums[i].doubleValue();
        }
        return sum/ nums.length;
    }

    boolean isSameAvg(Gen<?> ob){
        if(avg()==ob.avg()){
            return true;
        }
        return false;
    }
}

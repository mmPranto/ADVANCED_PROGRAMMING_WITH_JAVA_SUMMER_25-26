public class VarArgs {
    static void vaTest(int... v){
        System.out.print("Number of args: "+v.length+" Contents: " );

        for(var x:v){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}

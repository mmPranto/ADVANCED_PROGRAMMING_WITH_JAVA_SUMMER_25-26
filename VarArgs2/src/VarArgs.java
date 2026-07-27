public class VarArgs {
    static void vaTest(String msg,int... v){
        System.out.print(msg +v.length+" Contents: " );

        for(var x:v){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
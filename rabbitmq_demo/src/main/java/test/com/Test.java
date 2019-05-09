package test.com;

public class Test {

    public int JumpFloorII(int target) {
        if(target==0){
            return 0;
        }
        if(target==1){
            return 1;
        }
        return 2*JumpFloorII(target-1);
    }



    public static void main(String[] args) {
        System.out.println(new Test().JumpFloorII(4));
    }
}

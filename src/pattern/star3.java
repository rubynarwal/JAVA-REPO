package pattern;

public class star3 {
    public static void main(String[] args){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i>=2&&j>=2 && i<=3&&j<=3){
                    System.out.print("  ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

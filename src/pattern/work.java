package pattern;
import java.util.*;
public class work {

        public static void main(String[] args) {
            Scanner ruby = new Scanner(System.in);
            int t = ruby.nextInt();
            pattern(t);
        }
        public static void pattern(int t)
        {
            for(int p=1; p<=t; p++)
            {
                String counts="";

                for(int w=p; w<=t; w++)
                {
                    if(w==t)
                    {
                        counts+="*";
                    }
                    else
                    {
                        counts+="*"+" ";
                    }
                }
                for(int r=2; r<p*2; r++)
                {
                    counts+=" ";
                }
                System.out.println(counts);
            }
        }
    }


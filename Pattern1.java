import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
	       int test_cases = in.nextInt();
	       int count=1;
	       int space = test_cases -1;
	       int i,j,k,n;
	       for (i=1; i<=test_cases; i++){
	           for (k = 1;k<=space;k++)
	                System.out.print(" ");
	           j = i + count;
	           for(n=i;n<j;n++){
	               System.out.print(n);
	           }
	           System.out.println();
	           count++;
	           space--;
	       } 
	       
	       in.close();
	}

}

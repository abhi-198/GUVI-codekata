import java.util.*;

class GFG {
    static String commanSeq(String[] str,int size){
        StringBuilder comman = new StringBuilder();
        int i = 0;
        boolean flag = false;
        for(int k =0;k<str[0].length();k++){
            char ch = str[0].charAt(k);
            int n = size;
            while(n-- > 0){
                if(str[n].length()<=i || ch != str[n].charAt(i)){
                    flag = true;
                    break;
                }
            }
            i++;
            if(flag == true){
                break;
            }
            else{
                comman.append(ch);
            }
        }
        return comman.toString();
    }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String[] str = new String[n];
	        sc.nextLine();
	    for(int i=0;i<n;i++){
	        str[i]= sc.nextLine();
	    }
	    System.out.println(commanSeq(str,n));
	}
}

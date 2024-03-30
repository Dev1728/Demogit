import java.math.*;
class Client{
    public static String Decode(String M){
        // char even []= new char[(M.length()/2)];
        // char odd[]= new char[(M.length()/2)+1];

        // int k=0;
        // int l=0;
        // for(int i=0;i<M.length();i++){
        //     if(i<=M.length()/2){
        //         odd[k++]=M.charAt(i);
        //     }else{
        //         even[l++]=M.charAt(i);
        //     }
        // }

        // int m=0;
        // int n=0;
        // char finalString[]= new char[M.length()];
        // for(int i=0;i<finalString.length;i++){
        //     if((i)%2==0){
        //         finalString[i]=odd[m++];
        //     }else{
        //         finalString[i]=even[n++];
        //     }
        // }
        // String str=new String(finalString);
        // return new String(str.trim());
        

        int n = s.length();
        int i = 0;
        int j = n / 2;
        StringBuilder D = new StringBuilder();

        while (i <= n / 2 && j < n) {
            D.append(s.charAt(i++));
            D.append(s.charAt(j++));
        }

        if (j != n - 1) {
            for (; j < n; j++) {
                D.append(s.charAt(j));
            }
        }

        return D.toString();
        
    }
    public static void main(String [] args){
        String M="dslcoeet";

        System.out.println(Decode(M));
    }
}

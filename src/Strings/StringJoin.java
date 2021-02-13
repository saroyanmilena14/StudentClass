package Strings;

public class StringJoin {
    public static void main(String[] args) {

        String S1 = "abcd";
        String S2 = "cdef";
         int i;
         int j=0;
        boolean notequal = true;
        for ( i = 0; i < S1.length(); i++) {
            for (j = 0; j < S2.length(); j++) {
                if (S1.charAt(i) == S2.charAt(j)) {
                    notequal = false;
                    break;
                }
            }
        }
            if (notequal) {
                S1= S1+ S2.charAt(j);
            }
        System.out.println(S1);

    }
}
 //entadrutyamb kluces dax
// for(String s:strArr) senc petqa sarqel ,vorpes zangvac vor karoghnaas iteracia anes, ete es tesak for-n es ogtagorcum
import java.util.ArrayList;

public class CheckForValidation {
    public static int checkForInput(String inp) throws Exception {
        if(inp.trim().length()==0)
            return 0;
        ArrayList<Integer> arr = new ArrayList<>();
        int len = inp.toCharArray().length;
        int index=0;
        for (int i=0;i<inp.toCharArray().length;i++) {
            char c = inp.charAt(i);
            if((int) c >= 48 && (int) c <=57) {
                int base=( (int)c - 48);
                int increment=base;
                if(index!=0 && inp.charAt(index-1)=='-') {
                    while (i+1 < len && inp.charAt(i+1) >= 48 && inp.charAt(i+1) <= 57 ) {
                        increment += (increment*10)+(inp.charAt(i+1) - 48);
                        i++;
                    }
                    arr.add( -1*increment );
                } else {
                    while (i+1 < len && inp.charAt(i+1) >= 48 && inp.charAt(i+1) <= 57 ) {
                        increment += (increment*10)+(inp.charAt(i+1) - 48);
                        i++;
                    }
                    arr.add( increment );
                }

            }
            index++;
        }
        return addValues(arr);
    }

    public static int addValues(ArrayList<Integer> arr) throws Exception {
        int sum=0;
        boolean isAnyNegative=false;
        String negatives="";
        for(int i : arr) {
            if(i < 0) {
                isAnyNegative = true;
                negatives+=i + " ";
            }
            else if(i > 1000) {
                continue;
            }
            sum+=i;
        }
        if(isAnyNegative){
            throw new Exception("negative values found : " + negatives );
        }
        return sum;
    }
}

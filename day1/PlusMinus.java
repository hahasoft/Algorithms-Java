public class PlusMinus {

    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(-4,3,-9,0,4,1);
               
    }

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
         float p=0;
        float n=0;
        float z=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == 0){
                z++;
            }
            else{
                if(arr.get(i) > 0){
                    p++;
                }
                else{
                    n++;
                }
            }
        }
        p/= arr.size();
        n/= arr.size();
        z/= arr.size();
        System.out.println(p);
        System.out.println(n);
        System.out.println(z);
    }

}

}
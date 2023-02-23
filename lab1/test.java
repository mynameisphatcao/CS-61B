public class test {
    public static int[] windowPosSum(int[] a, int n){
        int lent=a.length;
        for (int i=0;i<lent;i+=1){
            int summ =0;
            for (int k=i;k<=i+n;k+=1){
                if (k<lent ){
                        summ += a[k];
                    }
                else{
                    break;
                }
            }
            if (a[i]>0){
            a[i]=summ;
            }
            else{
                continue;
            }
        }
        return a;
    }
    public static void main(String[] args){
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a,n);
        System.out.println(java.util.Arrays.toString(a));



    }





}

import java.util.*;

public class memome;

class operations{
    public int mean(int a[]){
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            sum = sum + a[i];
        }
        return sum/a.length;
    }
    public int median(int a[]){
        int temp;
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[a.length/2];
    }
    public int mode(int a[]){
        int rep_count = 0;
        int m[] = new int[a.length];


        for(int i = 0;i<a.length;i++){
            rep_count = 0;
            for(int j = i+1;j<a.length;j++){
                if(a[i] == a[j] && a[i] != -1){
                    a[j] = -1;
                    rep_count+=1;
                }
            }
            m[i] = rep_count;
        }
        int mode_ind = 0;
        for(int i = 0;i<a.length;i++){
            if(m[i] >= m[mode_ind]){
                mode_ind = i;
            }
        }
        return a[mode_ind];
    }
}

public class DAY3MEANMEDIANMODE{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        operations op = new operations();

        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int mean = op.mean(arr);
        int median = op.median(arr);
        int mode = op.mode(arr);

        System.out.println("MEAN : " + mean);
        System.out.println("MEDIAN  : " + median);
        System.out.println("MODE : " + mode);

    }
}
{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A : ");
        int a = sc.nextInt();

        System.out.println("Enter B : ");
        int b = sc.nextInt();

        int is_negetive = 0, count = 0;

        if(a < 0 || b < 0){
            is_negetive = 1;
        }

        System.out.println("COMPOSITE NUMBERS : ");
        if(a < b){
            for(int i = a+1; i<b;i++){
                count = 0;
                for(int j  = 1; j<=i;j++){
                    if(i%j == 0){
                        count = count+1;
                    }
                }
                if(count > 2){
                    System.out.print(i + "\t");
                }
            }
        }
        else if(a > b){
            for(int i = b+1; i<a;i++){
                count = 0;
                for(int j  = 1; j<=i;j++){
                    if(i%j == 0){
                        count = count+1;
                    }
                }
                if(count > 2){
                    System.out.print(i + "\t");
                }
            }
        }
        else if(a == b){
            System.out.println("Enter a VALID Range");
        }



        if(is_negetive == 1){
            System.out.println("\nEnter a VALID Range. Composite Numbers cannot be NEGETIVE. ");
        }
    }
}

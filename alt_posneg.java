package practice;

public class alt_posneg {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, -4, -1, 4};

        int pos[] = new int[a.length];
        int neg[] = new int[a.length];

        int p = 0, n = 0;

        
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0)
                pos[p++] = a[i];
            else
                neg[n++] = a[i];
        }

        
        for (int i = 0; i < p || i < n; i++) {
            if (i < p) 
                System.out.print(pos[i] + " ");
            if (i < n)
                System.out.print(neg[i] + " ");
        }
    }
}
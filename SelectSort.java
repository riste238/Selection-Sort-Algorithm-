public class SelectSort {
    private long[] a;
    private int elements;

    public SelectSort(int max){
        a = new long[max];
        elements = 0;
    }

    public void display(){
        for (int j = 0; j<elements; j++)
            System.out.println("Show every element that belong on the array " + a[j]);
        System.out.println("");
    }
    public void insert(long value){
        a[elements] = value;
        elements++;
    }
    public void selectionSort(){

      int out, in, lowest;

        for (out = 0; out<elements-1; out++) {
            lowest = out;
            for (in = out + 1; in < elements; in++)
                if (a[in] < a[lowest])
                    lowest = in;
            swap(out, lowest);
        }
    }
     public void swap(int out, int lowest){
        long temporary = a[out];
        a[out] = a[lowest];
        a[lowest] = temporary;
     }
}

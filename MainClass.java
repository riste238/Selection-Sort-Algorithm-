public class MainClass {

    public static void main(String[] args) {
        int max = 50;
        SelectSort arr;
        arr = new SelectSort(max);

        arr.insert(77);
        arr.insert(44);
        arr.insert(86);
        arr.insert(17);
        arr.insert(90);
        arr.insert(32);
        arr.insert(54);
        arr.insert(60);
        arr.insert(10);
        arr.insert(23);

        arr.display();
        arr.selectionSort();
        arr.display();
    }
}

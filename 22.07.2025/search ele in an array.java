public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int key = 30, found = -1;
        for(int i=0; i<arr.length; i++)
            if(arr[i] == key) found = i;
        System.out.println(found != -1 ? "Found at index " + found : "Not found");
    }
}

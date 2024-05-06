
public class Arrays {

    public Arrays() {
    }

    public void insert(int arr[], int index, int element) {
        arr[index] = element;
    }
    
    public boolean delete(int arr[], int element){
        for (int i = 0; i < arr.length; i++) {
            if(element==arr[i]){
                arr[i]=0;
                return true;
            }
        }
        return false;
    }
    
    public boolean update(int arr[],int index, int newElement){
        if(arr.length!=0){
            arr[index]=newElement;
            return true;
        }
        return false;
    }
    
    public void traversal(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public int LinearSearch(int arr[], int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return 1;
            }
        }
        return -1;
    }

    public int binarySearch(int arr[], int F_Index, int L_Index, int element) {
        while (F_Index <= L_Index) {
            int middle = (F_Index + L_Index) / 2;

            if (element == arr[middle]) {
                return middle;
            } else if (element < arr[middle]) {
                L_Index = middle - 1;
            } else {
                F_Index = middle + 1;
            }
        }
        return -1;
    }
}

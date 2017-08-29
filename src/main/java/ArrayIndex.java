
public class ArrayIndex {

    public static void main(String[] args) {

        Integer[] arr = {2,32,2,2,2,3,0,3,4,5};
        Integer[] arr1 = {2,3};
        ArrayIndex main = new ArrayIndex();
        System.out.println(main.searchEntrance(arr, arr1));

    }


    public int searchEntrance(Integer[] arr, Integer[] arr1) {
        int index = -1;
        int arr2Index = 0;
        boolean checking = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr2Index > 0) checking = true;
            boolean started;
            if (arr1.length > arr2Index && arr[i] == arr1[arr2Index]) {
                started = true;
                arr2Index++;
            } else {
                if (arr[i] != arr1[arr2Index] && arr2Index > 0 && arr1[arr2Index - 1] == arr[i]) {
                    if (arr1[arr2Index - 1] == arr[i])
                    index++;
                    started = false;
                } else if (arr1.length > arr2Index && arr[i] == arr1[arr2Index]) {
                    started = true;
                    arr2Index++;
                } else {
                    index = -1;
                    arr2Index = 0;
                    started = false;
                }
            }
            if (started && !checking) index = i;
            checking = false;
            if (arr1.length == arr2Index) return index;
        }
        return index;
    }
}


/*
* int index = -1;
        int arr2Index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean started;
            if (arr1.length > arr2Index && arr[i] == arr1[arr2Index]) {
                started = true;
                arr2Index++;

            } else {
                arr2Index = 0;
                if (arr1.length > arr2Index && arr[i] == arr1[arr2Index]) {
                    started = true;
                    arr2Index++;
                } else {
                    index = -1;
                    started = false;

                }
            }
            if (started) index = i;
            if (arr1.length == arr2Index) return index - (arr1.length - 1);
        }

        return index;
* */
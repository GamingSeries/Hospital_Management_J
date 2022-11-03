public class SelectionSort{
    public static void selectionsort(int[] arr) {
        for(int i = 0; i < arr.length; i++)
        {
            int index = i; 
            for (int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[index])
                {
                    index = j;
                }
            }

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before Selection Sort");
        for(int i : arr1)
        {
            System.out.println(i + " ");
        }

        selectionsort(arr1);
        System.out.println("After Selection Sort");
        for (int i = 0; i < arr1.length; i++)
        {
            System.out.println(arr1[i] + "");
        }
    }
}
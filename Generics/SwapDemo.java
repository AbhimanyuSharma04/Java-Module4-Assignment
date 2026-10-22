public class SwapDemo {
    static <T> void swapElements(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] nums = {10, 20, 30};
        swapElements(nums, 0, 2);
        System.out.print("int array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        String[] names = {"Abhimanyu", "Rohit", "Kavya"};
        swapElements(names, 0, 1);
        System.out.print("string array: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
    }
}

    public class Main {
        public static int linearSearch(int[] array, int target) {

            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int[] numbers = {5, 3, 8, 1, 2, 7};
            int target = 1;

            int index = linearSearch(numbers, target);
            if (index != -1) {
                System.out.println("Элемент " + target + " найден на позиции: " + index);
            } else {
                System.out.println("Элемент " + target + " не найден в массиве: " + index);
            }
        }
    }

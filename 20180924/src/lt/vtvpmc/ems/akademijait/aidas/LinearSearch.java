package lt.vtvpmc.ems.akademijait.aidas;

public class LinearSearch {
        public static void main(String[] args) {
            int[] arr = new int[]{12, 5, 10, 15, 31, 20, 25, 2, 40};
            int searchNumber = 78;
            System.out.println(searchNumber);
            long startTime = System.currentTimeMillis();
            linearSearch(arr, searchNumber);
            long endTime = System.currentTimeMillis();
            System.out.println("linearSearch vykdymo trukme " + (endTime - startTime));
        }

        public static int linearSearch (int [] arr, int searchNumber) {
            int size = arr.length;
            for (int i = 0; i < size; i++ ) {
                if (arr[i] == searchNumber) {
                        return i;
                    }
                }
                 return -1;
        }

//    public static int linearSearchTwo (int [] arr, int searchNumber) {
//        int size = arr.length;
//        for (int i = 0; i < size; i++ ) {
//            if (arr[i] == searchNumber) {
//                return linearSearchTwo (arr, searchNumber);
//            }
//        }
//        return -1;
//    }

    }

public class Main {
    public static void main(String[] args) {
        //task1
        //1
        int[] arr1 = new int[]{1, 2, 3};
        //2
        double[] arr2 = {1.57, 7.654, 9.986};
        //3
        boolean[] arr3 = {true, false};
        //task2
        /*for (int i = 0; i < arr1.length; i++) {
            if(i==arr1.length-1) {
                System.out.println(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        for (int i = 0; i < arr2.length; i++) {
            if(i==arr2.length-1) {
                System.out.println(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        for (int i = 0; i < arr3.length; i++) {
            if(i==arr3.length-1) {
                System.out.println(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }*/

        //task3

        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }

        //task4

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]%2!=0){
                arr1[i]+=1;
            }
        }
        System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2]);

    }
}


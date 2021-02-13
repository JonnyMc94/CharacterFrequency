import java.util.Scanner;

class NumOfOccurrences
{


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();

        int [] countArr = new int [len];
        char [] characterArr = str.toCharArray();


        for (int i = 0; i < len; i++) {
            countArr[i] = 1;
        }

        for(int i = 0; i<len; i++) {
            for ( int j = i+1; j<len; j++) {
               if (characterArr[i] == characterArr[j]) {
                    countArr[i]++;
                    countArr[j] = -50;
               }
            }

        }


        bubblesort(len, characterArr, countArr);

        for (int i = 0; i<len; i++) {
            if (countArr[i] > 0)
            System.out.println( characterArr[i] + " " + countArr[i]);
        }
    }

    public static void bubblesort(int length, char[] arrC, int[] arrI) {

        for (int i  = 0; i < arrI.length; i++) {
            for (int j = i+1; j<arrI.length; j++) {
                if ((arrI[i] < arrI[j]) ||
                        (arrI[i] == arrI[j] && arrC[i] > arrC[j])){
                    swap(arrI, arrC, i, j);
                }
            }
        }
    }

    public static void swap(int[] arrI, char[] arrC, int i, int j){
        int temp = arrI[i];
        arrI[i] = arrI[j];
        arrI[j] = temp;

        char temp1 = arrC[i];
        arrC[i] = arrC[j];
        arrC[j] = temp1;

    }




}


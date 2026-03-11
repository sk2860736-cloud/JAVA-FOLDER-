package LECTURE09;

public class day09 {
    public static void main(String[] args) {
        int[] rollNum = new int [3];

        // rollnum [0] = 101;
        // rollnum [1] = 102;
        // rollnum [2] = 103;

        // System.out.println(rollnum[0]);
        // System.out.println(rollnum[1]);
        // System.out.println(rollnum[2]);

        int x = 101;
        for(int i = 0; i<rollNum.length; i++ ){
        rollNum [i] = x;
        x++;
        }
        for(int i = 0; i<rollNum.length; i++ ){
            System.out.println(rollNum[i]);
    }
    
    }}

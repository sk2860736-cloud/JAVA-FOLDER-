package LECTURE09;

public class day09second {
    public static void main(String[] args){     
    
    // multidimensional 2D aarays 
    // int [] [] marks = new int [3] [3];
    // marks [0] [0] = 23;
    // marks [0] [1] = 30;
    // marks [0] [2] = 40;

    // marks [1] [0] = 34;
    // marks [1] [1] = 30;
    // marks [1] [2] = 34;

    // marks [2] [0] = 36;
    // marks [2] [1] = 37;
    // marks [2] [2] = 30;

    // for(int row=0; row<marks.length; row++){
    //     for(int col=0; col<marks[row].length; col++){
    //     System.out.print(marks[row][col]+ " ");
    // }
    // System.out.println();
    // }  

// multidimensional arrays ---> each with different /

// int [] [] marks = new int [3] [] ;

// marks [0] = new int [1];
// marks [1] = new int [2];
// marks [2] = new int [3];

// marks [0] [0] = 23;

// marks [1] [0] = 23;
// marks [1] [1] = 23;

// marks [2] [0] = 23;
// marks [2] [1] = 23;
// marks [2] [2] = 23;


// for(int row=0; row<marks.length; row++){
//     for(int col=0; col<marks[row].length; col++){
//     System.out.print(marks[row][col]+ " ");
//     }
//     System.out.println();
// }

// 2D arrays . multidimensional  

int [] [] marks = {
    {12,34,54},
    {34,54,25},
    {34,54,44}
    
};

for(int row=0; row<marks.length; row++){
    for(int col=0; col<marks[row].length; col++){
    System.out.print(marks[row][col]+ " ");
    }
    System.out.println();
}


}
}

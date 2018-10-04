/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author aytacakkaya
 */
public  class ArrayDeclareInitialize {

    /*
    dataType[] arrayRefVar; preferred way   or   dataType arrayRefVar[] works but not preffered way;  
    dataType[] arrayRefVar = new dataType[arraySize];
    dataType[] arrayRefVar = {value0, value1, ..., valuek};    
    
     Dizi bildirimi ile, parantezleri tanımlayıcının sağına veya soluna yerleştirebilirsiniz. int [] myScores []; 
     */
    public int a[];
    static int[] b;
    public final int[] s = null;
    // public [] int c;
    //private int e[3];
    //private int d[3][];
    
    static final void m1(){}
    
    
    public static void main(String[] args) {
        /*
        int[] list1 = {0, 1, 2, 3};
        int[] list5 = new int[4];
        String[] list2 = {"1", "2", "3"};
        //int[] list3 ={"1","2","3"};
        int[] list3[];
        //int[6] list4;
        String myStr[];
        //String myStr2[1];
        float f1 = -342;
        float f2 = 0x12345;

        String[][] argCopy = new String[2][2];
        int x;
        argCopy[0] = args;
        x = argCopy[0].length;
        for (int y = 0; y < x; y++) {
            System.out.print(" " + argCopy[0][y]);
        }
         */
        
        m1();

        //public int a [3] wrong;
        int[][][] x = new int[3][][];
        int i, j;
        x[0] = new int[4][];
        x[1] = new int[2][];
        x[2] = new int[5][];
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++) {
                x[i][j] = new int[i + j + 1];
                System.out.println("size = " + x[i][j].length);
            }
        }
        
        int[]ia=new int[15];
        

    }
}

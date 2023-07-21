class adj{
public static void main(String args[]){
    int a[][]={{2,2},{6,8}};
    int b[][]=new int[2][2];
    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        b[0][0]=a[1][1];
        b[0][1]=(-a[0][1]);
        b[1][0]=(-a[1][0]);
        b[1][1]=a[0][0];
        System.out.print(b[i][j]);
        System.out.print(" ");  
      }      
      System.out.println();
    }
    System.out.println(); 
    //int c[][]=new int[2][2];
    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        //c[i][j]=b[i][j]/4;
        System.out.print((double) b[i][j]/4);
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
import java.io.*;

class array{
  public static void main(String args[])throws IOException{
  DataInputStream ob=new DataInputStream(System.in);
  int i,j,k=0;
  System.out.println("Enter value for a 4*4 double dimensional array");
  int a[][]=new int[10][10];
  int b[]=new int[20];
  for(i=0;i<4;i++){
    for(j=0;j<4;j++)
      a[i][j]=Integer.parseInt(ob.readLine());
    }
    for(i=0;i<4;i++){
      for(j=0;j<4;j++){
        b[k]=a[i][j];
        k++;
      }
    }
  System.out.println();
  for(i=0;i<k;i++)
  System.out.print(b[i]+" ");
  }
}

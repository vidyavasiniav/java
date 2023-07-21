import java.util.*;
class arr{
void display(){
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int i;
int j;
Scanner s=new Scanner(System.in);
for(i=0;i<3;i++){
for(j=0;j<3;j++){
a[i][j]=s.nextInt();
}}
for(i=0;i<3;i++){
for(j=0;j<3;j++){
b[1][1]=a[1][1];
b[0][0]=a[0][0]+a[1][1];
b[0][2]=a[0][2]+a[1][1];
b[2][0]=a[2][0]+a[1][1];
b[2][2]=a[2][2]+a[1][1];
}}
System.out.println();
for(i=0;i<3;i++){
for(j=0;j<3;j++){
System.out.print(b[i][j]+" ");
}
System.out.println();
}
}}
class arr1{
public static void main(String args[]){
arr x=new arr();
x.display();
}}
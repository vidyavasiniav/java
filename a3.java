import java.util.*;
class a3{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int r=s.nextInt();
int c=s.nextInt();
int a[][]=new int[r][c];
int i;
int j;
for(i=0;i<r;i++){
for(j=0;j<c;j++){
a[i][j]=s.nextInt();
}}
for(i=0;i<r;i++){
for(j=0;j<c;j++){
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println();
for(i=0;i<r;i++){
for(j=0;j<c;j++){
if(i==0&&j==0){
System.out.print(a[1][2]+" ");
}
if(i==0&&j==1){
System.out.print(a[0][3]+" ");
}
if(i==0&&j==2){
System.out.print(a[1][3]+" ");
}
if(i==0&&j==3){
System.out.println(a[2][2]+" ");
}
if(i==1&&j==0){
System.out.print(a[0][0]+" ");
}
if(i==1&&j==1){
System.out.print(a[0][2]+" ");
}
if(i==1&&j==2){
System.out.print(a[1][1]+" ");
}
if(i==1&&j==3){
System.out.println(a[0][1]+" ");
}
if(i==2&&j==0){
System.out.print(a[3][0]+" ");
}
if(i==2&&j==1){
System.out.print(a[2][0]+" ");
}
if(i==2&&j==2){
System.out.print(a[3][2]+" ");
}
if(i==2&&j==3){
System.out.println(a[2][3]+" ");
}
if(i==3&&j==0){
System.out.print(a[2][1]+" ");
}
if(i==3&&j==1){
System.out.print(a[1][0]+" ");
}
if(i==3&&j==2){
System.out.print(a[3][1]+" ");
}
if(i==3&&j==3){
System.out.print(a[3][3]+" ");
}
}}

}}
public class Main {
   public static void main(String args[]){
      int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      int top = 0;
      int bottom = a.length-1;
      int left = 0;
      int right = a[0].length-1;
      while(top <= bottom && left <= right){
         for (int i = top; i <= right; i++) {
            System.out.print(a[top][i] + " ");
         }
         for (int i = top+1; i <= bottom; i++) {
            System.out.print(a[i][right] + " ");
         }
         if(top+1 <= bottom){
            for (int i = right-1; i >= left; i--) {
               System.out.print(a[bottom][i] + " ");
            }
         }
         if(left+1 <= right){
            for (int i = bottom-1; i > top; i--) {
               System.out.print(a[i][left] + " ");
            }
         }
         top++;
         bottom--;
         left++;
         right--;
      }
   }
}

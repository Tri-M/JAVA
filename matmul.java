    public class Main  
    {    
        public static void main(String[] args) {    
            int m,n,p,q;  
            int a[][] = {    
                              {1, 3, 2},    
                              {3, 1, 1},    
                              {1, 2, 2}    
                           };    
              int b[][] = {    
                              {2, 1, 1},    
                             {1, 0, 1},    
                             {1, 3, 1}    
                         };    
           m = a.length;    
           n = a[0].length;    
                
             p = b.length;    
            q = b[0].length;    
                
                       if(n!=p){    
                System.out.println("Matrices cannot be multiplied");    
            }    
            else{    
                int prod[][] = new int[m][q];    
                for(int i = 0; i < m; i++){    
                    for(int j = 0; j < q; j++){    
                        for(int k = 0; k < q; k++){    
                           prod[i][j] = prod[i][j] + a[i][k] * b[k][j];     
                        }    
                    }    
                }    
                    
                System.out.println("Product of two matrices: ");    
                for(int i = 0; i < m; i++){    
                    for(int j = 0; j < q; j++){    
                       System.out.print(prod[i][j] + " ");    
                    }    
                    System.out.println();    
                }    
            }    
        }    
    }    

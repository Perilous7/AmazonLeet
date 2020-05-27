//link: https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix/0
public class Spirally_traversing_a_matrix {
    public static void display(int row, int col, int[][] arr){
        int top=0, bot = row-1, left =0,right = col-1, dir=0;
        while(top<=bot&&left<=right){
            if(dir==0){
                for(int i =left;i<=right;i++){
                    System.out.println(arr[top][i]);
                }
                top++;
                dir=1;
            }
            else if(dir==1){
                for(int i =top;i<=bot;i++){
                    System.out.println(arr[i][right]);
                }
                right--;
                dir=2;
            }
            else if(dir==2){
                for(int i =right;i>=left;i--){
                    System.out.println(arr[bot][i]);
                }
                bot--;
                dir=3;
            }
            else if(dir==3){
                for(int i =bot;i>=top;i--){
                    System.out.println(arr[i][left]);
                }
                left++;
                dir=0;
            }

        }


    }
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        display(4,4,array);

    }
}

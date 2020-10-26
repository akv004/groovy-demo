public class RoateImage {

    public static void main(String args[]){
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10,11,12},
                {13,14,15,16},
        };
        rotateImage(matrix);

        System.out.println(matrix);

    }
    static void rotateImage(int[][] image){
       int n = image.length;
        for(int layer=0; layer<image.length/2; layer++){
            int first = layer;
            int last = n-layer-1;
            System.out.println("first:"+ first + ",last" + last);

            for(int i=first; i< last; i++){
                int offset = i-first;
               System.out.println(image[last-offset][first]);
                int temp = image[first][i]; //save top
                //left -> top
                //image[first][i]= image[last-offset][first];
            }



        }

    }
}

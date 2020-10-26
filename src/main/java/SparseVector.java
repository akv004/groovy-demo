import javax.xml.parsers.SAXParser;
import java.util.Vector;

class SparseVector {
    int[] nums;

    SparseVector(int[] nums) {
        this.nums = nums;
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int dotProduct = 0;
        for (int i = 0; i < vec.nums.length; i++) {
            dotProduct += this.nums[i] * vec.nums[i];
        }
        return dotProduct;
    }

    public static void main(String args[]) {

        SparseVector v1 = new SparseVector(new int[]{1, 0, 0, 2, 3});
        SparseVector v2 = new SparseVector(new int[]{0, 3, 0, 4, 0});
        System.out.println(v1.dotProduct(v2));
    }
}
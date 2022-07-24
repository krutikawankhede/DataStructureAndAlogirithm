import Arrays.MajorityElement;
import Arrays.QuickFind;

public class MainClass {

    public static void main(String args[]){
        /*QuickFind quickFind = new QuickFind(10);
        quickFind.union(9,3);
        quickFind.quickFind(9,3);*/

        MajorityElement majorityElement = new MajorityElement();
        int arr[] = new int[]{1,4,4,4,6,7};
        System.out.println(majorityElement.majorityElement(arr));
    }
}

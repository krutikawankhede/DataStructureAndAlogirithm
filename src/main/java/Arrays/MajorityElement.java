package Arrays;

public class MajorityElement {

    public int majorityElement(int arr[]){
        int ansIndex = 0;
        int count=1;
        for(int i=1; i< arr.length; i++ ){
            if(arr[ansIndex]==arr[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                ansIndex=i;
                count=1;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(i!=ansIndex) {
                if (arr[i] == arr[ansIndex]) {
                    count++;
                }
            }
        }

        System.out.println(count);
        if(count>2)
        {
            return arr[ansIndex];
        }
        return 0;

    }
}

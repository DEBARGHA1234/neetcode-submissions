class Solution {
    public int[] replaceElements(int[] arr) {
        int current=0;      
        while(current<arr.length-1){
            int max=current+1;
            int itr=current+1;
            while(itr<arr.length){
                if(arr[itr]>arr[max] ){
                    max=itr;   
                }
                itr++;
            }
            arr[current]=arr[max];
            current++;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
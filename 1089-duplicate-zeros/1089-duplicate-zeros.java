class Solution {
    public void duplicateZeros(int[] arr) {
        int s=0,
            d=0;
        int dest[]=new int[arr.length];
        while(d<arr.length){
            if(arr[s]==0){
                if(d<arr.length){
                    dest[d]=0;
                }
                d+=1;
                if(d<arr.length){
                    dest[d]=0;
                }
            }else{
                if(d<arr.length){
                    dest[d]=arr[s];
                }
            }
            s++;
            d++;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=dest[i];
        }
    }
}
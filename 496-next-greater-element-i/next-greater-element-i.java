class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n1=nums1.length;
        int n2=nums2.length;
        Stack<Integer>st=new Stack<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>st.peek()){
                st.pop();
            }if(st.isEmpty()){
                map.put(nums2[i],-1);
            }else {
                map.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        int ans[]=new int[n1];
        for(int i=0;i<n1;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}
    //    int n1=nums1.length;
    //    int n2=nums2.length;
    //    int ans[]=new int[n1];
    //    for(int i=0;i<n1;i++){
    //     ans[i]=-1;
    //     int idx=-1;
    //     for(int j=0;j<n2;j++){
    //         if(nums2[j]==nums1[i]){
    //             idx=j;
    //             break;
    //         }
    //     }
    //     for(int j=idx+1;j<n2;j++){
    //         if(nums2[j]>nums1[i]){
    //             ans[i]=nums2[j];
    //             break;
    //         }
    //     }
    //    }
    //    return ans; 
//     }
// }
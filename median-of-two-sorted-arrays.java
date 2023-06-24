class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] new_arr = new int[n];

        int i=0, j=0, k=0;

        while (i<=n1 && j<=n2) {
            if (i == n1) {
                while(j<n2) new_arr[k++] = nums2[j++];
                break;
            } else if (j == n2) {
                while (i<n1) new_arr[k++] = nums1[i++];
                break;
            }

            if (nums1[i] < nums2[j]) {
                new_arr[k++] = nums1[i++];
            } else {
                new_arr[k++] = nums2[j++];
            }
        }

        if (n%2==0) return (float)(new_arr[n/2-1] + new_arr[n/2])/2;
        else return new_arr[n/2];

      ///or 


        int[] mergedNums = new int [nums1.length + nums2.length ];
        int i = 0;
        int j = 0;
        int k = 0;

		while(i<nums1.length && j <nums2.length ) {
			if(nums1[i]<nums2[j]) {
				mergedNums[k] = nums1[i];
				i++;
            }else {
				mergedNums[k] = nums2[j];
				j++;
			}
			k++;
		}
        while(i<nums1.length) {
			mergedNums[k] = nums1[i];
			i++;
            k++;
		}
		while(j<nums2.length) {
			mergedNums[k] = nums2[j];
			j++;
            k++;	
		}
		if(mergedNums.length%2 == 0) {
            return ((double)mergedNums[mergedNums.length/2] + (double)mergedNums[mergedNums.length/2 - 1])/2;

		}
		return (double)mergedNums[mergedNums.length/2];
    }
}

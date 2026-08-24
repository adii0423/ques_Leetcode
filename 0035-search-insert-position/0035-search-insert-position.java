class Solution {
        public int searchInsert(int[] nums, int target) {
                int n = nums.length;
                        
                                for (int i = 0; i < n; i++) {
                                            // If we find the number, or find a number bigger than target,
                                                        // this is the exact index where the target belongs!
                                                                    if (nums[i] >= target) {
                                                                                    return i;
                                                                                                }
                                                                                                        }
                                                                                                                
                                                                                                                        // If the target is bigger than every number in the array,
                                                                                                                                // it belongs at the very end.
                                                                                                                                        return n;
                                                                                                                                            }
                                                                                                                                            }


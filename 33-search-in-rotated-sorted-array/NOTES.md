if (nums[start] <= nums[mid]){
if (target < nums[mid] && target >= nums[start])
end = mid - 1;
else
start = mid + 1;
}
if (nums[mid] <= nums[end]){
if (target > nums[mid] && target <= nums[end])
start = mid + 1;
else
end = mid - 1;
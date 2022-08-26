int mid = (start + (end-start)/2) + 1;
// use division instead of multiplication to avoid overflow
int div = x/mid;
if(div == mid) return mid;
if(div > mid) start = mid;
else end = mid-1;
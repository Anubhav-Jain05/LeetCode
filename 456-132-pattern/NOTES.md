int size = nums.size();
int mini = nums[0];
for(int i = 0; i < size; i++){
for(int j = i + 1 ; j < size; j++){
if(mini < nums[j]  && nums[j] < nums[i]){
return true;
}
mini = min(mini,nums[i]);
}
}
return false;
Stack <Integer> stack = new Stack ();
int second = Integer.MIN_VALUE;
for (int i = nums.length - 1; i >= 0; i--) {
if (nums [i] < second)
return true;
while (!stack.isEmpty() && nums [i] > stack.peek ())
second = stack.pop ();
stack.push (nums [i]);
}
return false;
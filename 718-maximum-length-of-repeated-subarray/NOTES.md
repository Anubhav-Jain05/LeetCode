int res = 0;
for (int i = 0; i < A.length; i++) {
for (int j = 0; j < B.length; j++) {
if (A[i] == B[j]) {
int k = 1;
while (i + k < A.length && j + k < B.length && A[i + k] == B[j + k]) k++;
res = Math.max(res, k);
}
}
}
return res;
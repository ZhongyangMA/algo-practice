package practice;

public class Main {

    public static class Solution {
        public static int solution(int[] A) {
            // write your code in Java SE 8
            int len = A.length;
            int[] temp1 = new int[len];
            int[] temp2 = new int[len];
            int t1 = 0;
            int t2 = 1;
            for(int i = 0; i < len; i++) {
                temp1[i] = t1;
                temp2[i] = t2;
                if(t1 == 0) {
                    t1 = 1;
                } else {
                    t1 = 0;
                }
                if(t2 == 0) {
                    t2 = 1;
                } else {
                    t2 = 0;
                }
            }
            // temp1 temp2

            int count1 = 0;
            int count2 = 0;
            for(int i = 0; i < len; i++) {
                if(A[i] != temp1[i]) {
                    count1++;
                }
                if(A[i] != temp2[i]) {
                    count2++;
                }
            }
            return count1 < count2 ? count1 : count2;
        }
    }

    public static void main(String[] args) {
        int[] A = {1,0,1,0,1,1};
        int res = Solution.solution(A);
        System.out.println(res);
    }

}

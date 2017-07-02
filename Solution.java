/**
 * 633. Sum of Square Numbers

Given a non-negative integer c, your task is to decide whether
there're two integers a and b such that a2 + b2 = c.

Example 1:

Input: 5
Output: True
Explanation: 1 * 1 + 2 * 2 = 5

Example 2:

Input: 3
Output: False
 *
 */
public class Solution {

  public boolean judgeSquareSum(int c) {
    int sqrt = (int) Math.sqrt(c);
    boolean found = false;
    
    for(int i = 0; (i <= sqrt) && !found; i++) {
      for(int j = sqrt; (j >= 0) && !found; j--) {
        int current = i*i + j*j;
        if(current == c) {
          found = true;
        } else if(current < c) {
          break;
        }
      }
    }
    return found;
  }
  
  public static void main(String[] args) {
    Solution s = new Solution();
    int i = 5;
    int j = 3;
    int k = 2147482647;
    int l = 8;
    
    System.out.println("l:" + l + " " + s.judgeSquareSum(l));
    System.out.println("i:" + i + " " + s.judgeSquareSum(i));
    System.out.println("j:" + j + " " + s.judgeSquareSum(j));
    System.out.println("k:" + k + " " + s.judgeSquareSum(k));
    
  }
}

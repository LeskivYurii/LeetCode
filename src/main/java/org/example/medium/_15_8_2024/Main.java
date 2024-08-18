package org.example.medium._15_8_2024;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{10,2,-5};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i : asteroids) {
            if (!stack.isEmpty() && i < 0 && stack.peekLast() > 0) {
                while (!stack.isEmpty() && stack.peekLast() > 0) {
                    if(stack.peekLast() + i < 0) {
                        stack.pollLast();
                        if(stack.isEmpty() || stack.peekLast() < 0) {
                            stack.addLast(i);
                        }
                    } else if (stack.peekLast() + i == 0){
                        stack.pollLast();
                        break;
                    } else {
                        break;
                    }
                }
            } else {
                stack.addLast(i);
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}

/*Arrays.stream(asteroids).boxed().collect(Collectors.toList());
 Asteroid Collision
 We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right,
negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode.
If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.
Example 3:

Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.

Constraints:

2 <= asteroids.length <= 104
-1000 <= asteroids[i] <= 1000
asteroids[i] != 0
 */
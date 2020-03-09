package com.github.wxiaoqi.security.common;

/**
 * @Auther: Noseparte
 * @Date: 2020/2/11 11:27
 * @Description:
 *
 *         <p></p>
 */
public class Test {


    public static int handleCase(int n) {
        try {
            n += 1;
            if (n / 0 > 0) {
                n += 1;
            } else {
                n -= 10;
            }
            return n;
        } catch (Exception e) {
            n++;
        }
        n++;
        return n++;
    }

    public static void main(String[] args) {
        int i = handleCase(50);
        System.out.println(i);
    }
    
}

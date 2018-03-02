package tools;

/**
 * 位运算
 * 
 */
public class BitTools {
    /**
     * 判断是否是奇数
     * 
     * @param n
     * @return
     */
    public static boolean isOddNumber(int n) {
        return (n & 1) == 1;
    }

    /**
     * 求平均值
     * 
     * @param x
     * @param y
     * @return
     */
    public static int average(int x, int y) {
        return (x & y) + ((x ^ y) >> 1);
    }

    /**
     * 对于一个大于0的整数，判断它是不是2的幂
     * 
     * @param x
     * @return
     */
    public static boolean isFactorialofTwo(int x) {
        return ((x & (x - 1)) == 0) && (x > 0);
    }

    /**
     * 求绝对值
     * 
     * @param x
     * @return
     */
    public static int abs(int x) {
        int y = x >> 31;
        return (x ^ y) - y; // or: (x+y)^y
    }

    /**
     * 将运算数指定位置取反值<br>
     * 例： 0000 1011 指定第 3 位取反, 结果为 0000 0011; 指定第2位取反, 结果为 0000 1111
     * 
     * @param source
     * @param pos
     *            指定位置 (0<=pos<=7)
     * @return 运算后的结果数
     */
    public static byte reverseBitValue(byte source, int pos) {
        byte mask = (byte) (1 << pos);
        return (byte) (source ^ mask);
    }

    /**
     * 检查运算数的指定位置是否为1
     * 
     * @param source
     * @param pos
     * @return
     */
    public static boolean checkBitValue(byte source, int pos) {
        source = (byte) (source >>> pos);
        return (source & 1) == 1;
    }

    /**
     * 将最右侧的0改成1
     * 
     * @param x
     * @return
     */
    public static int right0to1(int x) {
        return x | (x + 1);
    }

    /**
     * 将最右侧的1改成0
     * 
     * @param x
     * @return
     */
    public static int right1to0(int x) {
        return x & (x - 1);
    }

    /**
     * 统计数量为1的位
     * 
     * @param n
     * @return
     */
    public int bitCount(int n) {
        return Integer.bitCount(n);
    }

}

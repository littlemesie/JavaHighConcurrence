package cn.mesie.one;

/**
 * Created by 2019-04-07 22:43
 *
 * @author: mesie
 */
public class PrimeGenerator extends Thread{

    /**
     * 判断一个数是否是质数
     * @param number
     * @return
     */
    private boolean isPrime(long number) {
        if (number <= 2) {
            return true;
        }

        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        long number = 1L;
        while (true){
            // 对每个数字，计算它是不是一个质数，如果是的话就打印到控制台。
            if (isPrime(number)) {
                System.out.printf("Number %d is Prime\n", number);
            }

            // 当被中断时，输出一条消息，并且退出方法
            if (isInterrupted()) {
                System.out.printf("The Prime Generator has been Interrupted\n");
                return;
            }
            number++;
        }
    }
}

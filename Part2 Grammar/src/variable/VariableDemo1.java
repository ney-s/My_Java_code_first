package variable;

import java.nio.file.StandardWatchEventKinds;

public class VariableDemo1 {

    public static void main(String[] args){
        /* 微信余额：0元
        * 支付宝余额：10元
        * 银行卡余额：20元
        * Question1: 请问我现在还剩多少钱
        * Question2：微信收了10块,又发出去2块转账,余额剩余多少
        */
        // 1. 定义一个变量表示微信余额
        double WeixinMoney = 0;

        // 2. 定义一个变量表示支付宝的余额
        double Alipay = 10;

        // 3. 定义一个变量表示银行卡的余额
        double Card = 20;

        // 4. 输出现在余额有多少钱
        System.out.println(WeixinMoney+Alipay+Card);

        // 5.微信收了10块钱
        WeixinMoney = WeixinMoney + 10;
        /*执行过程：
        * 1. 计算WeixinMoney+10，此时变量WeixinMoney里面记录的是0，0+10，得到结果是10
        * 2. 把10赋值给变量WeixinMoney，此时变量WeixinMoney原本被记录的值就被覆盖了
        * */

        // 6. 微信转账2块出去
        WeixinMoney = WeixinMoney - 2;
        System.out.println(WeixinMoney);
        // 执行过程如上第五步





    }
}

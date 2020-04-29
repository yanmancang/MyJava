package com.mryan.decimal;

import java.math.BigDecimal;

public class MyBigDecimal {
    public static void main(String[] args) {
        // TODO: 2020/4/29 数据之间的强转是会丢失精度的
        BigDecimal multiply = BigDecimal.valueOf(9.9f).multiply(BigDecimal.valueOf(100f));
        // 利用valueof进行数据转换时，内部采用的转换为Double类型，从而结果和预期不一致
        System.out.println(multiply.toString());
        // 当采用的是String转为BigDecimal时，并未进行数据之间的强转
        BigDecimal multiply2 = new BigDecimal(Float.toString(9.9f)).multiply(BigDecimal.valueOf(100f));
        System.out.println(multiply2.toString());
        // 包装类型的对象切记不要用 == 进行判断，猜中的几率比较小，可能有意想不到的问题
        System.out.println(multiply.equals(multiply2));
    }
}

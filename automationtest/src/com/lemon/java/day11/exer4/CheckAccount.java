package com.lemon.java.day11.exer4;

import com.lemon.java.day09.aiguigu2.Acount;

/*
创建Account类的一个子类CheckAccount代表可透支的账户，该账户中定义一个属性overdraft代表可透支限额。
在CheckAccount类中重写withdraw方法，其算法如下：
    如果(取款金额<账户余额),
    直接取款
    如果(取款金额>账户余额)
    计算需要透支的额度
    判断可透支额overdraft是否足够支付本次透支需要，如果可以
           将账户余额修改为0，冲减可透支金额
    如果不可以
            体制用户超过可透支额的限额
 */
public class CheckAccount extends Acount {
    private double overdraft;

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft){
        super(id,balance,annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amout) {
        if(getBalance() >= amout){//余额足够消费
            // setBalance(getBalance() - amout);
            super.withdraw(amout);
        }else if(overdraft >= (amout - getBalance())){//透支额度 + 余额足够消费
            overdraft -= (amout - getBalance());
            setBalance(0);
            super.withdraw(getBalance());
        }else{
            System.out.println("超过可透支限额");
        }
    }
}

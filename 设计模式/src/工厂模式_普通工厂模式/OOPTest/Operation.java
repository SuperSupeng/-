package 工厂模式_普通工厂模式.OOPTest;

/**
 * Created by ${super} on ${2017/5/27}.
 * 通过简单的计算器程序
 */
public  class Operation {
    private double _numberA = 0;
    private double _numberB = 0;
    double result = 0;

    public double get_numberA(){
        return _numberA;
    }

    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }

    public double get_numberB() {
        return _numberB;
    }

    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }

    public  double getResult(){
        return result;
    }
}

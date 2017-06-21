package 原型模式;

import java.util.ArrayList;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class Prototype implements Cloneable{

  private ArrayList<String> list = new ArrayList();
  int a =10;
  String s = new String("aaaaa");
  Double d = 10.2;

  public Prototype clone() {

      Prototype prototype = null;
      try {
          prototype = (Prototype) super.clone();
          prototype.list = (ArrayList) this.list.clone();

      } catch (CloneNotSupportedException e) {
          e.printStackTrace();
      }
      return prototype;
  }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    public void add(){
        list.add("a");
        list.add("b");
    }
}

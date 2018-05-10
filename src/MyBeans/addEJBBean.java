package MyBeans;

import javax.ejb.Stateless;

@Stateless(name = "addEJB")
public class addEJBBean {
    private int i,j,k;
    public addEJBBean() {


    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
    public void add()
    {
        k=i+j;
    }
}

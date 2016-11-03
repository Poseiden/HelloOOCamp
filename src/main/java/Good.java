/**
 * Created by hbzhu on 01/11/2016.
 */
public class Good {

    public  int length;

    public boolean compare(Good good) {
        return length > good.length ? true : false;
    }

    public Good(int length) {
        this.length = length;
    }

}

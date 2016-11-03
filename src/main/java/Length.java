import sun.tools.jconsole.Plotter;

/**
 * Created by hbzhu on 01/11/2016.
 */
public class Length {
    private int length;
    private String units;

    public boolean compare(Length length) {
        if(!length.getUnits().equals(this.units)) {
            if(length.getUnits().equals(Units.CM)) {
                this.length *= 100;
            }else {
                this.length /= 100;
            }
        }
        return this.length == length.length;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Length(int length, String units) {
        this.length = length;
        this.units = units;
    }
}

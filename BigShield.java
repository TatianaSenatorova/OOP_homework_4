
public class BigShield extends Shield{
    @Override
    public int protection() {
        return 99;
    }

    @Override
    public String KindOfShield() {
        return "железо";
    }

    @Override
    public String toString() {
        return "<Большой> щит " +  super.toString();
    }
}
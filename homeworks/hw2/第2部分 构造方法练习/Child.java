
public class Child extends Parent{
	private int child;

    public Child() {
        System.out.println("子类构造方法被调用");
        child = 1;
    }

    public int getChild() {
        return child;
    }
}

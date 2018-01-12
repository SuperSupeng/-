package CompositeMode;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("不可以添加");
    }

    @Override
    public void remove(Component c) {
        System.out.println("不可以移除");
    }

    @Override
    public void display(int depth) {
        System.out.println(new String("-" + depth) + name);
    }
}

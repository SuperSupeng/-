package CompositeMode;

import java.util.LinkedList;
import java.util.List;

public class Composite extends Component {
    private List<Component> children = new LinkedList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(new String("-" + depth) + name);
        for(Component component : children){
            component.display(depth + 2);
        }
    }
}

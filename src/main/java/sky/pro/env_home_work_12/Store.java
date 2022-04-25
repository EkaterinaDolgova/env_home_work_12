package sky.pro.env_home_work_12;

import org.springframework.context.annotation.Scope;

import java.util.List;

@Scope("session")
public class Store {
    private  List<Integer> items;

    public Store(List<Integer> items) {
        this.items = items;
    }
    public List<Integer> getItems() {
        return items;
    }
    public void setItems(List<Integer> items) {
        this.items = items;
    }
}

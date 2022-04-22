package sky.pro.env_home_work_12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
//@Scope("session")
public class StoreServiceImpl implements StoreService {

    @Autowired
    private final List<Integer> items;
    public StoreServiceImpl() {
        this.items = new ArrayList<>();
    }
    @Override
    public List<Integer> addStore(List<Integer> idList) {
        if(items.equals(idList)){
            throw new StoreNotFoundException("Дубли");
        }
        items.addAll(idList);
        return idList;
    }

    @Override
    public List<Integer> getStoreList() {
        return items;
    }
}




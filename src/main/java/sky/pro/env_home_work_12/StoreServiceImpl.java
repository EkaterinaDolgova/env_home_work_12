package sky.pro.env_home_work_12;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    private final List<Integer> items;

    public StoreServiceImpl() {
        this.items = new ArrayList<>();
    }

    @Override
    public List<Integer> addStore(List<Integer> idList) {
        if (items.equals(idList)) {
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




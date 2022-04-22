package sky.pro.env_home_work_12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StoreController {

        private final StoreService storeService;

        public StoreController(StoreService storeService) {
            this.storeService = storeService;
        }

        @GetMapping("/store/order/get")
        public List<Integer> printEmployeeList() {
            return storeService.getStoreList();
        }

        @GetMapping(path = "/store/order/add")
        public List<Integer>requestArray(@RequestParam List<Integer> idList) {
            return storeService.addStore(idList);
        }
}

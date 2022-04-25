package sky.pro.env_home_work_12;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(HttpStatus.NOT_FOUND)
public class StoreNotFoundException extends RuntimeException{

        public StoreNotFoundException(String s) {
            super(s);
        }
    }


package first_app_mvn_spring.repository;

import first_app_mvn_spring.domains.User;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * {@link User}
 * {@link Repository}
 */
@Repository
public class UserRepository {

    private  final static  ConcurrentMap<Integer,User> repo =
            new ConcurrentHashMap<>();
    private final static AtomicInteger idgen =
            new AtomicInteger();

    public  boolean save(User user) {
        Integer id = idgen.incrementAndGet();
        user.setId(id);
        return repo.put(id,user) == null;

    }

    public Collection<User> findAll() {
        return null;
    }
}

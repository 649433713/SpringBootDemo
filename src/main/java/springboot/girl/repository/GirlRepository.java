package springboot.girl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.girl.domain.Girl;

import java.util.List;

/**
 * Created by 廖师兄
 * 2016-11-03 23:17
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //通过年龄来查询
    public List<Girl> findByAge(Integer age);
}

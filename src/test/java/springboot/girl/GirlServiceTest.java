package springboot.girl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.girl.domain.Girl;
import springboot.girl.service.GirlService;

/**
 * Created by 廖师兄
 * 2017-02-14 23:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findOneTest() {
        Girl girl = girlService.findOne(1);
        Assert.assertEquals(new Integer(15), girl.getAge());
    }
}

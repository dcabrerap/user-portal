package com.appdemo.userportal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    //@Autowired
    //private TestEntityManager entityManager;
 
    @Autowired
    private UserService service;
    
    @Test
    public void whenFindByName_thenReturnEmployee() {
        User user = new User();
        user.setFirstName("123456789");
        user.setEmail("test@test.com");
        service.create(user);
        //entityManager.persist(user);
        //entityManager.flush();
     
        // when
        User found = service.findByEmailAddress(user.getEmail());
     
        // then
        //Assert.assertTrue(found.getEmail().equals(user.getEmail()));
        Assert.assertEquals(found.getEmail().trim(), (user.getEmail().trim()));
        
        service.delete(found.getId());
    }
    
}

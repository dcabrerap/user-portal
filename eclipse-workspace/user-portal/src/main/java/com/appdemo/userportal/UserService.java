package com.appdemo.userportal;

import java.util.List;

public interface UserService {
	
    public User create(User user);

    public User delete(int id);
    
    public List findAll();
    
    public User findById(int id);

    public User update(User user);
    
    public User findByEmailAddress(String email);

}

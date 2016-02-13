package autopark.service.impl;

import autopark.dao.IUserDAO;
import autopark.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDAO userDAO;

}
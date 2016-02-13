package autopark.dao;


import autopark.domain.User;

public interface IUserDAO extends IRootDAO<User> {

    User getByEmail(String email);

}
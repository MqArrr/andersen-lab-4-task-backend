package lab.andersen.service;

import lab.andersen.exception.ServiceException;
import lab.andersen.model.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers() throws ServiceException;

    User findById(int id) throws ServiceException;

    User create(User user) throws ServiceException;

    User update(User user) throws ServiceException;

    void delete(int id) throws ServiceException;
}

package lab.andersen.dao;

import lab.andersen.exception.DaoException;
import lab.andersen.model.UserActivity;
import lab.andersen.model.UserActivityShort;

import java.util.List;
import java.util.Optional;

public interface UserActivityDao {

    List<UserActivity> findAll() throws DaoException;

    List<UserActivityShort> findAllToday() throws DaoException;

    Optional<UserActivity> findById(int id) throws DaoException;

    void create(UserActivity entity) throws DaoException;

    void update(UserActivity entity) throws DaoException;

    void delete(int id) throws DaoException;
}
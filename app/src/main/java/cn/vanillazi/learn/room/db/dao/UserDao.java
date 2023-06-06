package cn.vanillazi.learn.room.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import cn.vanillazi.learn.room.db.entity.User;
import io.reactivex.rxjava3.core.Observable;

@Dao
public interface UserDao {

    @Query("SELECT * FROM user")
    Observable<List<User>> getAll();

    @Query("SELECT * FROM user WHERE id IN (:userIds)")
    Observable<List<User>> loadAllByIds(long[] userIds);

    @Query("SELECT * FROM user WHERE name LIKE :name")
    Observable<User> findByName(String name);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);

    @Update
    void update(User user);
}

package cn.vanillazi.learn.room.db;

import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.RoomDatabase;

import cn.vanillazi.learn.room.db.dao.UserDao;
import cn.vanillazi.learn.room.db.entity.User;

@Database(entities = {User.class},
        version = 3,autoMigrations = {
        @AutoMigration(from = 1, to = 2),
        @AutoMigration(from = 2, to = 3)
})
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();
}

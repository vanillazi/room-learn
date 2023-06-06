package cn.vanillazi.learn.room;

import android.content.Context;

import androidx.room.Room;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import cn.vanillazi.learn.room.db.AppDatabase;
import cn.vanillazi.learn.room.db.entity.User;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("cn.vanillazi.learn.room", appContext.getPackageName());
        AppDatabase db = Room.databaseBuilder(appContext,
                AppDatabase.class, "database-name").build();
        var userDao=db.userDao();
        var user=new User();
        user.setHomePage("https://test.cn");
        user.setName("test");
        userDao.insertAll(user);
        var uses=userDao.findByName("%t").blockingFirst();
        assertEquals(uses.getName(),user.getName());
    }
}
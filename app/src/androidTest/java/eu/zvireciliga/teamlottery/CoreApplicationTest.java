package eu.zvireciliga.teamlottery;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class CoreApplicationTest
{
    @Test
    public void useAppContext() throws Exception
    {
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("eu.zvireciliga.teamlottery", appContext.getPackageName());
    }
}

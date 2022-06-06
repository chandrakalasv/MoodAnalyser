
import com.bridge.analyse.MoodAnalyser;
import com.bridge.analyse.exception.ExceptionType;
import com.bridge.analyse.exception.MoodAnalyserException;
import junit.framework.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    MoodAnalyser obj = new MoodAnalyser();
    @Test
    public void givenMood_WhenSad_ShouldReturn_Sad() {
        obj.setMessage("i am in sad mood");
        String mood = obj.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMood_WhenAnyMood_ShouldReturn_Happy() {
        obj.setMessage("i am in any mood");
        String mood = obj.analyseMood();
        Assert.assertEquals("Happy", mood);
    }
    @Test
    public void givenMood_WhenNullMood_ShouldReturn_Exception() {
        try {
            obj.setMessage(null);
            obj.analyseMood();
            //    Assert.assertEquals("Happy", mood);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(ExceptionType.Null, e.type);
            System.out.println(e.getMessage() + " " +  e.type);
        }
        System.out.println("hi");
    }

    @Test
    public void givenMood_WhenEmpty_ShouldReturn_CustomMoodAnalyserException() {
        try {
            obj.setMessage(" ");
            obj.analyseMood();
        }
        catch(MoodAnalyserException ex) {
           Assert.assertEquals(ExceptionType.Empty, ex.type);
        }
    }
}

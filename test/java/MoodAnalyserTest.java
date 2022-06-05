import com.bridge.analyse.MoodAnalyser;
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
}

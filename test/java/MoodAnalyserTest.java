import com.bridge.analyse.MoodAnalyser;
import junit.framework.Assert;

public class MoodAnalyserTest {
    @org.junit.Test
    public void givenMood_WhenSad_ShouldReturn_Sad() {
        MoodAnalyser obj = new MoodAnalyser();
        String mood = obj.analyseMood("i am in sad mood");
        Assert.assertEquals("SAD", mood);
    }
}

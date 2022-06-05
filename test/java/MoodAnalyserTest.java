import com.bridge.analyse.MoodAnalyser;
import junit.framework.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMood_WhenSad_ShouldReturn_Sad() {
        MoodAnalyser obj = new MoodAnalyser();
        String mood = obj.analyseMood("i am in sad mood");
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMood_WhenAnyMood_ShouldReturn_Happy() {
        MoodAnalyser obj = new MoodAnalyser();
        String mood = obj.analyseMood("i am in any mood");
        Assert.assertEquals("Happy", mood);
    }
}

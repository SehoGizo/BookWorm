package BookWorm;

public class Sun {
    private static Sun instance;
    private final String emoji = "☀️";
    private Sun(){}
    public static Sun getInstance(){
        if (instance == null)
        {
            instance = new Sun();
        }
        return instance;
    }
    public String getStringEmoji()
    {
        return emoji;
    }
}

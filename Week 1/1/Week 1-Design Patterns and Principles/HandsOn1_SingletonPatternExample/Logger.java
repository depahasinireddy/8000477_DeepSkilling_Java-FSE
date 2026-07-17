public class Logger {
   private static Logger instance;
   private String loggerName = "AppLogger";

   private Logger() {
   }

   public static Logger getInstance() {
      if (instance == null) {
         instance = new Logger();
      }

      return instance;
   }

   public void log(String var1) {
      System.out.println("[" + this.loggerName + "]: " + var1);
   }
}

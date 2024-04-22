public enum LogLevel {
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42),
    UNKNOWN("", 0);

    private final String levelString;
    private final int levelInt;

    LogLevel(String levelString, int levelInt ) { 
        this.levelString = levelString;
        this.levelInt = levelInt;
    }

    public static LogLevel getLogLevelFromString(String levelString) {
        for (LogLevel level : values()) {
            if (level.levelString.equals(levelString)) return level;
        }
        return LogLevel.UNKNOWN;
    }

    public int getLogLevelInt() {
        return levelInt;
    }
}

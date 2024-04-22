public class LogLine {
    private String message;
    private LogLevel lvl;

    public LogLine(String logLine) {
        this.message = logLine.split(": ")[1];
        this.lvl = LogLevel.getLogLevelFromString(logLine.substring(1, logLine.indexOf(']')));
    }

    public LogLevel getLogLevel() {
        return this.lvl;
    }

    public String getOutputForShortLog() {
        return this.lvl.getLogLevelInt() + ":" + message;
    }
}

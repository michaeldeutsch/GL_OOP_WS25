package einheit_08.zt3.model;

public enum Industry {
    GEWERBE(12),
    HANDEL(13),
    INDUSTRIE(14),
    MISCHFORM(15);

    private final int code;

    Industry(int code) { this.code = code; }

    public int getCode() { return code; }
}

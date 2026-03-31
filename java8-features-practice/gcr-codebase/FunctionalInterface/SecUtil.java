interface SecUtil {
    static boolean strong(String p) {
        return p.length() >= 8;
    }
}

package no.nav.veilarbdemo.utils;

import java.util.HashMap;
import java.util.Map;

public class HttpFilterHeaders {

    public static final Map<String, String> NO_CACHE_HEADERS = new HashMap<>();

    public static final Map<String, String> SECURITY_HEADERS = new HashMap<>();

    public static final Map<String, String> ALL_HEADERS = new HashMap<>();

    static {
        NO_CACHE_HEADERS.put("Cache-Control", "no-cache, no-store, must-revalidate");
        NO_CACHE_HEADERS.put("Expires", "0");
        NO_CACHE_HEADERS.put("Pragma", "no-cache");

        SECURITY_HEADERS.put("X-Content-Type-Options", "nosniff");
        SECURITY_HEADERS.put("X-Frame-Options", "DENY");
        SECURITY_HEADERS.put("X-Xss-Protection", "1; mode=block");
        SECURITY_HEADERS.put("Strict-Transport-Security", "max-age=31536000; includeSubDomains");

        ALL_HEADERS.putAll(NO_CACHE_HEADERS);
        ALL_HEADERS.putAll(SECURITY_HEADERS);
    }

}

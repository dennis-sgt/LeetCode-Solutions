public class EncodeAndDecodeTinyURL_535 {
    Map<String, String> map = new HashMap<>();

    public String encode(String longUrl) {
        String s = UUID.randomUUID().toString().substring(0, 5);
        map.put(s, longUrl);
        return "https://tinyurl.com/" + s;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int i = shortUrl.indexOf(".com/");

        String s = shortUrl.substring(i + 5);
        return map.get(s);
    }
}

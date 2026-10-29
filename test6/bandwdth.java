class Result {
    static String compressMsg(String textMsg) {
        String result = "";

        int i = 0;

        while (i < textMsg.length()) {
            char ch = textMsg.charAt(i);
            int count = 0;

            while (i < textMsg.length() && textMsg.charAt(i) == ch) {
                count++;
                i++;
            }

            result += ch;

            if (count > 1) {
                result += count;
            }
        }

        return result;
    }
}
class ReverseWords {
    public String reverseWords(String s) {
         String result = "";
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                temp += ch;
            } else {
                if (!temp.equals("")) {
                    result = temp + (result.equals("") ? "" : " ") + result;
                    temp = "";
                }
            }
        }
        if (!temp.equals("")) {
            result = temp + (result.equals("") ? "" : " ") + result;
        }

        return result;
    }
}
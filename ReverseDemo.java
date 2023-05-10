class ReverseDemo {
        public static void main (String args []) {
                String str1 = "Shiv";
                StringBuffer str2 = new StringBuffer(str1);
                str1 = str2.reverse().toString();
                System.out.println(str1);
        }
}

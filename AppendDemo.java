class AppendDemo {
        public static void main (String args []) {
                String str1 = "raje";
                StringBuffer str2 = new StringBuffer("Shiv");
                str2 = str2.append(str1);
                System.out.println(str1);
                System.out.println(str2);
        }
}

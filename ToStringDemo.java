class ToStringDemo{
        public static void main(String args[]) {
                StringBuffer str = new StringBuffer("Shiv");
                String str1 = new String("raje");
                String str2 = str.toString();
                System.out.println(str2.concat(str1));
        }
}
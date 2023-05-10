class InsertDemo {
        public static void main (String args []) {
                String str1 = "raje ";
                StringBuffer str2 = new StringBuffer("ShivChaudhari");
                str2 = str2.insert(4,str1);
                System.out.println(str1);
                System.out.println(str2);
        }
}

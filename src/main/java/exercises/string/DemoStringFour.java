package exercises.string;


public class DemoStringFour {
    public static void main(String[] args) { 
        String str = "Hell8ow08H3a";
        int num = 0 ;
        int upper = 0 ;
        int lower = 0 ;
        
        for (int i = 0; i <str.length() ; i++) {
            //获取索引位置的字符
            char c = str.charAt(i);
            //将字串对应的ascii码
            int ascii = c;
            if ( ascii >=48 && ascii <= 57 ){
                num ++;
            }
            if (ascii >= 65 && ascii <= 90){
                upper ++;
            }
            if (ascii >= 97 && ascii <=122){
                lower ++;
            }

        }
        System.out.println("字符串中数字的个数是:" + num  );
        System.out.println("字符串中小写字母的个数是:" + lower  );
        System.out.println("字符串中大写字母的个数是:" + upper  );
    }
}

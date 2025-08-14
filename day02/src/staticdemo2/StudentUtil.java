package staticdemo2;

import java.util.ArrayList;

public class StudentUtil {

    private StudentUtil(){ }

    public static int getMaxStudent(ArrayList<Student> list){
        // 1.定义一个参照物
        // 静态方法只能调用静态，非静态都可以
        int max = list.get(0).getAge();
        for(int i = 0;i<list.size();i++){
            int tempAge = list.get(i).getAge();
            if(max < tempAge){
                max = tempAge;
            }
        }
        return max;
    }
}

package com.interview;

import com.interview.model.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author GX
 */
public class IneterViewTest {

    @Test
    public void test() {
        List<String> list=new ArrayList();
        List<String> list1=new ArrayList();

//        list.add(Student.builder().name("张三").id(1).score(28).build());
//        list.add(Student.builder().name("李四").id(2).score(35).build());
//        list.add(Student.builder().name("张三").id(3).score(28).build());
//        list.add(Student.builder().name("王五").id(4).score(35).build());
//        list.add(Student.builder().name("张三").id(5).score(28).build());
//        list.add(Student.builder().name("李四").id(7).score(35).build());
//        list.add(Student.builder().name("赵六").id(8).score(28).build());
//        list.add(Student.builder().name("田七").id(9).score(35).build());

        list.add("张三");
        list.add("李四");
        list.add("张三");
        list.add("王五");
        list.add("张三");
        list.add("李四");
        list.add("赵六");
        list.add("田七");

//        list.stream()
//                .collect(Collectors.toMap(e -> e, e -> 1, (a, b) -> a + b)) // 获得元素出现频率的 Map，键为元素，值为元素出现的次数
//                .entrySet().stream() // Set<Entry>转换为Stream<Entry>
//                .filter(entry -> entry.getValue() > 1) // 过滤出元素出现次数大于 1 的 entry
//                .map(entry -> entry.getKey()) // 获得 entry 的键（重复元素）对应的 Stream
//                .collect(Collectors.toList());

        //Function.identity()-->拿到当前循环的对象,这里就是拿到循环出的名字
        Map<String, Long> collect =  list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                    .entrySet().stream()
                .filter(t->t.getValue()>1).collect((Collectors.toMap(h -> h.getKey(), h -> h.getValue())));
        System.out.println(collect);
    }

    //递归1 一个整数，大于0，不用循环和本地变量，按照n，2n，4n，8n的顺序递增，当值大于5000时，把值按照指定顺序输出来。
    @Test
    public void getDoubleNum(){
        doubleNum(1272);
    }
    public void doubleNum(int n){
        if(n<=5000)
            doubleNum(n*2);
        System.out.println(n);
    }

//  递归2:  第1个人10，第2个比第1个人大2岁，依次递推，请用递归方式计算出第8个人多大？
    @Test
    public void getComputeAge()
    {
        System.out.println(computeAge(8));
    }

    public int computeAge(int n)
    {
        if(n==1) return 10;
        return computeAge(n-1) + 2;
    }
}

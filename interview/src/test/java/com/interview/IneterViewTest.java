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

//        list.add(Student.builder().name("����").id(1).score(28).build());
//        list.add(Student.builder().name("����").id(2).score(35).build());
//        list.add(Student.builder().name("����").id(3).score(28).build());
//        list.add(Student.builder().name("����").id(4).score(35).build());
//        list.add(Student.builder().name("����").id(5).score(28).build());
//        list.add(Student.builder().name("����").id(7).score(35).build());
//        list.add(Student.builder().name("����").id(8).score(28).build());
//        list.add(Student.builder().name("����").id(9).score(35).build());

        list.add("����");
        list.add("����");
        list.add("����");
        list.add("����");
        list.add("����");
        list.add("����");
        list.add("����");
        list.add("����");

//        list.stream()
//                .collect(Collectors.toMap(e -> e, e -> 1, (a, b) -> a + b)) // ���Ԫ�س���Ƶ�ʵ� Map����ΪԪ�أ�ֵΪԪ�س��ֵĴ���
//                .entrySet().stream() // Set<Entry>ת��ΪStream<Entry>
//                .filter(entry -> entry.getValue() > 1) // ���˳�Ԫ�س��ִ������� 1 �� entry
//                .map(entry -> entry.getKey()) // ��� entry �ļ����ظ�Ԫ�أ���Ӧ�� Stream
//                .collect(Collectors.toList());

        //Function.identity()-->�õ���ǰѭ���Ķ���,��������õ�ѭ����������
        Map<String, Long> collect =  list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
.entrySet().stream().filter(t->t.getValue()>1).collect((Collectors.toMap(h -> h.getKey(), h -> h.getValue())));
        System.out.println(collect);
    }
}

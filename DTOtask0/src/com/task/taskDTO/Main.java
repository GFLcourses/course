package com.task.taskDTO;


import java.util.Objects;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        DTOtask task1 = new DTOtask();
        task1.setId(777);
        task1.setWord("HelloWorld");

        System.out.println("(ODTask class) task1.getWord = " + task1.getWord());
        System.out.println("(ODTask class) task1.getId = " + task1.getId());
        System.out.println();

        DTOtask task2 = new DTOtask();
        task2.setId(555);

        task2.setWord("HelloWorld");
        System.out.println("(ODTask class) task2.getWord = " + task2.getWord());
        System.out.println("(ODTask class) task2.getId = " + task2.getId() + "\n");

        DTOtaskDuoble taskDouble = new DTOtaskDuoble();
        taskDouble.setId(777);
        taskDouble.setWord("HelloWorld");

        System.out.println("(ODTaskDuoble class) taskDouble.getWord = " + taskDouble.getWord());
        System.out.println("(ODTaskDuoble class) taskDouble.getId = " + taskDouble.getId());
        System.out.println();


        System.out.print("(ODTask class) task1.equals(task2) = ");
        System.out.println(task1.equals(task2));
        System.out.println();
        System.out.print("(ODTask class != ODTaskDuoble class)  task1.equals(taskDouble) = ");
        System.out.println(task1.equals(taskDouble));
        System.out.println();
        System.out.print("(ODTask class) Objects.equals(task1.hashCode(),task2.hashCode()) = ");
        System.out.println(Objects.equals(task1.hashCode(), task2.hashCode()));
        System.out.println();
        System.out.print("(ODTask class == ODTaskDuoble class) Objects.equals(task1.hashCode(),taskDouble.hashCode())) = ");
        System.out.println(Objects.equals(task1.hashCode(), taskDouble.hashCode()));
        System.out.println();
        System.out.print("(ODTask class != ODTaskDuoble class) Objects.equals(task1,taskDouble) = ");
        System.out.println(Objects.equals(task1, taskDouble));
        System.out.println();


        if (task1.hashCode() == task2.hashCode()) {
            System.out.println("EQALS! task1.hashCode() == task2.hashCode()");
            System.out.println("ODTask class task1 hashCode = " + task1.hashCode());
            System.out.println("ODTask class task2 hashCode = " + task2.hashCode());
        } else {
            System.out.println("NOT EQALS! task1.hashCode() == task2.hashCode()");
            System.out.println("ODTask class task1 hashCode = " + task1.hashCode());
            System.out.println("ODTask class task2 hashCode = " + task2.hashCode());
        }
        System.out.println();

        if (task1.hashCode() == taskDouble.hashCode()) {
            System.out.println("EQALS! task1.hashCode() == taskDouble.hashCode()");
            System.out.println("ODTaskDuoble class task1 hashCode = " + task1.hashCode());
            System.out.println("ODTaskDuoble class taskDouble hashCode = " + taskDouble.hashCode());
        } else {
            System.out.println("NOT EQALS! task1.hashCode() == taskDouble.hashCode()");
            System.out.println("ODTaskDuoble class task1 hashCode = " + task1.hashCode());
            System.out.println("ODTaskDuoble class taskDouble hashCode = " + taskDouble.hashCode());
        }
        System.out.println();


    }
}

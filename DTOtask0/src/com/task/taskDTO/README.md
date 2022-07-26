На практике удостоверился, что одно лишь сравнение объяектов класса
или хэшей значений переменных объекта - не всегда бывает достоверно.

Объекты разных классов, но с одинаковыми значениями переменных могут показывать true:
```
(ODTask class == ODTaskDuoble class) Objects.equals(task1.hashCode(),taskDouble.hashCode())) = true
```
Объекты одного класса, но с разными значениями возвращают false:
```
(ODTask class) task1.equals(task2) = false
```
Объекты разных классов  с одинаковыми значениями переменных тоже возвращают false:
```
(ODTask class != ODTaskDuoble class)  task1.equals(taskDouble) = false
```
И тут же, через через другой вариант сравнения возвращают false:
```
(ODTask class != ODTaskDuoble class) Objects.equals(task1,taskDouble) = false
```
Однако хеши не всегда однозначно проявляют себя при малом колличестве переменных в объекте:
```
NOT EQALS! task1.hashCode() == task2.hashCode()
ODTask class task1 hashCode = 734307530
ODTask class task2 hashCode = 734307308
```

```
EQALS! task1.hashCode() == taskDouble.hashCode()
ODTaskDuoble class task1 hashCode = 734307530
ODTaskDuoble class taskDouble hashCode = 734307530
```
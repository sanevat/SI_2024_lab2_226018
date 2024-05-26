# Теодора Санева 226018

##  1. Control flow graph

![GRAPH](https://github.com/sanevat/SI_2024_lab2_226018/assets/73078235/7d3b2e0c-858a-48c4-8313-d5785c928266)

## 2. Цикломатска комплексност
Цикломатската комплексност на овој код е 10, истата ја добив преку формулата број на ребра - број на јазли + 2 , односно 36-28+2=10.

## 3. Тест случаи според критериумот Every Branch
Со 5 тест случаи успеав да поминам низ сите гранки. Како што е прикажано на сликава во продолжение.

![branchTest](https://github.com/sanevat/SI_2024_lab2_226018/assets/73078235/7fab69fd-2684-4f2e-b9fc-87cede69053b)

Прв тест пример: allItems е null, што предизвикува RuntimeException со порака "allItems list can't be null!" <br>
Втор тест пример: невалиден баркод, во баркодот има карактери букви, па се фрла RuntimeException со порака "Invalid character in item barcode!"<br>
Трет тест пример: баркод null, што предизвикува  RuntimeException со порака "No barcode!".<br>
Четврт тест пример: Вредноста на сумата е помала од payment па функцијата враќа true.<br>
Петти тест пример: Вредноста на сумата е помала од payment па функцијата враќа false.<br>

## 4. Тест случаи според критериумот Multiple Condition

Ги претставив сите можни комбинации за релационите изрази, т.ш Lazy Evaluation ги елиминира некои од комбинациите на вистинитостите.

Проверка на условите: item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'<br>

TTT - assertTrue доколку сите услови се исполнети <br>
TTF - assertTrue доколку цената на сите производи е поголема од 300, има попуст поголем од нула и баркодот не почнува со карактерот '0' <br>
TFX - assertTrue доколку цената на сите производи е поголема од 300 и нема попуст поголем од нула<br>
FXX - assertTrue доколку цената на сите производи не е поголема од 300<br>

## 5. Објаснување на напишаните unit tests


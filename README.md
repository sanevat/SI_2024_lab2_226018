# Teodora Saneva 226018
</br>
<h1>2. Control Flow Graph</h1
![GRAPH](https://github.com/sanevat/SI_2024_lab2_226018/assets/73078235/197639b8-f4ca-487e-a03f-cba8d084bd42)


<h1>3. Цикломатска комплексност</h1>
Број на ребра - Број на јазли + 2= 36-28+2=10
</br>
<h1>4. Тест случаи според критериумот Every branch  </h1>
![branchTest](https://github.com/sanevat/SI_2024_lab2_226018/assets/73078235/ae2220ec-ca00-4f3b-b21e-7eadb81322eb)

Со 5 тест случаи успеав да поминам низ сите гранки. 
1. Прв тест случај allItems=null, payment=any. Листата со производи не е иницијализирана, па текот на програмата оди по гранките 1-2, 2-27 т.е се фрла исклучок и програмата завршува.
2. Втор тест случај allitems[[name="bread", barcode="0223ab", price=200,discount=0.2]] payment=any Невалиден баркод кој содржи и букви, објект со валидно име, цена помалу 200 и попуст еднаков на 0. Со ова се опфаќаат следните тест примери: 1-3, 3-4.1, 4.1-4.2, 4.2-5, 5-6, 6-8, 9-9;10, 9,10-11.1, 11.1-11.2, 11.2-12, 12-13, 13-14, 14-27.
3.Целта на овој test case е да се креира објект од класата Item, но без име и баркод. Така текот на програмата ќе го опфати условот за името на пратенито објект и валидноста на бар кодот.
4. allItems содржи два елементи: еден со баркод "023" и попуст од 0.1, и друг со баркод "123" без попуст. Вкупната цена се пресметува и споредува со payment кое е 301. Вредноста на сумата е помала или еднаква на payment, па функцијата враќа true.
5. allItems содржи два елементи: еден со баркод "023" и попуст од 0.1 и цена од 100, и друг со баркод "123" и цена од 300 без попуст. Вкупната цена се пресметува и споредува со payment кое е 301. Поради условот за намалување на 30 единици од сумата, функцијата враќа true.
<br/>
<h1>5. Тест случаи според критериумот Multiple condition </h1>

</br>
<h1>6. Објаснување на напишаните unit tests</h1>




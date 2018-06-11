package ru.foxit.grayfox;

/**
 * Author TestString.java - GrayFox | Ilya Lisin
 * Contact: Skype: foxygameskype | Telegram: +7(925)316-65-82 | vk: https://vk.com/exsperto1
 * GitHub: https://github.com/FoxITeam and https://github.com/GrayFoxIT
 * encoding: UTF-8, Comments, remarks in Russian.
 */

import java.util.Arrays;

public class TestString {

    // Можно так же складывать строки, только это уже называется конкатинация.
    // ctrl + P - Вызвать конструктор метода и посмотреть из чего же можно сделать строку.
    // А если нажать на метод и ctrl + B, то можно перейти на метод и посмотреть его поведение.
//    String strArray = new String(hello);
    // Что такое reqex - это регулярное выражение.

    public static void main(String[] args) {
        String hello = "Hello World";
        // все инты автоматом приобразуются к строке - конкатинация.
        // если мы скажем компилятору, что нам нужно с начало выполнить сложение, то он будет складывать инты (5+5)
        // а уже затем наше полученное число 10 приведется к строке.
        // принтлн вызывает как мы помним ту стринг, который находиться в объекте обджект.
        System.out.println(hello + 5);
        System.out.println(hello.charAt(3));// вернет нам символ из нашей строки. Числа идут с нуля.
        //System.out.println("джаба".codePointCount());
        // toString превратить строку в строку
        // codePointAt - вернет нам интовое значение символа находящийся по данному индексу в строке.
        // codePointBefore - вернет значение предыдущего символа.
        // codePointCount - колличество символов между начальным и конечным индексом.
        // compareTo - сравнивает строку с со строкой переданной в качестве параметра.
        // compareToIgnoreCase - делает тоже самое, но игнорирует заглавные и прописные строчные буквы.
        // concat - сложить 2 строки.
        // contains - содержит ли данная строка данный символ, данную последовательность символов.
        // contentEquals - сравнивание на содержание данной последовательности, а так же на совпадение.
        // contentEquals - может принимать буфер
        // endsWith - заканчивается на, то есть то есть можно передать туда допустим часть строки и (ну несколько символов) и он проверит конкретную строку, заканчивается ли она на эти конкретные символы. Можно так хорошо проверять расширение файлов.
        // equals - это сравнить
        // equalsIgnoreCase - это сравнить игнорируя.
        // getBytes - возвращает массив байтов данной строки
        // getBytes - возвращает байты для заданной кодировки
        // getBytes - возвращает байты для заданной кодировки по имени
        // hashCore() - возвращает хеш код данной строки.
        // indexOf - возвращает первый встретившийся индекс данного символа, если символ в строке встречается несколько раз, то он вернет его первое вхождение
        // indexOf - String может вернуть индекс первого вхождения данного куска строки.
        // На самом деле indexOf перестали быть нужны с появлением регулярных выражений.
        // intern - возвращает каноничное представление строкового объекта
        // isEmpty() - хорошая вещь! Она возвращает тру если строка пуста, то есть не надо проверять на нулл, можно спросить isEmpty!
        // lastIndexOf - последнее вхождение данного символа.
        // lastIndexOf - Чаще применяется для поиска и разбиение различных вещей по точкам, если вы знаете что последним разделителем будет косой сфлеш, ищите последнее вхождение него, получаете этот индекс и от этого индекса считываете три или четыре символа, в зависимости от того сколько там есть.
        // length - вернет Вам строку.
        // matches - на вход принимает легулярное выражение.
        // offsetByCodePoint - отступы по кодам и юникодам.
        // regionMatches - ищем совпадение только в каком то отдельном куске данной строке.
        // regionMatches - только принимает уже булеан игнор кейс + еще нужно ли игнорировать большие и маленькие буквы?
        // replace - заменяет символ все символы в данной строке, которые совпадают - то есть полностью меняем состав строки.
        // replaceAll - принимает на вход регулярное выражение и меняет целые куски.
        // replaceFirst - заменяет только первое вхождение данной строки.
        // split - делит данную строку на массив, то есть возвращает массив строк по заданному разделителю.
        System.out.println(Arrays.toString(hello.split(" "))); // Получаем массив слов, разбили по пробелу.
        // startWith понятно - начинается ли данная строка с символа с заданным отступом.
        // substring - возвращает нам часть строки начиная нам с заданного индекса который передается в параметрах
        // substring - с 2 параметрами, вычленяет строку, начиная с первого индекса и заканчивая вторым по параметрам.
        // toCharArray - превращает строку в массив символов, то есть хеллоу ворлд превратиться в массив символов, в котором будут лежать по 1 символу.
        // toLowerCase - переводит в нижний регистр,
        // toUpperCase - капсит.
        // trim - если строка заканчивается пустыми символами, то он обрежит их. Обрезка строки по пустым символам. Вырезает только пробелы по краям, внутренние символы он нам оставит. Обычно применяется к полям логина и пароля!
        // subSequence - возвращает charSequence по заданным точкам, начальная и конечная индексы символы.
        // Еще это не строка, То есть вернув строки с 0 и 5, вам нужно еще вызвать в него ту стринг, чтобы он напечатался. Вообще он печатается по умолчанию, но вообще всегда когда мы вызываем чарСиквенс, мы должны напечатать его, не забываем!
    }
}

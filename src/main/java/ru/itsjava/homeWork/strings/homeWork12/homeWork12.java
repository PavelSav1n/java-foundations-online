package ru.itsjava.homeWork.strings.homeWork12;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class homeWork12 {
    public static void main(String[] args) {

        String str = " Это строка ";

        // getBytes()
        // public byte[] getBytes(Charset charset)
        // Возвращает байтовый массив из входящей строки. Поскольку тут кириллица, то на каждый символ кроме пробелов тут у меня по два байта
        byte[] strGetBytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("Arrays.toString(strGetBytes) = " + Arrays.toString(strGetBytes));

        // length()
        // public int length()
        // Возвращает количество символов в строке (не больше int)
        System.out.println("str.length() = " + str.length());

        // public String[] split(String regex)
        // Возвращает массив строк, состоящий частей исходной строки, разделённой согласно входящему регулярному выражению
        String[] strSplit = str.split(" ");
        System.out.println("Arrays.toString(strSplit) = " + Arrays.toString(strSplit));

        // equals()
        // public boolean equals(Object anObject)
        // Возвращает boolean результат сравнения исходной строки и входящей.
        System.out.println("str.equals(\"Это строка\") = " + str.equals(" Это строка "));

        // equalsIgnoreCase()
        // public boolean equalsIgnoreCase(String anotherString)
        // Возвращает boolean результат сравнения исходной строки и входящей без учёта регистра.
        System.out.println("str.equalsIgnoreCase(\" это строка\") = " + str.equalsIgnoreCase(" это строка"));

        // toLowerCase()
        // public String toLowerCase(Locale locale)
        // Возвращает строку приведённую к нижнему регистру в зависимости от правил, соответствющих входящей локали (географическому региону)
        String strToLowerCase = str.toLowerCase(Locale.ROOT);
        System.out.println("strLowerCase = " + strToLowerCase);

        // toUpperCase()
        // public String toUpperCase(Locale locale)
        // Возвращает строку приведённую к верхнему регистру в зависимости от правил, соответствющих входящей локали
        String strToUpperCase = str.toUpperCase(Locale.ROOT);
        System.out.println("strToUpperCase = " + strToUpperCase);

        // toString()
        // public String toString()
        // Возвращает себя же (return this)
        str.toString();

        // isEmpty()
        // public boolean isEmpty()
        // Возвращает boolean результат сравнения длины строки с 0 (return value.length == 0;)
        str.isEmpty();

        // compareTo()
        // public int compareTo(String anotherString)
        // Возвращает int значение лексикографического сравнения исходной и входящей строк
        System.out.println("str.compareTo(\"Это строка \") = " + str.compareTo("Это строка "));

        // charAt()
        // public char charAt(int index)
        // Возвращает символ исходной строки в зависимости от входящего индекса
        System.out.println("str.charAt(1) = " + str.charAt(1));

        // intern()
        // public native String intern();
        // Возвращает строковое значение, добавив исходное в пул строк (если в пуле уже есть исходная строка, то возвращает ссылку на эту строку)
        String newStr = new String(" Это строка ");
        System.out.println("(str == newStr) = " + (str == newStr));
        String newStrAfterIntern = newStr.intern();
        System.out.println("(str == newStrAfterIntern) = " + (str == newStrAfterIntern));

        // concat()
        // public String concat(String str)
        // Возвращает строку конкатенированную входящей строкой
        System.out.println("str.concat(\"!\") = " + str.concat("!"));

        // contains()
        // public boolean contains(CharSequence s)
        // Возвращает boolean результат сравнения входящей строки и исходной
        System.out.println("str.contains(\"о\") = " + str.contains("о"));

        // codePointAt()
        // public int codePointAt(int index)
        // Возвращает значение int (unicode code unit) указанного входящего индекса у строки
        System.out.println("str.codePointAt(1) = " + str.codePointAt(1));

        // indexOf()
        // public int indexOf(String str)
        // Возвращает значение индекса входящего символа строки (-1 если такого символа в строке нет)
        System.out.println("str.indexOf(\"к\") = " + str.indexOf("к"));

        // indexOf()
        // public int indexOf(int ch)
        // Возвращает значение индекса входящего unicode code unit'а строки
        // UCU символа "т": "1090". Этот UCU находится на индексе 2:
        System.out.println("str.indexOf(1090) = " + str.indexOf(1090));

        // startsWith()
        // public boolean startsWith(String prefix, int toffset)
        // Возвращает boolean результат, начинается ли проверяемая строка с входящего символа, начиная с входящего индекса
        System.out.println("str.startsWith(\" \",2) = " + str.startsWith(" ", 2));

        // endsWith()
        // public boolean endsWith(String suffix)
        // Возвращает boolean результат, заканчивается ли проверяемая строка входящим символом (на самом деле используется startsWith())
        System.out.println("str.endsWith(\" \") = " + str.endsWith(" "));

        // getChars()
        // public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)
        // Посимвольно копирует выбранный диапазон символов из исходной строки в указанный массив, начиная с указанного индекса.
        char[] charArray = {36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36};
        System.out.println("Original charArray = " + Arrays.toString(charArray));
        str.getChars(1, 12, charArray, 2);
        System.out.println("After str.getChars = " + Arrays.toString(charArray));

        // repeat()
        // public String repeat(int count)
        // Возвращает строку, повторённую указанное int число раз
        System.out.println("str.repeat(3) = " + str.repeat(3));

        // replace()
        // public String replace(CharSequence target, CharSequence replacement)
        // Возвращает строку, с заменённой подстрокой
        System.out.println("str.replace(\"строка\", \"не строка (нет)\") = " + str.replace("строка", "не строка (нет)"));

        // strip()
        // Схожий функционал stripLeading(), stripTrailing()
        // public String strip()
        // Возвращает эту строку, с удалёнными с начала и конца "белыми пробелами".
        // Белые пробелы в java считаются следующие символы:
        //        It is a Unicode space character (SPACE_SEPARATOR, LINE_SEPARATOR, or PARAGRAPH_SEPARATOR) but is not also a non-breaking space ('\u00A0', '\u2007', '\u202F').
        //        It is '\t', U+0009 HORIZONTAL TABULATION.
        //        It is '\n', U+000A LINE FEED.
        //        It is '\u000B', U+000B VERTICAL TABULATION.
        //        It is '\f', U+000C FORM FEED.
        //        It is '\r', U+000D CARRIAGE RETURN.
        //        It is '\u001C', U+001C FILE SEPARATOR.
        //        It is '\u001D', U+001D GROUP SEPARATOR.
        //        It is '\u001E', U+001E RECORD SEPARATOR.
        //        It is '\u001F', U+001F UNIT SEPARATOR.
        System.out.println("str.strip() = " + str.strip());

        // trim()
        // Возвращает эту строку, с удалёнными с начала и конца пробелами. Пробелами считаются знаки чей code point равны или меньше 'U+0020'
        System.out.println("str.trim() = " + str.trim());

        // substring()
        // public String substring(int beginIndex, int endIndex)
        // Возвращает подстроку данной строки начиная и заканчивая заданными индексами
        System.out.println("str.substring(1,4) = " + str.substring(1, 4));

        // toCharArray()
        // public char[] toCharArray()
        // Возвращает массив, состоящий из символов данной строки:
        System.out.println("Arrays.toString(str.toCharArray()) = " + Arrays.toString(str.toCharArray()));

        /* ************************ */

        StringBuilder strBuilder = new StringBuilder(" Это тоже строка ");

        // append()
        // public StringBuilder append(String str)
        // Добавляет к исходной строке входящую строку:
        System.out.println("strBuilder.append(\"!\") = " + strBuilder.append("!"));

        // delete()
        // public StringBuilder delete(int start, int end)
        // Удаляет из исходной строки входящий диапазон индексов
        System.out.println("strBuilder.delete(4, 9) = " + strBuilder.delete(4, 9));

        // insert()
        // public StringBuilder insert(int offset, String str)
        // Добавляет к исходной строке начиная с входящего индекса входящую подстроку (так же можно int, double, char, char[] и т.п.)
        System.out.println("strBuilder.insert(4, \" вставленная\") = " + strBuilder.insert(4, " вставленная"));

        // replace()
        // public StringBuilder replace(int start, int end, String str)
        // Заменяет в исходной строке подстроку между начальным и конечным индексом, входящей подстрокой
        System.out.println("strBuilder.replace( 4,9, \" заменённая\") = " + strBuilder.replace(4, 9, " заменённая"));

        // reverse()
        // public StringBuilder reverse()
        // реализован в public AbstractStringBuilder reverse()
        // Инвертирует исходную строку (отражает по вертикали индексы)
        System.out.println("strBuilder.reverse() = " + strBuilder.reverse());


        // capacity()
        // public int capacity()
        // Возвращает текущий объём занимаемого пространства, который доступен для вставляемых символов.
        // Это объём, после превышения которого потребуется расширение пространства.
        System.out.println("strBuilder.capacity() = " + strBuilder.capacity());

        // setLength()
        // public void setLength(int newLength)
        // Задаёт новый размер последовательности символов, согласно заданному значению
        strBuilder.setLength(44);
        System.out.println("strBuilder.capacity() = " + strBuilder.capacity());
        System.out.println("strBuilder = " + strBuilder);

        // trimToSize()
        // public void trimToSize()
        // Попытка уменьшить занимаемый объём исходной строки:
        strBuilder.trimToSize();
        System.out.println("strBuilder.capacity() = " + strBuilder.capacity());
        System.out.println("strBuilder = " + strBuilder);

    }
}

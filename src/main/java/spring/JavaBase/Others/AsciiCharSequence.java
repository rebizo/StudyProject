package spring.JavaBase.Others;

import java.util.Arrays;

public final class AsciiCharSequence implements CharSequence {

    private byte[] example;

    public AsciiCharSequence(byte[] example) {
        this.example = example;
    }

    @Override
    public int length() {
        return example.length;
    }

    @Override
    public char charAt(int index) {
        return (char) example[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(example, start, end));
    }

    @Override
    public String toString() {
        return new String(example);
    }

    public static void main(String[] args) {

        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
        //проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!
    }
}

package spring.JavaBase.FileSystem.Streams;

import java.io.*;
import java.util.Arrays;

class Deserialize implements Serializable {

    private static final long serialVersionUID = 7064542192167295456L;
    private final String name;

    Deserialize(String name) {this.name = name;}

    @Override
    public String toString() {return "name: " + name;}

    static Deserialize[] deserializeAnimalArray(byte[] inpByteArray) {

        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(inpByteArray))) {

            int cnt = ois.readInt();
            Deserialize[] result = new Deserialize[cnt];

            for (int i = 0; i < cnt; i++) {
                result[i] = (Deserialize) ois.readObject();
                /*if (result[i] == null) {
                    throw new IllegalArgumentException();}*/
            }
            return result;

        } catch (ClassNotFoundException | ClassCastException | IOException cnfe) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {

        byte[] outByteArray = new byte[0];

        try ( ByteArrayOutputStream output = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(output)) {

            oos.writeInt(3);
            oos.writeObject(new Deserialize("Dog"));
            oos.writeObject(new Deserialize("Cat"));
            oos.writeObject(new Deserialize("Mouse"));

            //output.flush();
            outByteArray = output.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(outByteArray));
        Deserialize[] animals = deserializeAnimalArray(outByteArray);
        System.out.println(Arrays.toString(animals));
    }
}
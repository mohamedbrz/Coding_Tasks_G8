package daniel.week9;


import java.util.Arrays;
import java.util.stream.Stream;

public class concat2Arrays {
    //Write a return method that can concatenate two arrays

    public static void main(String[] args) {

        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {4, 5, 6, 10000, -54};

        String[] arr1 = {"dog", "cat", "mouse"};
        String[] arr2 = {"sun", "moon", "stars", "galaxy"};

        Double[] ar1 = {1.54, -2.43, 3.45};
        Double[] ar2 = {4.6, 5.131, 6.8797, 10000.3232, -54.000090};

        System.out.println(Arrays.toString(combineArrays(array1, array2)));

        System.out.println(Arrays.toString(combineArrays(arr1, arr2)));

        System.out.println(Arrays.toString(combineArrays(ar1, ar2)));

    }



public static Integer [] combineArrays (Integer [] arr1, Integer [] arr2){

    Stream<Integer> stream1 = Arrays.stream(arr1);
    Stream<Integer> stream2 = Arrays.stream(arr2);

    Stream<Integer> combinedStream = Stream.concat(stream1, stream2);

    Integer[] combinedArray = combinedStream.toArray(Integer[]::new);

    return combinedArray;

}

    public static String [] combineArrays (String [] arr1, String [] arr2){

        Stream<String> stream1 = Arrays.stream(arr1);
        Stream<String> stream2 = Arrays.stream(arr2);

        Stream<String> combinedStream = Stream.concat(stream1, stream2);

        String [] combinedArray = combinedStream.toArray(String[]::new);

        return combinedArray;

    }

    public static Double [] combineArrays (Double [] arr1, Double [] arr2){

        Stream<Double> stream1 = Arrays.stream(arr1);
        Stream<Double> stream2 = Arrays.stream(arr2);

        Stream<Double> combinedStream = Stream.concat(stream1, stream2);

        Double [] combinedArray = combinedStream.toArray(Double[]::new);

        return combinedArray;

    }
}
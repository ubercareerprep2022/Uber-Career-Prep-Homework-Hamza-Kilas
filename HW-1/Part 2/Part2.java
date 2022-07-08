import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Part2 {

    public boolean isStringPermutation(String s1, String s2){

        if (s1.length() != s2.length()){
            return false;
        }
    
        char arrayOfString1[] = s1.toCharArray();
        char arrayOfString2[] = s2.toCharArray();

        Arrays.sort(arrayOfString1);
        Arrays.sort(arrayOfString2);
 
        for (int i = 0; i < s1.length(); i++){
        if (arrayOfString1[i] != arrayOfString2[i]){
            return false;
        }}
        return true;
    }

    public List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum){
        List<List<Integer>> x = new ArrayList<>();

        for (int i = 0; i < inputArray.size(); i++) {
            for (int j = (i + 1); j < inputArray.size(); j++) {
                if (inputArray.get(i) + inputArray.get(j) == targetSum) { 
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(inputArray.get(i));
                    list.add(inputArray.get(j));
                    x.add(list);
                }
            }
        }
        return x;
    }
	public static void main(String[] args) {

        Part2 myObj = new Part2();
        System.out.println(myObj.isStringPermutation("asdf","fsda"));
        System.out.println(myObj.isStringPermutation("asdf","fsa"));
        System.out.println(myObj.isStringPermutation("asdf","fsax"));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(myObj.pairsThatEqualSum(list, 5));
        System.out.println(myObj.pairsThatEqualSum(list, 1));
        System.out.println(myObj.pairsThatEqualSum(list, 7));

    }}